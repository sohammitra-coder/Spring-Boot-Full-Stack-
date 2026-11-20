package com.shoesphere.api.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoesphere.api.entity.Order;
import com.shoesphere.api.repository.OrderRepository;
import com.shoesphere.api.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orepo;
	public Order placeOrder(Long userId) {
		
		return null;
	}

	
	public List<Order> getUserOrders(Long userId) {
		return orepo.findByUser_Id(userId);
	}

	
	public Order updateOrderStatus(Long orderId, String status) {
		Order order=orepo.findById(orderId).orElseThrow(()->new RuntimeException("Order not Found!"));
		order.setStatus(status);
		return orepo.save(order);
	}

}
