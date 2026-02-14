# Gets the sales person's name
SELECT s.name
FROM SalesPerson AS s
WHERE NOT s.sales_id IN (
    # List of those who already worked with RED
    SELECT o.sales_id
    FROM Orders AS o
    WHERE o.com_id = (
        # Gets RED com_id
        SELECT c.com_id
        FROM Company as c
        WHERE c.name = "RED" 
    )
);