/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.telkom.www.Bank2WalletEmulator.services;

import java.math.BigDecimal;
import java.util.Map;
import ke.co.telkom.www.Bank2WalletEmulator.entities.B2WRequest;
import ke.co.telkom.www.Bank2WalletEmulator.entities.B2WResponse;

/**
 *
 * @author baamimo
 */
public interface B2WServices {
    
    public B2WRequest saveRequest(B2WRequest request);    
    
    public B2WResponse saveResponse(B2WResponse response);
    
    public Map<Integer, String> sendRequest(BigDecimal requestId, String username, String userId, String terminalType, String password, String function, Map<String, String> params);
    
    public Map<Integer, String> wasRequestSentSuccessfully(BigDecimal requestId, String username, String userId, String terminalType, String function, String data);
        
    public Long countB2WRequests();
    
    public B2WResponse returnB2WResponse(B2WResponse response);
    
}
