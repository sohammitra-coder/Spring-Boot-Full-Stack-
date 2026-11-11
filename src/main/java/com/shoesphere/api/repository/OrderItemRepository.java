package com.shoesphere.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoesphere.api.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
