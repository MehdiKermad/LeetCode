# Write your MySQL query statement below
SELECT e.name as Employee
FROM Employee as e
JOIN Employee as m
ON e.managerId = m.id
WHERE (e.managerId IS NOT null)
AND e.salary > m.salary;