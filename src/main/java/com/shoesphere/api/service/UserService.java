package com.shoesphere.api.service;

import com.shoesphere.api.entity.User;

import jakarta.servlet.http.HttpSession;

public interface UserService {
	public User registerUser(User user);
	public User loginUser(String email, String password,HttpSession session);
}