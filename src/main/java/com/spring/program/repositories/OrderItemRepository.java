package com.spring.program.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.program.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
