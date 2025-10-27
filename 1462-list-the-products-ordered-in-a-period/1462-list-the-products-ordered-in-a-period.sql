# Write your MySQL query statement below
SELECT 
   P.product_name,
   sum(O.unit) AS unit 
FROM Orders O
LEFT JOIN Products P 
    ON  O.product_id = P.product_id
WHERE O.order_date BETWEEN '2020-02-01' AND '2020-02-29'
GROUp BY P.product_id, P.product_name
HAVING sum(O.unit) >= 100;