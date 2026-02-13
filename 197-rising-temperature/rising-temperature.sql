# Write your MySQL query statement below
/*SELECT n.id
FROM Weather AS n
WHERE n.temperature > (
    SELECT t.temperature
    FROM Weather AS t
    WHERE t.id = (n.id - 1)
)*/

SELECT n.id
FROM Weather AS n
WHERE n.temperature > (
    SELECT t.temperature
    FROM Weather AS t
    WHERE (DATEDIFF(n.recordDate, t.recordDate)) = 1
)