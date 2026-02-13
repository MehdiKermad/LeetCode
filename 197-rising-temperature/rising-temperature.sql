# Write your MySQL query statement below
SELECT n.id
FROM Weather AS n
WHERE n.temperature > (
    SELECT t.temperature
    FROM Weather AS t
    WHERE t.recordDate = DATE_SUB(n.recordDate, INTERVAL 1 DAY)
)