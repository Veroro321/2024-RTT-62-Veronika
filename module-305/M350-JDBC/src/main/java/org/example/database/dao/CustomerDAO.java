package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customer;
import org.example.database.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CustomerDAO {

    /*In your customerDAO I want you to create 2 methods.
    First is findByCustomerName - HQL = "select c from Customer c where c.customerName = :customerName" */


    public List<Customer> findByCustomerName(String customerName) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory(); //please review session in slides
        Session session = factory.openSession();

        String hql = "select c from Customer c where c.customerName = :customerName"; //customer name is the column name right
        //next to it the customer goes into line 30 the second

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);

        // this is similar to the prepared statement, we are going to set the value in the query :firstname
        // to the value passed into the function
        query.setParameter("customerName", customerName);

        List<Customer> customers = query.getResultList();

        session.close();

        return result;

    }

    /*Second is findByContactFirstName HQL = "select c from Customer c where c.contactFirstName = :whatever"*/

    public List<Customer> findByContactFirstName(String customerName) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory(); //please review session in slides
        Session session = factory.openSession();

        String hql = "select c from Customer c where c.contactFirstName = :whatever";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);

        // this is similar to the prepared statement, we are going to set the value in the query :firstname
        // to the value passed into the function
        query.setParameter("customerName", customerName);

        List<Customer> customers = query.getResultList();

        session.close();

        return result;

    }

    public void insert(Customer customer) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // begin the transaction
        session.getTransaction().begin();

        // insert the employee to the database
        session.save(customer);

        /// commit our transaction
        session.getTransaction().commit();

        // cleanup the session
        session.close();
    }

    public void update(Customer customer) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(customer);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Customer customer) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.delete(customer);
        session.getTransaction().commit();
        session.close();
    }


}