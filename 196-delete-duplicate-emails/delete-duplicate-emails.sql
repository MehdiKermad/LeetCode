# Write your MySQL query statement below
DELETE d
FROM Person AS p
JOIN Person AS d
WHERE d.id > p.id
AND p.email = d.email;