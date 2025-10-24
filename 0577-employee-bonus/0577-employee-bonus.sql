# Write your MySQL query statement below

SELECT name, bonus
from Employee E
     left join Bonus B 
     on B.empId = E.empId
where COALESCE(B.bonus, 0) < 1000;