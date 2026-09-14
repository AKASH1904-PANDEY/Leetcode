# Write your MySQL query statement below
SELECT w.name AS name,w.population AS population,w.area AS area
FROM World w
WHERE  population >= 25000000
OR area>=3000000;
