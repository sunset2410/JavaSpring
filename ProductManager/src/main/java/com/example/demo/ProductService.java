package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {	
	@Autowired
	private ProductREpository repo;
	
	public List<Product> listAll(){
		return repo.findAll();
	}
	
	
	public void save(Product pd) {
		repo.save(pd);
	}
	
	public Product get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
}
