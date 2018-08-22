/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.telkom.www.Bank2WalletEmulator.repositories;

import ke.co.telkom.www.Bank2WalletEmulator.entities.B2WRequest;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author baamimo
 */
public interface B2WRequestRepository extends CrudRepository<B2WRequest, Integer> {
    
}
