package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OrderDAO extends JpaRepository<Order, Integer> {

    //this hql query will fetch orders associated with specific customer based on customer id
    @Query("SELECT o FROM Order o WHERE o.customer.id = :customerId")
    List<Order> findOrdersByCustomerId(Integer customerId);

    //each map in the list represents a row in the result set from the database
    //in this result, the String is the column name and the object is the value in the column
    //we are using native SQL so we need to give the flag in the Query annotation to be nativeQuery = true
    //this is a native query because it belongs to the sql query itself

    @Query(value="select o.id as order_id, o.order_date, od.quantity_ordered, p.product_name, p.id as product_id, " +
            "od.price_each, (od.quantity_ordered * od.price_each) as line_item_total " +
            "from orderdetails od, products p, orders o " +
            "where od.product_id = p.id and o.id = od.order_id and o.id = :orderId " +
            "order by order_id;", nativeQuery = true)
    List<Map<String,Object>> getOrderDetails(Integer orderId);
}
