/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.telkom.www.Bank2WalletEmulator.services.implementor;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import ke.co.telkom.www.Bank2WalletEmulator.entities.B2WRequest;
import ke.co.telkom.www.Bank2WalletEmulator.entities.B2WResponse;
import ke.co.telkom.www.Bank2WalletEmulator.repositories.B2WRequestRepository;
import ke.co.telkom.www.Bank2WalletEmulator.repositories.B2WResponseRepository;
import ke.co.telkom.www.Bank2WalletEmulator.services.B2WServices;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author baamimo
 */

@Service
@Transactional
public class B2WServicesImplementor implements B2WServices {
    
    private B2WRequestRepository b2wReqRepo;
    private B2WResponseRepository b2wResRepo;
    
    @Value("${app.params.tcsrequest}")
    private String tcsrequest;
    @Value("${app.params.username}")
    private String uName;
    @Value("${app.params.userId}")
    private String userId;
    @Value("${app.params.terminalType}")
    private String terminalType;
    @Value("${app.params.password}")
    private String passW;
    @Value("${app.params.function}")
    private String func;
    @Value("${app.params.name}")
    private String name;
        
    @Value("${app.urls.telepin}")
    private String url;
    @Value("${app.contents.content}")
    private String content;
    @Value("${app.contents.type}")
    private String contType;
    @Value("${app.contents.byte}")
    private String cByte;
    
    public B2WServicesImplementor(B2WRequestRepository b2wReqRepo, B2WResponseRepository b2wResRepo) {
        this.b2wReqRepo = b2wReqRepo;
        this.b2wResRepo = b2wResRepo;
    }

    @Override
    public B2WRequest saveRequest(B2WRequest request) {
        return b2wReqRepo.save(request);
    }

    @Override
    public B2WResponse saveResponse(B2WResponse response) {
        return b2wResRepo.save(response);
    }

    @Override
    public Long countB2WRequests() {
        Long b2wReq = b2wReqRepo.count()+1;
        
        return b2wReq;
    }

    @Override
    public Map<Integer, String> sendRequest(BigDecimal requestId, String uname, String uId, String tType, String pass, String fnc, Map<String, String> params) {
        boolean sent = false;  
        
        Map<Integer, String> sentResponse = new LinkedHashMap<Integer, String>();
        
//        Preparing the XML Document
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
//            Setting the root elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement(tcsrequest);
            doc.appendChild(rootElement);

//             Add Username
            Element username = doc.createElement(uName);
            username.appendChild(doc.createTextNode(uname));
            rootElement.appendChild(username);

//             Add UserId
            Element userid = doc.createElement(userId);
            userid.appendChild(doc.createTextNode(uId));
            rootElement.appendChild(userid);


//             Add TerminalType
            Element terminaltype = doc.createElement(terminalType);
            terminaltype.appendChild(doc.createTextNode(tType));
            rootElement.appendChild(terminaltype);

//             Add Password
            Element password = doc.createElement(passW);
            password.appendChild(doc.createTextNode(pass));
            rootElement.appendChild(password);

//             Add Function
            Element function = doc.createElement(func);
//             Set Function attribute
            function.setAttribute(name, fnc);
            rootElement.appendChild(function);
            
            
            for(String key: params.keySet()) {                
                System.out.println(key + " - " + params.get(key));
                
//                Add Param to function
                Element param1 = doc.createElement(key);
                param1.appendChild(doc.createTextNode(params.get(key)));
                function.appendChild(param1);
            
            }
            
            ByteArrayOutputStream outputStream =  new ByteArrayOutputStream();
            Source xmlSource = new DOMSource(doc);

//            System.out.println(doc.toString());

            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.transform(xmlSource, result);

            System.out.println("Request: \n"+writer.toString());

            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost(url);
            post.setHeader(content, contType);
            HttpEntity entity = new ByteArrayEntity(writer.toString().getBytes(cByte));
            post.setEntity(entity);
            HttpResponse response = client.execute(post);
//            response.getStatusLine();

            System.out.println("Response: \n"+response.getStatusLine().getStatusCode());
//            InputStream content = response.getEntity().getContent();

            BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            String line = "";//br.readLine();
            StringBuffer rlt = new StringBuffer();
            while((line = br.readLine()) != null){
                rlt.append(line);
            }
            System.out.println(rlt.toString());
            
            Map<Integer, String> statusResponse = wasRequestSentSuccessfully(requestId, uname, uId, tType, fnc, rlt.toString());
                        
            int key = statusResponse.keySet().iterator().next();            
            String msg = statusResponse.get(key);
            
            if(key == 0){
                sent = true;                
                sentResponse.put(key, msg);
                System.out.println("Sent was successful "+msg);
            } else{                
                sentResponse.put(key, msg);
                System.out.println("Send Failed");
            }
            
            
        } catch (ParserConfigurationException ex) {
            System.out.println("--------- ParserConfigurationException ------- \n"+ex);
//            Logger.getLogger(B2WServicesImplementor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            System.out.println("--------- TransformerConfigurationException -------\n"+ex);
            Logger.getLogger(B2WServicesImplementor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            System.out.println("--------- TransformerException -------\n"+ex);
            //Logger.getLogger(B2WServicesImplementor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            System.out.println("--------- UnsupportedEncodingException -------\n"+ex);
            //Logger.getLogger(B2WServicesImplementor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("--------- IOException -------\n"+ex);
            //Logger.getLogger(B2WServicesImplementor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return sentResponse;
    }

    @Override
    public Map<Integer, String> wasRequestSentSuccessfully(BigDecimal requestId, String uname, String uId, String tType, String fnc, String data) {
        boolean status = false; 
        
        
        Map<Integer, String> sentResponse = new LinkedHashMap<Integer, String>();
        Map<String, String> params = new LinkedHashMap<String, String>();
        
        String result = "/TCSReply";
        String result_value = "";
        String message = "";
        
        try{
            
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            //System.out.println("\n Finished");

            dBuilder = dbFactory.newDocumentBuilder();
            InputStream stream = new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
            Document doc = dBuilder.parse(stream);
            doc.getDocumentElement().normalize();
            
            NodeList nodeList=doc.getElementsByTagName("*");

            for (int i = 0; i < nodeList.getLength(); i++) {
                
                Element element = (Element)nodeList.item(i);
                System.out.println(element.getNodeName());
                if (element.getNodeName().equals("Message")) {
                    message = element.getTextContent();
                } else if (element.getNodeName().equals("Result")) {
                    result_value = element.getTextContent();
                } else if (element.getNodeName().startsWith("param")) {                     
                    params.put(element.getNodeName(), element.getTextContent());
                }
                
            }
            
            B2WResponse b2wResp = new B2WResponse();
            
//            if (result_value.equals("0")) {
//                status = true;
//                
//                b2wResp.setRid(requestId);
//                b2wResp.setFunction(fnc);
//                b2wResp.setMessage(message);
//                b2wResp.setTerminaltype(tType);
//                b2wResp.setUserid(uId);
//                b2wResp.setUsername(uname);
//
//                StringBuffer responseParams = new StringBuffer();
//                
//                for(String key: params.keySet()) {
//                    responseParams.append(key).append(" - ").append(params.get(key)).append(" \n");                                    
//                }
//                
//                String respParams = String.valueOf(responseParams);
//                b2wResp.setAllparam(respParams);
//                
//                b2wResRepo.save(b2wResp);
//                
//                sentResponse.put(Integer.parseInt(result_value), message);
//                
//            }  


                b2wResp.setRid(requestId);
                b2wResp.setFunction(fnc);
                b2wResp.setMessage(message);
                b2wResp.setTerminaltype(tType);
                b2wResp.setUserid(uId);
                b2wResp.setUsername(uname);

                StringBuffer responseParams = new StringBuffer();
                
                for(String key: params.keySet()) {
                    responseParams.append(key).append(" - ").append(params.get(key)).append(" \n");                                    
                }
                
                String respParams = String.valueOf(responseParams);
                b2wResp.setAllparam(respParams);
                
                b2wResRepo.save(b2wResp);
                
                sentResponse.put(Integer.parseInt(result_value), message);
            
        } catch (ParserConfigurationException pce) {
            //returnValue = pce.getMessage();
            System.out.println(pce.getMessage());
        } catch (SAXException se) {
            //returnValue += se.getMessage();
            System.out.println(se.getMessage());
        }catch (IOException ioe) {
            //returnValue += ioe.getMessage();
            System.out.println(ioe.getMessage());
        }
        //returnValue += xpe.getMessage();
        
        return sentResponse;
    }

    @Override
    public B2WResponse returnB2WResponse(B2WResponse response) {
        return response;
    }
    
}
