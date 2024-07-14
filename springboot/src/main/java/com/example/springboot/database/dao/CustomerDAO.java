package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE c.employee.id = :employeeId")
    List<Customer> findByEmployeeId (Integer employeeId);
    // could have also done this, List<Customer> findByEmployeeId(@Param("employeeId") Integer employeeId);

    @Query("select c from Customer c where c.salesRepEmployeeId = :employeeId")
    List<Customer> findCustomersByEmployeeId(@Param("employeeId") Integer employeeId);

    // HQL query to find customer details by customer ID

    @Query("SELECT c FROM Customer c WHERE c.id = :id")  // HQL query to find customer details by customer ID
    Customer findCustomerById(@Param("id") Integer id);


}