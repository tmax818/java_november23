package co.tylermaxwell.logregprep.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import co.tylermaxwell.logregprep.models.LoginUser;
import co.tylermaxwell.logregprep.models.User;
import co.tylermaxwell.logregprep.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        // TO-DO: Additional validations!
         //TODO -  Reject if email is taken (present in database)

     
        
        //TODO -  Reject if password doesn't match confirmation
        
    
        
        //TODO -  Return null if result has errors

    
        //TODO -  Hash passowrd 
    
        
        //TODO set password
        

        //TODO - save user to database

        return null;
    }





    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
        
        //TODO Find user in the DB by email
      

        //TODO Reject if NOT present
        //TODO Reject if BCrypt password match fails
 
    
        //TODO  Return null if result has errors

        //TODO Otherwise, return the user object
        return null;
    }
}
