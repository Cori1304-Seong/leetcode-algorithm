# Write your MySQL query statement belo

DELETE FROM Person 
where id NOT IN (
    SELECT min_id FROM (
        SELECT email, 
        MIN(id) AS min_id 
        FROM Person GROUP BY email
    ) AS temp
)
