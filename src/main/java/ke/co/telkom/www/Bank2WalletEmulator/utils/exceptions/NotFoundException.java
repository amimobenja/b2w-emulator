/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.telkom.www.Bank2WalletEmulator.utils.exceptions;

/**
 *
 * @author Afro
 */
public class NotFoundException  extends Exception{
    
    public NotFoundException(){
        super();
    }
    
    public NotFoundException(String message){
        super(message);
    }
}