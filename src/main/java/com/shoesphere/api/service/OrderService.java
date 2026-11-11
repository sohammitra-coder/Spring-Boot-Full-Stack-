package com.shoesphere.api.service;

import java.util.List;

import com.shoesphere.api.entity.Order;

public interface OrderService {
	Order placeOrder(Long userId);
	List<Order> getUserOrders(Long userId);
	Order updateOrderStatus(Long orderId, String status);
}
