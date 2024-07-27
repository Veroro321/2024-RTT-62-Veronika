package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Product;
import com.example.springboot.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {



}