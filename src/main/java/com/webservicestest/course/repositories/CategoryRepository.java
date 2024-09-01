package com.webservicestest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicestest.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
