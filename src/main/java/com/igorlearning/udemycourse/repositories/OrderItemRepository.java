package com.igorlearning.udemycourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorlearning.udemycourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
