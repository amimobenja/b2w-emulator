/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.telkom.www.Bank2WalletEmulator.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.validation.Valid;
import ke.co.telkom.www.Bank2WalletEmulator.entities.B2WRequest;
import ke.co.telkom.www.Bank2WalletEmulator.entities.Menus;
import ke.co.telkom.www.Bank2WalletEmulator.services.B2WServices;
import ke.co.telkom.www.Bank2WalletEmulator.utils.ResponseWrapper;
import ke.co.telkom.www.Bank2WalletEmulator.utils.SharedMethods;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ReflectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author baamimo
 */
    
@RestController
@Api(value = "B2W Emulator")
public class B2WController {
    
    private final B2WServices b2wServ;
    
    @Value("${app.params.param}")
    private String param;
    
    public B2WController(B2WServices b2wServ) {
        this.b2wServ = b2wServ;
    }
    
    
    @ApiOperation(value = "Fetch Menus", notes = "Used to fetch a Users Menus")
    @RequestMapping(value = "get_menus/{email:.+}", method = RequestMethod.GET)
    public ResponseEntity<ResponseWrapper> fetchEcommUser(@PathVariable("email") String email) {
        ResponseWrapper response = new ResponseWrapper();
        
        ArrayList<Menus> mnLst = new ArrayList();
        
        for (int i = 0; i<=20; i++) {
                    
            Menus mnu = new Menus();        
            mnu.setDescription("Test - "+i);
            mnu.setRoutepath("/test/test_route_"+i);
            
            mnLst.add(mnu);
        
        }
                
        response.setData(mnLst);
        return new ResponseEntity(response, HttpStatus.OK);
    }
    
    /**
     *
     * @param b2wReq
     * @param validation
     * @return
     */
    @ApiOperation(value = "Send Request and View Response", notes = "Used to send request and receive response from Telepin")
    @ApiResponse(code = 400, message = "Mostly when validation errors are encountered")
    @RequestMapping(value = "send", method = RequestMethod.POST)
    public ResponseEntity<ResponseWrapper> sendRequest(@ApiParam(value = "Ignore status and request sent")
            @Valid @RequestBody B2WRequest b2wReq, BindingResult validation) {
        
        ResponseWrapper response = new ResponseWrapper();        
        
        if (validation.hasErrors()) {
            
            response.setCode(400);
            response.setMessage("Request was not successful");
            response.setData(SharedMethods.getFieldMapErrors(validation));
            return new ResponseEntity(response, HttpStatus.BAD_REQUEST);            
        }   
        
        Map<String, String> params = new LinkedHashMap<>();
        
        ReflectionUtils.doWithFields(b2wReq.getClass(), field -> {            
            
            field.setAccessible(true);
            if (field.get(b2wReq) != null  && field.getName().startsWith(param)) {
                                
                System.out.println("Field name: " + field.getName());
                System.out.println("Field value: "+ field.get(b2wReq));
                
                params.put(SharedMethods.capitalizeFirstCharacter(field.getName()), String.valueOf(field.get(b2wReq))); 
            }
            
        });
        
        BigDecimal reqId = BigDecimal.valueOf(b2wServ.countB2WRequests());
                
        b2wReq.setRid(reqId);
        b2wReq.setUsername(b2wReq.getUsername());
        b2wReq.setUserid(b2wReq.getUserid());
        b2wReq.setFunction(b2wReq.getFunction());
        b2wReq.setTerminaltype(b2wReq.getTerminaltype());        
        
        b2wReq.setParam1(b2wReq.getParam1());
        b2wReq.setParam2(b2wReq.getParam2());
        b2wReq.setParam3(b2wReq.getParam3());
        b2wReq.setParam4(b2wReq.getParam4());
        b2wReq.setParam5(b2wReq.getParam5());
        b2wReq.setParam6(b2wReq.getParam6());
        b2wReq.setParam7(b2wReq.getParam7());
        b2wReq.setParam8(b2wReq.getParam8());
        b2wReq.setParam9(b2wReq.getParam9());
        b2wReq.setParam10(b2wReq.getParam10());
        b2wReq.setParam11(b2wReq.getParam11());
        b2wReq.setParam12(b2wReq.getParam12());
        b2wReq.setParam13(b2wReq.getParam13());
        b2wReq.setParam14(b2wReq.getParam14());
        b2wReq.setParam15(b2wReq.getParam15());
        b2wReq.setParam16(b2wReq.getParam16());
        b2wReq.setParam17(b2wReq.getParam17());
        b2wReq.setParam18(b2wReq.getParam18());
        b2wReq.setParam19(b2wReq.getParam19());
        b2wReq.setParam20(b2wReq.getParam20());
        b2wReq.setParam21(b2wReq.getParam21());
        b2wReq.setParam22(b2wReq.getParam22());
        b2wReq.setParam23(b2wReq.getParam23());
        b2wReq.setParam24(b2wReq.getParam24());
        b2wReq.setParam25(b2wReq.getParam25());
        b2wReq.setParam26(b2wReq.getParam26());
        b2wReq.setParam27(b2wReq.getParam27());
        b2wReq.setParam28(b2wReq.getParam28());
        b2wReq.setParam29(b2wReq.getParam29());
        b2wReq.setParam30(b2wReq.getParam30());
        b2wReq.setParam31(b2wReq.getParam31());
        b2wReq.setParam32(b2wReq.getParam32());
        b2wReq.setParam33(b2wReq.getParam33());
        b2wReq.setParam34(b2wReq.getParam34());
        b2wReq.setParam35(b2wReq.getParam35());
        b2wReq.setParam36(b2wReq.getParam36());
        b2wReq.setParam37(b2wReq.getParam37());
        b2wReq.setParam38(b2wReq.getParam38());
        b2wReq.setParam39(b2wReq.getParam39());
        b2wReq.setParam40(b2wReq.getParam40());
        b2wReq.setParam41(b2wReq.getParam41());
        b2wReq.setParam42(b2wReq.getParam42());
        b2wReq.setParam43(b2wReq.getParam43());
        b2wReq.setParam44(b2wReq.getParam44());
        b2wReq.setParam45(b2wReq.getParam45());
        b2wReq.setParam46(b2wReq.getParam46());
        b2wReq.setParam47(b2wReq.getParam47());
        b2wReq.setParam48(b2wReq.getParam48());
        b2wReq.setParam49(b2wReq.getParam49());
        b2wReq.setParam50(b2wReq.getParam50());
        b2wReq.setParam51(b2wReq.getParam51());
        b2wReq.setParam52(b2wReq.getParam52());
        b2wReq.setParam53(b2wReq.getParam53());
        b2wReq.setParam54(b2wReq.getParam54());
        b2wReq.setParam55(b2wReq.getParam55());
        b2wReq.setParam56(b2wReq.getParam56());
        b2wReq.setParam57(b2wReq.getParam57());
        b2wReq.setParam58(b2wReq.getParam58());
        b2wReq.setParam59(b2wReq.getParam59());
        b2wReq.setParam60(b2wReq.getParam60());
        b2wReq.setParam61(b2wReq.getParam61());
        b2wReq.setParam62(b2wReq.getParam62());
        b2wReq.setParam63(b2wReq.getParam63());
        b2wReq.setParam64(b2wReq.getParam64());
        b2wReq.setParam65(b2wReq.getParam65());
        b2wReq.setParam66(b2wReq.getParam66());
        b2wReq.setParam67(b2wReq.getParam67());
        b2wReq.setParam68(b2wReq.getParam68());
        b2wReq.setParam69(b2wReq.getParam69());
        b2wReq.setParam70(b2wReq.getParam70());
        b2wReq.setParam71(b2wReq.getParam71());
        b2wReq.setParam72(b2wReq.getParam72());
        b2wReq.setParam73(b2wReq.getParam73());
        b2wReq.setParam74(b2wReq.getParam74());
        b2wReq.setParam75(b2wReq.getParam75());
        b2wReq.setParam76(b2wReq.getParam76());
        b2wReq.setParam77(b2wReq.getParam77());
        b2wReq.setParam78(b2wReq.getParam78());
        b2wReq.setParam79(b2wReq.getParam79());
        b2wReq.setParam80(b2wReq.getParam80());
        
        b2wReq.setParam81(b2wReq.getParam81());
        b2wReq.setParam82(b2wReq.getParam82());
        b2wReq.setParam83(b2wReq.getParam83());
        b2wReq.setParam84(b2wReq.getParam84());
        b2wReq.setParam85(b2wReq.getParam85());
        b2wReq.setParam86(b2wReq.getParam86());
        b2wReq.setParam87(b2wReq.getParam87());
        b2wReq.setParam88(b2wReq.getParam88());
        b2wReq.setParam89(b2wReq.getParam89());
        
        b2wReq.setParam90(b2wReq.getParam90());
        b2wReq.setParam91(b2wReq.getParam91());
        b2wReq.setParam92(b2wReq.getParam92());
        b2wReq.setParam93(b2wReq.getParam93());
        b2wReq.setParam94(b2wReq.getParam94());
        b2wReq.setParam95(b2wReq.getParam95());
        b2wReq.setParam96(b2wReq.getParam96());
        b2wReq.setParam97(b2wReq.getParam97());
        b2wReq.setParam98(b2wReq.getParam98());
        b2wReq.setParam99(b2wReq.getParam99());
        
        
        b2wReq.setParam100(b2wReq.getParam100());
        b2wReq.setParam101(b2wReq.getParam101());
        b2wReq.setParam102(b2wReq.getParam102());
        b2wReq.setParam103(b2wReq.getParam103());
        b2wReq.setParam104(b2wReq.getParam104());
        b2wReq.setParam105(b2wReq.getParam105());
        b2wReq.setParam106(b2wReq.getParam106());
        b2wReq.setParam107(b2wReq.getParam107());
        b2wReq.setParam108(b2wReq.getParam108());
        b2wReq.setParam109(b2wReq.getParam109());
        
        b2wReq.setParam110(b2wReq.getParam110());
        b2wReq.setParam111(b2wReq.getParam111());
        b2wReq.setParam112(b2wReq.getParam112());
        b2wReq.setParam113(b2wReq.getParam113());
        b2wReq.setParam114(b2wReq.getParam114());
        b2wReq.setParam115(b2wReq.getParam115());
        b2wReq.setParam116(b2wReq.getParam116());
        b2wReq.setParam117(b2wReq.getParam117());
        b2wReq.setParam118(b2wReq.getParam118());
        b2wReq.setParam119(b2wReq.getParam119());
        b2wReq.setParam120(b2wReq.getParam120());
        b2wReq.setParam121(b2wReq.getParam121());
        b2wReq.setParam122(b2wReq.getParam122());
        b2wReq.setParam123(b2wReq.getParam123());
        b2wReq.setParam124(b2wReq.getParam124());
        b2wReq.setParam125(b2wReq.getParam125());
        b2wReq.setParam126(b2wReq.getParam126());
        b2wReq.setParam127(b2wReq.getParam127());
        b2wReq.setParam128(b2wReq.getParam128());
        b2wReq.setParam129(b2wReq.getParam129());
        b2wReq.setParam130(b2wReq.getParam130());
        b2wReq.setParam131(b2wReq.getParam131());
        b2wReq.setParam132(b2wReq.getParam132());
        b2wReq.setParam133(b2wReq.getParam133());
        b2wReq.setParam134(b2wReq.getParam134());
        b2wReq.setParam135(b2wReq.getParam135());
        b2wReq.setParam136(b2wReq.getParam136());
        b2wReq.setParam137(b2wReq.getParam137());
        b2wReq.setParam138(b2wReq.getParam138());
        b2wReq.setParam139(b2wReq.getParam139());
        b2wReq.setParam140(b2wReq.getParam140());
        b2wReq.setParam141(b2wReq.getParam141());
        b2wReq.setParam142(b2wReq.getParam142());
        b2wReq.setParam143(b2wReq.getParam143());
        b2wReq.setParam144(b2wReq.getParam144());
        b2wReq.setParam145(b2wReq.getParam145());
        b2wReq.setParam146(b2wReq.getParam146());
        b2wReq.setParam147(b2wReq.getParam147());
        b2wReq.setParam148(b2wReq.getParam148());
        b2wReq.setParam149(b2wReq.getParam149());
        b2wReq.setParam150(b2wReq.getParam150());
        b2wReq.setParam151(b2wReq.getParam151());
        b2wReq.setParam152(b2wReq.getParam152());
        b2wReq.setParam153(b2wReq.getParam153());
        b2wReq.setParam154(b2wReq.getParam154());
        b2wReq.setParam155(b2wReq.getParam155());
        
        b2wServ.saveRequest(b2wReq);
        
            
        
        Map<Integer, String> status = b2wServ.sendRequest(reqId, b2wReq.getUsername(), b2wReq.getUserid(), b2wReq.getTerminaltype(), 
            b2wReq.getPassword(), b2wReq.getFunction(), params);
                
        int key = status.keySet().iterator().next();            
        String msg = status.get(key);
        
        response.setMessage("Result - "+key+"\nMessage - "+msg);
            
        if (key != 0) {            
            response.setCode(504);
            response.setMessage("Request was NOT successful. Connection timeout.");
            return new ResponseEntity(response, HttpStatus.GATEWAY_TIMEOUT); 
        }                 
        
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
        
    
    
}
