package com.example.springboot.controller;

import com.example.springboot.database.dao.CustomerDAO;
import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.dao.OrderDAO;
import com.example.springboot.database.entity.Customer;

import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Order;
import com.example.springboot.form.CreateCustomerFormBean;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @Autowired
    private OrderDAO orderDao;

    @Autowired
    private EmployeeDAO employeeDao;

    //this URL is going to be localhost:8080/customer/list
    //this is going to give us a list of customers for that employee
    @GetMapping("/list")
    public ModelAndView list(@RequestParam("employeeId") Integer employeeId) {
        ModelAndView response = new ModelAndView("customer/customer-list");

        // Fetch list of customers for that employee
        List<Customer> customers = customerDao.findCustomersByEmployeeId(employeeId);
        log.debug("Fetched customers: {}", customers); // Use log.debug for debugging

        response.addObject("customers", customers);
        response.addObject("employeeId", employeeId); // Add employeeId to the view
        return response;
    }

    @GetMapping("/details")
    public ModelAndView customerDetails(@RequestParam("id") Integer id) {
        ModelAndView response = new ModelAndView("customer/customer-details");

        // Fetch customer details
        Customer customer = customerDao.findCustomerById(id);
        log.debug("Fetched customer details: {}", customer);
        response.addObject("customer", customer);

        // Fetch orders associated with this customer, here we are auto-injecting the order DAO because we want to use it
        List<Order> orders = orderDao.findOrdersByCustomerId(id);
        log.debug("Fetched orders: {}", orders);
        response.addObject("orders", orders);

        return response;
    }

    // this is for the create customer details page

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView response = new ModelAndView("customer/create");

        List<Employee> employees = employeeDao.findAll();
        response.addObject("employees", employees);

        return response;
    }

    @GetMapping("/createSubmit")
    public ModelAndView createSubmit(CreateCustomerFormBean form) {
        ModelAndView response = new ModelAndView();

        log.debug(form.toString());

        Customer customer = new Customer();
        customer.setCustomerName(form.getCustomerName());
        customer.setContactFirstname(form.getContactFirstname());
        customer.setContactLastname(form.getContactLastname());
        customer.setPhone(form.getPhone());
        customer.setAddressLine1(form.getAddressLine1());
        customer.setAddressLine2(form.getAddressLine2());
        customer.setCity(form.getCity());
        customer.setState(form.getState());
        customer.setPostalCode(form.getPostalCode());
        customer.setCountry(form.getCountry());
        customer.setCreditLimit(form.getCreditLimit());

        Employee salesRep = employeeDao.findById(form.getSalesRepEmployeeId());
        customer.setEmployee(salesRep);

        customer = customerDao.save(customer);
        response.setViewName("redirect:/customer/details?Id=" + customer.getId());

        return response;
    }


}