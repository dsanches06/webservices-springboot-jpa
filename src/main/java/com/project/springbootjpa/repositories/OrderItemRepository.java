package com.project.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springbootjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
