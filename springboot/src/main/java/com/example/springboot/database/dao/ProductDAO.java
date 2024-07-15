package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product, Long> {

    Product findById(Integer id); //this is the power of spring boot no longer needed to write sql anymore
// for case study you will need to write an SQL query

    // this is a JPA query just like we did in the hibernate module
    @Query("select p from Product p where p.productName like concat('%', :name, '%')")
    List<Product> findByNameOrCode(String name);

}