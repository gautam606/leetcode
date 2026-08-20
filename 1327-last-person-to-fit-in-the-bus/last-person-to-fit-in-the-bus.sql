WITH cumulative_weight AS (
    SELECT 
        person_id,
        person_name,
        turn,
        weight,
        SUM(weight) OVER (ORDER BY turn) AS cumulative_sum
    FROM Queue
)
SELECT person_name
FROM cumulative_weight
WHERE cumulative_sum <= 1000
ORDER BY turn DESC
LIMIT 1;