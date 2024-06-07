package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.dao.OrderDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Order;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CustomerOrderMain {

    private CustomerDAO customerDAO = new CustomerDAO();
    private OrderDAO orderDAO = new OrderDAO();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        int customerId = promptForCustomerId();
        List<Order> orders = orderDAO.findByCustomerId(customerId);
        printOrders(orders);
    }

    public int promptForCustomerId() {
        while (true) {
            try {
                System.out.print("Enter a customer id: ");
                int id = scanner.nextInt();
                Customer customer = customerDAO.findById(id);
                if (customer == null) {
                    System.out.println("Customer ID does not exist. Please try again.");
                } else {
                    return id;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }

    private void printOrders(List<Order> orders) {
        System.out.println("Order ID | Order Date | Shipped Date | Status | Comments");
        System.out.println("==============================================================");
        for (Order order : orders) {
            System.out.println(order.getId() + " | " + order.getOrderDate() + " | " + order.getShippedDate() + " | " + order.getStatus() + " | " + order.getComments());
        }
    }


    public static void main(String[] args) {
        CustomerOrderMain com = new CustomerOrderMain();
        com.run();
    }
}
