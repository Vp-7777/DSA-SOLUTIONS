# Write your MySQL query statement below
SELECT c.name AS Customers FROM 
Customers c left JOIN 
Orders o ON c.id = o.customerId
where o.customerId IS NULL;