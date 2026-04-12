# Write your MySQL query statement below
SELECT P.product_id FROM Products AS P
    WHERE P.low_fats = 'Y'
        AND P.recyclable = 'Y'