package com.webservicestest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicestest.course.entities.OrderItem;
import com.webservicestest.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
