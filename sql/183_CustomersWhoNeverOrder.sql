/*
https://leetcode.com/problems/customers-who-never-order/

Suppose that a website contains two tables, the Customers table and the Orders table.
Write a SQL query to find all customers who never order anything.

Table: Customers.

+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
Table: Orders.

+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
Using the above tables as example, return the following:

+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+

*/

-- MySQL query for this question
-- 1) Customers who haven't ordered anything will not have an entry in the orders table
-- 2) We'll use left join since we need the names of the Customers. In left join, the o.Id will be null
--    for customers who haven't ordered.


select c.Name as Customers
from Customers c
left join Orders o on c.Id = o.CustomerId
where o.Id is null;