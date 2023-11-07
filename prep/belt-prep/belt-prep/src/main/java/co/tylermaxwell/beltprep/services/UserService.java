package co.tylermaxwell.beltprep.services;

import java.util.Optional;

import javax.swing.text.html.Option;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import co.tylermaxwell.beltprep.models.LoginUser;
import co.tylermaxwell.beltprep.models.User;
import co.tylermaxwell.beltprep.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        // TO-DO: Additional validations!
         //TODO -  Reject if email is taken (present in database)
        if(userRepository.findByEmail(newUser.getEmail()).isPresent()){
            result.rejectValue("email", "Email", "What are you doing!!! You already regestered");
        }
     
        
        //TODO -  Reject if password doesn't match confirmation
        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("password", "Password", "Dude, learn to type!!! Your passwords don't match!!");
        }
        
    
        
        //TODO -  Return null if result has errors
        if(result.hasErrors()){
            return null;
        }

    
        //TODO -  Hash passowrd 
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        System.out.println(hashed);
    
        
        //TODO set password

        newUser.setPassword(hashed);
        

        //TODO - save user to database

        return userRepository.save(newUser);
    
    }





    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
        System.out.println(newLoginObject);
        
        //TODO Find user in the DB by email
        Optional<User> user = userRepository.findByEmail(newLoginObject.getEmail());

        //TODO Reject if NOT present
        //TODO Reject if BCrypt password match fails
        if(!user.isPresent()){
            result.rejectValue("email", "logEmail", "invalid credentials");
        } else if (!BCrypt.checkpw(newLoginObject.getPassword(), user.get().getPassword())){
            result.rejectValue("password", "logPassword", "invalid credentials");
        }
 
    
        //TODO  Return null if result has errors
        if(result.hasErrors()){
            return null;
        }

        //TODO Otherwise, return the user object
        return user.get();
    }





    public User getOneUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }
}
