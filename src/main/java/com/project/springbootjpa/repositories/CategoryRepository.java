package com.project.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springbootjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
