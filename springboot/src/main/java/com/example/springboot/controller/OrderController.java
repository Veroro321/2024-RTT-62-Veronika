package com.example.springboot.controller;


import com.example.springboot.database.dao.OrderDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class OrderController {

    @Autowired
    private OrderDAO orderDao;

    @GetMapping("/order/orderDetail")
    public ModelAndView orderDetail(@RequestParam Integer orderId) {
        ModelAndView response = new ModelAndView("order/orderdetail");

        List<Map<String, Object>> orderDetails = orderDao.getOrderDetails(orderId);
        response.addObject("orderDetails", orderDetails); //this response is so that we can use it in our jsp page

        return response;


    }
}
