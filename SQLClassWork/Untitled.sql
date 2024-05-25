-- Homework 1
-- Question 0.1
-- I want to see the count of the number of products in each product line
SELECT productline_id, COUNT(*) AS product_count
FROM Products
GROUP BY productline_id;
-- question 0.2
-- I want to see a list of employees and all of the customers for that employee.   Employee name will be duplicated in the result set.   I want to see the employee first and last name
-- and the customer contact first and last name as well as the customer name

SELECT
    e.firstName AS EmployeeFirstName,
    e.lastName AS EmployeeLastName,
    c.contact_firstName AS CustomerContactFirstName,
    c.contact_lastName AS CustomerContactLastName,
    c.customer_name AS CustomerName
FROM 
    employees e, customers c
ORDER BY 
    e.lastName, e.firstName, c.customer_name;

-- question 0.3
-- I want to see a list of employees in each office. Show the office name and the employee name
SELECT
    o.city AS office_name,
    e.firstname AS employee_first_name,
    e.lastname AS employee_last_name
FROM
    employees e,
    offices o
WHERE
    e.office_id = o.id
ORDER BY
    o.city, e.lastname, e.firstname;

-- question 0.4
-- I want to see the totaly number of each employee type based on job title.. result should the job title and the number of employess with that job title.
SELECT job_title, COUNT(*) AS num_employees
FROM employees
GROUP BY job_title;
-- question 0.5
-- I want to see a list of all payments each customer has made.  Order the list by custoemr name ascending, then by the payment amount descending
SELECT c.customer_name, p.*
FROM customers c, payments p
WHERE c.Id = p.customer_id
ORDER BY c.customer_name ASC, p.amount DESC;

-- question 0.6
-- I want to see a list of products that have never been sold.   use ... not in ( select product_id from order_details ) in your where clause
-- select * from products where id not in ( select product_id from orderdetails ); 

SELECT *
FROM products
WHERE id NOT IN (SELECT product_id FROM orderdetails);


-- question 0.7
-- are there any customers that have never made an order
SELECT *
FROM customers
WHERE Id NOT IN (SELECT DISTINCT customer_id FROM orders);

-- Question 1
-- How many customer are handled by each office. I want to see the office name and the count of the number of customers in that office.
SELECT o.city AS office_name, COUNT(c.Id) AS num_customers
FROM offices o, customers c
WHERE o.Id = c.sales_rep_employee_id
GROUP BY o.city;

-- Question 2
-- I want to see the products with the most margin at the top of the table.  Include the product name, buy price, msrp, and margin in the results.  Margin is calculated (MSPR - buy_price) 
-- Question 2
-- I want to see the products with the most margin at the top of the table. Include the product name, buy price, msrp, and margin in the results. Margin is calculated (MSRP - buy_price)
SELECT p.product_name, p.buy_price, p.msrp, (p.msrp - p.buy_price) AS margin
FROM products p
ORDER BY margin DESC;

-- Question 2.5
-- I want to see the top 5 customers in each state based on margin 

SELECT c.state, c.customer_name, SUM(p.amount) AS margin
FROM customers c, payments p
WHERE c.Id = p.customer_id
GROUP BY c.state, c.customer_name
ORDER BY c.state, margin DESC
LIMIT 5;

-- Question 3
--  I want to see the top 5 salesmen in the company based on the total amount sold
SELECT e.first_name, e.last_name, SUM(od.quantity_ordered * od.price_each) AS total_sales
FROM employees e, orders o, orderdetails od
WHERE e.Id = o.sales_rep_employee_id
AND o.Id = od.order_id
GROUP BY e.first_name, e.last_name
ORDER BY total_sales DESC
LIMIT 5;
-- Question 4
-- I want to see the top 5 salesmen based on overall profit (margin)
SELECT e.first_name, e.last_name, SUM((od.price_each - p.buy_price) * od.quantity_ordered) AS total_profit
FROM employees e, orders o, orderdetails od, products p
WHERE e.Id = o.sales_rep_employee_id
AND o.Id = od.order_id
AND od.product_id = p.Id
GROUP BY e.first_name, e.last_name
ORDER BY total_profit DESC
LIMIT 5;

-- Question 5 
-- I want to see all of the orders that happened in 2004.   You can use a function called year(order_date) = 2004
SELECT *
FROM orders
WHERE YEAR(order_date) = 2004;

-- Question 6
-- I want to see the total amount of all orders grouped by the year
SELECT YEAR(order_date) AS order_year, SUM(od.quantity_ordered * od.price_each) AS total_amount
FROM orders o, orderdetails od
WHERE o.Id = od.order_id
GROUP BY order_year;

-- Question 7
-- I want to see the top 5 products based on quantity sold across all orders
SELECT p.product_name, SUM(od.quantity_ordered) AS total_quantity_sold
FROM products p, orderdetails od
WHERE p.Id = od.product_id
GROUP BY p.product_name
ORDER BY total_quantity_sold DESC
LIMIT 5;

-- question 7.5
-- how many times has each product appeared in an order reguardless of how many were purchased.
SELECT p.product_name, COUNT(*) AS appearance_count
FROM products p, orderdetails od
WHERE p.Id = od.product_id
GROUP BY p.product_name;

-- question 7.6
-- how many products would be out of stock baed on the amount sold acrosss tiem.  -- not sure if the data will spoort this .. basically 
-- looking for any product where the sum of the quantity sold is greater than the quantity in stock
SELECT p.product_name, p.quantity_in_stock, SUM(od.quantity_ordered) AS total_quantity_sold
FROM products p, orderdetails od
WHERE p.Id = od.product_id
GROUP BY p.product_name
HAVING total_quantity_sold > p.quantity_in_stock;

-- question 7.9
-- I want to see the distinct order status ordered alphabetically
SELECT DISTINCT status
FROM orders
ORDER BY status ASC;

-- Question 8
-- I want to see the office name and the distinct product lines that have been sold in that office.  This will require joining almost all of the tables.  
-- select distinct o.name as office_name, pl.productlines as product_line_name  ....

SELECT DISTINCT o.city AS office_name, pl.productlines AS product_line_name
FROM offices o, employees e, customers c, orders o, orderdetails od, products p, productlines pl
WHERE o.Id = e.office_id
AND e.Id = c.sales_rep_employee_id
AND c.Id = o.customer_id
AND o.Id = od.order_id
AND od.product_id = p.Id
AND p.productline_id = pl.Id;
