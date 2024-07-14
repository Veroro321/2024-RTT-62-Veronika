package com.example.springboot.controller;

import com.example.springboot.database.dao.CustomerDAO;
import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/customer") //when you apply everything on this list is applies to everything in this controller
public class CustomerController {

    @Autowired
    private CustomerDAO customerDao;

    // this URL is going to be localhost:8080/customer/list
    @GetMapping("/list")
    public ModelAndView list() {
        return null;
    }

    @GetMapping("/details")
    public ModelAndView customerDetails(@RequestParam Integer id) {
        ModelAndView response = new ModelAndView("customer/customer-details");

        // Fetch customer details
        Customer customer = customerDao.findCustomerById(id);
        response.addObject("customer", customer);

        return response;
    }

}