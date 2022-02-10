package com.spring.program.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.program.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
