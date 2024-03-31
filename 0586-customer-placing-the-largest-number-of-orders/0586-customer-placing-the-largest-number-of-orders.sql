# Write your MySQL query statement below

select customer_number from orders group by customer_number order by count(customer_number)desc limit 1;

-- select max(customer_number)  as customer_number from (select count(order_number) from orders group by customer_number)as maxx ;