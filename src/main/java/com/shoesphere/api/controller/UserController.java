package com.shoesphere.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoesphere.api.entity.User;
import com.shoesphere.api.service.UserService;

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
}
