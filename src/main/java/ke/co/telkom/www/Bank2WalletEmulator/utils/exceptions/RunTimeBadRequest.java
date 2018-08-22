/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.telkom.www.Bank2WalletEmulator.utils.exceptions;

/**
 *
 * @author Afro
 *
 * Used to throw bad requests that occur during runtime
 */
public class RunTimeBadRequest extends RuntimeException {

    public RunTimeBadRequest(){
        super();
    }
    
    public RunTimeBadRequest(String msg){
        super(msg);
    }
}
