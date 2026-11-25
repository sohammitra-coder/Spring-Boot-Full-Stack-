package com.shoesphere.api.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoesphere.api.entity.OrderItem;
import com.shoesphere.api.repository.OrderItemRepository;
import com.shoesphere.api.service.OrderItemService;
@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    OrderItemRepository oirepo;
	public OrderItem addOrderItem(OrderItem orderItem) {
		return oirepo.save(orderItem);
	}

	
	public List<OrderItem> getOrderItemsByOrderId(Long orderId) {
		return oirepo.findByOrder_OrderId(orderId);
	}

	
	public void deleteOrderItem(Long orderItemId) {
		oirepo.deleteById(orderItemId);
	}

}
