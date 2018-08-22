/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.telkom.www.Bank2WalletEmulator.utils.exceptions;

import org.springframework.http.HttpStatus;

/**
 *
 * @author Afro
 */
public class GeneralBadRequest extends Exception {
    
    private HttpStatus status;

    public GeneralBadRequest(String msg){
        super(msg);
    }
    
    public GeneralBadRequest(String msg, HttpStatus status){
        super(msg);
        this.status = status;
    }
    
    public GeneralBadRequest setHttpStatus(HttpStatus status){
        this.status = status;
        return this;                
    }
    
    public HttpStatus getHttpStatus(){
        return status;
    }
    
    
}