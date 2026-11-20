package com.shoesphere.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoesphere.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	List<Order> findByUser_Id(Long userId);
	List<Order> findByStatus(String status);
}
