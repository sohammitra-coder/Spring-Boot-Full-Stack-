package com.shoesphere.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shoesphere.api.entity.Order;
import com.shoesphere.api.entity.User;
import com.shoesphere.api.service.OrderService;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "http://localhost:5173")
public class OrderController {
	@Autowired
	OrderService oservice;
	
	@GetMapping("/user/{userId}")
	public List<Order> getUserOrders(@PathVariable Long userId){
		return oservice.getUserOrders(userId);
	}
	@PutMapping("/{orderId}/status")
	public Order updateOrderStatus(@PathVariable Long orderId, @RequestParam String status) {
		return oservice.updateOrderStatus(orderId, status);
	}
}
