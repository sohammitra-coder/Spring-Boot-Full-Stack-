package com.shoesphere.api.service;

import java.util.List;

import com.shoesphere.api.entity.Shoe;

public interface ShoeService {
	List<Shoe> getAllShoes();
	Shoe getShoeById(Long id);
	void addShoe(Shoe shoe);
	void updateShoe(Long id, Shoe shoe);
	void deleteShoe(Long id);
}
