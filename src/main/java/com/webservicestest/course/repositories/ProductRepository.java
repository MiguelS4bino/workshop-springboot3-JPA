package com.webservicestest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicestest.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
