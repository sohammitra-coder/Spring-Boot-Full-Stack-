package com.shoesphere.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoesphere.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
