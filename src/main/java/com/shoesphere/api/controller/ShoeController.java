package com.shoesphere.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoesphere.api.entity.Shoe;
import com.shoesphere.api.service.ShoeService;

@RestController
@RequestMapping("/api/shoes")
public class ShoeController {
	@Autowired
	ShoeService shoeService;
	@GetMapping("/getShoesList")
	public List<Shoe> getAllShoesList(){
		return shoeService.getAllShoes();
	}
	@GetMapping("/getById/{id}")
	public Shoe getById(@PathVariable Long id) {
		return shoeService.getShoeById(id);
	}
	@PostMapping("/addShoes")
	public String addShoe(@RequestBody Shoe shoe) {
		shoeService.addShoe(shoe);
		return "Shoe details added successfully!";
	}
	@PutMapping("/updateShoes/{id}")
	public String updateShoe(@PathVariable Long id, @RequestBody Shoe shoe) {
		shoeService.updateShoe(id,shoe);
		return "Shoe details updated successfully!";
	}
	@DeleteMapping("/deleteShoes/{id}")
	public String deleteShoe(@PathVariable Long id) {
		shoeService.deleteShoe(id);
		return "Deleted Successfully!";
	}
}
