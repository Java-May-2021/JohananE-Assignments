package com.johanan.loginAndReg.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johanan.loginAndReg.models.User;
import com.johanan.loginAndReg.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	

	public User registerUser(User user) {
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hash);
		return this.userRepo.save(user);
	}
	public User findOneId(Long id) {
		return this.userRepo.findById(id).orElse(null);
	}
	public boolean authenticate(String email, String password) {
		User user = this.userRepo.findByEmail(email);
		if(user == null) {
			return false;
		}
		return BCrypt.checkpw(password, user.getPassword());
	}
	public User getByEmail(String email) {
		return this.userRepo.findByEmail(email);
	}
}
