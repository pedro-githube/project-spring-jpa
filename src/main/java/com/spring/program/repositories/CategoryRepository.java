package com.spring.program.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.program.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
