/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.telkom.www.Bank2WalletEmulator.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Afro
 */
@Component
public class SharedMethods {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    
    /*@Value("${app.template.uploadPath}")
    private String uploadPath;   */ 
    
    private DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    

    /**
     * Used to get all errors each mapped to the relevant field. Quiet handy
     * when returning api error responses
     *
     * @param validation
     * @return a {@link Map} of all errors
     */
    public static Map<String, String> getFieldMapErrors(BindingResult validation) {
        return validation.getFieldErrors().stream().collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
    }

    /**
     * Used to fetch current date. At a later stage it may be to a relevant
     * timezone
     *
     * @return current date
     */
    public static Date currentDate() {
        return new Date();
    }

    /**
     * Used to Read MultipartFile resource e.g a CSV file
     * @param resource MultipartFile resource to be read
     * @throws FileNotFoundException, IOException when errors occur searching for the file or reading the file
     *
     * @param resource
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    /*public String store(MultipartFile resource) throws FileNotFoundException, IOException {
        log.info("Processing file storage for file " + resource.getOriginalFilename());
        
        String fileUrl = uploadPath + sdf.format(new Date()) + " " + resource.getOriginalFilename();
        BufferedOutputStream stream
                = new BufferedOutputStream(new FileOutputStream(new File(fileUrl)));
        stream.write(resource.getBytes());
        stream.close();
        return fileUrl;
    }*/
    
    
    public static String capitalizeFirstCharacter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
}

