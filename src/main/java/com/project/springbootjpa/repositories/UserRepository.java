package com.project.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.springbootjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
