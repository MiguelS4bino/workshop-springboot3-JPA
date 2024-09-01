package com.webservicestest.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservicestest.course.entities.Product;
import com.webservicestest.course.repositories.ProductRepository;

@Service
public class ProductServices {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obg = repository.findById(id);
		return obg.get();
	}
}
