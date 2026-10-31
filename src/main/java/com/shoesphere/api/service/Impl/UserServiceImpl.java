package com.shoesphere.api.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoesphere.api.entity.User;
import com.shoesphere.api.repository.UserRepository;
import com.shoesphere.api.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository urepo;
	public User registerUser(User user) {
		Optional<User> existingUser=urepo.findByEmail(user.getEmail());
		if(existingUser.isPresent()) {
			throw new RuntimeException("Email already Registered!"); 
		}
		return urepo.save(user);
	}

}
