package com.igorlearning.udemycourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorlearning.udemycourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
