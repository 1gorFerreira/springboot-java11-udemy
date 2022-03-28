package com.igorlearning.udemycourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorlearning.udemycourse.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{

}
