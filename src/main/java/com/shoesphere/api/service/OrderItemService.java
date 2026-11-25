package com.shoesphere.api.service;

import java.util.List;

import com.shoesphere.api.entity.OrderItem;

public interface OrderItemService {
	public OrderItem addOrderItem(OrderItem orderItem);
	List<OrderItem> getOrderItemsByOrderId(Long orderId);
	public void deleteOrderItem(Long orderItemId);
}
