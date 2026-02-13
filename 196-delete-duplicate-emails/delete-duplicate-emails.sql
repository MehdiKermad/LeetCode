# Write your MySQL query statement below
DELETE d
FROM Person AS p
JOIN Person AS d
WHERE p.email = d.email
AND d.id > p.id;