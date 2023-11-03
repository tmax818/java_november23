package co.tylermaxwell.logregprep.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import co.tylermaxwell.logregprep.models.LoginUser;
import co.tylermaxwell.logregprep.models.User;
import co.tylermaxwell.logregprep.repositories.UserRepository;
import jakarta.servlet.http.HttpSession;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {

    	//Reject values or register if no errors:
        
        //TODO -  Reject if email is taken (present in database)

        if(userRepository.findByEmail(newUser.getEmail()).isPresent()){
            result.rejectValue("email", "Email", "Dude, you've already registered!!!");
        }
        
        //TODO -  Reject if password doesn't match confirmation
        
        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("password", "Password", "Dude, you mistyped your damn password");
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
        
        //Reject values:
        
    	//TODO Find user in the DB by email
        Optional<User> user = userRepository.findByEmail(newLoginObject.getEmail());

        //TODO Reject if NOT present
        //TODO Reject if BCrypt password match fails
        if(!user.isPresent()){
            result.rejectValue("email", "LogEmail", "invalid credentials");
        } else if(!BCrypt.checkpw(newLoginObject.getPassword(), user.get().getPassword())){
            result.rejectValue("password", "logPassword", "invalid credentials");
        }
    
        //TODO  Return null if result has errors

        if(result.hasErrors()){
            return null;
        }
        //TODO Otherwise, return the user object

        return user.get();
    }

}
