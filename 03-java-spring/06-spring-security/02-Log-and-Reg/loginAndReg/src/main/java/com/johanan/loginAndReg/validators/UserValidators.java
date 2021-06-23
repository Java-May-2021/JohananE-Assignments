package com.johanan.loginAndReg.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.johanan.loginAndReg.models.User;
import com.johanan.loginAndReg.repositories.UserRepository;

@Component
public class UserValidators {
	@Autowired
	private UserRepository uRepo;
	
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		if(!user.getPassword().equals(user.getPasswordConfirmation())) {
			errors.rejectValue("password", "Match", "Passwords do not match!!");
		}
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "Email exists in database.");
		}
	}
}
