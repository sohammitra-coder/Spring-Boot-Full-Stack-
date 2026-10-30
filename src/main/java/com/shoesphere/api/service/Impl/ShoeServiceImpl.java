package com.shoesphere.api.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoesphere.api.entity.Shoe;
import com.shoesphere.api.repository.ShoeRepository;
import com.shoesphere.api.service.ShoeService;
@Service
public class ShoeServiceImpl implements ShoeService {
    @Autowired
    ShoeRepository srepo;
	public List<Shoe> getAllShoes() {
		return srepo.findAll();
	}

	public Shoe getShoeById(Long id) {
		return srepo.findById(id).orElseThrow();
	}

	public void addShoe(Shoe shoe) {
		srepo.save(shoe);
	}

	public void updateShoe(Long id, Shoe shoe) {
		Shoe existingShoe=srepo.findById(id).orElse(null);
		if(existingShoe!=null)
		{
			existingShoe.setName(shoe.getName());
			existingShoe.setBrand(shoe.getBrand());
			existingShoe.setCategory(shoe.getCategory());
			existingShoe.setGender(shoe.getGender());
			existingShoe.setPrice(shoe.getPrice());
			existingShoe.setColor(shoe.getColor());
			existingShoe.setSize(shoe.getSize());
			existingShoe.setMaterial(shoe.getMaterial());
			existingShoe.setStock(shoe.getStock());
			existingShoe.setDescription(shoe.getDescription());
			existingShoe.setImageUrl(shoe.getImageUrl());
			
			 srepo.save(existingShoe);
		}
	}

	public void deleteShoe(Long id) {
		srepo.deleteById(id);
	}
}
