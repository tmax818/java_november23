package com.heidichen.securitydemo.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.heidichen.securitydemo.models.User;

@Component
public class UserValidator {

	public boolean supports(Class<?> c) {
		return User.class.equals(c);
	}

	// 2

	public void validate(Object object, Errors errors) {
		User user = (User) object;

		if (!user.getPasswordConfirmation().equals(user.getPassword())) {
			// 3
			errors.rejectValue("passwordConfirmation", "Match");
		}
	}
}
