package com.shoesphere.api.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoesphere.api.entity.User;
import com.shoesphere.api.repository.UserRepository;
import com.shoesphere.api.service.UserService;

import jakarta.servlet.http.HttpSession;
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
	@Override
	public User loginUser(String email, String password, HttpSession session) {
		User user=urepo.findByEmail(email).orElseThrow(()->new RuntimeException("User Not Found!"));
		if(!user.getPassword().equals(password))
			throw new RuntimeException("Wrong Credentials");
		session.setAttribute("uname",user.getName());
		session.setAttribute("uemail",user.getEmail());
		session.setAttribute("uphone",user.getPhone());
		return user;
	}
	@Override
	public void logoutUser(HttpSession session) {
		session.removeAttribute("uname");
		session.removeAttribute("uemail");
		session.removeAttribute("uphone");
		session.invalidate();
	}
}
