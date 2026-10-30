package com.shoesphere.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoesphere.api.entity.Shoe;

public interface ShoeRepository extends JpaRepository<Shoe, Long> {

}
