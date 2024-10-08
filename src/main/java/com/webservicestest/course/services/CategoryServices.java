package com.webservicestest.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservicestest.course.entities.Category;
import com.webservicestest.course.repositories.CategoryRepository;

@Service
public class CategoryServices {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obg = repository.findById(id);
		return obg.get();
	}
}
