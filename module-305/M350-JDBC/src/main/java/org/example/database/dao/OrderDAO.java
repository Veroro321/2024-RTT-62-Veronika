package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OrderDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public List<Order> findByCustomerId(int customerId) {
        Session session = factory.openSession();
        String hql = "SELECT o FROM Order o WHERE o.customer.id = :customerId";
        TypedQuery<Order> query = session.createQuery(hql, Order.class);
        query.setParameter("customerId", customerId);
        List<Order> orders = query.getResultList();
        session.close();
        return orders;
    }
}
