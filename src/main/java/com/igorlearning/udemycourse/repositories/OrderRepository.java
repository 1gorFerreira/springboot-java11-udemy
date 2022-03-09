package com.igorlearning.udemycourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorlearning.udemycourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
