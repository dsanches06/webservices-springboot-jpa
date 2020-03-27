package com.project.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springbootjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
