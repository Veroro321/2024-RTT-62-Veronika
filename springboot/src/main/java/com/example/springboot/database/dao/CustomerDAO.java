package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {

    //@Query("SELECT c FROM Customer c WHERE c.employee.id = :employeeId")
    //List<Customer> findByEmployeeId (Integer employeeId);
    // could have also done this, List<Customer> findByEmployeeId(@Param("employeeId") Integer employeeId);
    //Customer findByEmployeeId (Integer employeeId);


    //this hql query will get list of customers for that employee?
    @Query("select c from Customer c where c.salesRepEmployeeId = :employeeId")
    List<Customer> findCustomersByEmployeeId(Integer employeeId);

    //magic query, in class video he has the List<Customer> findBySalesRepEmployee(Integer id); assumes that salesRepEmployee is a filed or property of customer entity
    // Should replace findBySaleRepEmployee with findCustomersByEmployeeId

    // HQL query to find customer details by customer ID
    @Query("select c from Customer c where c.id = :id")
    Customer findCustomerById(Integer id);


    /*

    // HQL query to find orders by customer ID
    @Query("select o from Order o where o.customer.id = :customerId")
    List<Order> findOrdersByCustomerId(Integer customerId);

     */

}