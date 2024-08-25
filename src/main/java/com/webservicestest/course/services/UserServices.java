package com.webservicestest.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservicestest.course.entities.User;
import com.webservicestest.course.repositories.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obg = repository.findById(id);
		return obg.get();
	}
}
