package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

    @Query("select e from Employee e where e.firstname like concat('%', :name, '%') or e.lastname like concat('%', :name, '%')")
    List<Employee> findByFirstnameOrLastname(String name);
}
