package com.webservicestest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicestest.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
