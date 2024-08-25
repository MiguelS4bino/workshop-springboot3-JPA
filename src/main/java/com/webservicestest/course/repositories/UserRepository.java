package com.webservicestest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicestest.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
