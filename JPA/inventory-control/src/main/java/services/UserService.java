package services;

import generics.GenericService;
import jakarta.ejb.Stateless;
import models.Users;

/**
 *
 * @author dougl
 */

@Stateless
public class UserService extends GenericService<Users> {
    
    public UserService() {
        super(Users.class);
    }
    
}
