package com.igorlearning.udemycourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorlearning.udemycourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
