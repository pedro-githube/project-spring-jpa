package com.spring.program.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.program.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
