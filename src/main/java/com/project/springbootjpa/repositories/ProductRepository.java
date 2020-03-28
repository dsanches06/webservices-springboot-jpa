package com.project.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springbootjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
