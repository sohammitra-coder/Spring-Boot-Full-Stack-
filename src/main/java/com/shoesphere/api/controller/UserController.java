package com.shoesphere.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoesphere.api.entity.User;
import com.shoesphere.api.service.UserService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	UserService uservice;
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		uservice.registerUser(user);
		return "User Registered Successfully!";
	}
	@PostMapping("/login")
	public User login(@RequestBody User user,HttpSession session) {
		return uservice.loginUser(user.getEmail(), user.getPassword(), session);
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		uservice.logoutUser(session);
		return "Sesion Logged out Successfully!";
	}
	
}
