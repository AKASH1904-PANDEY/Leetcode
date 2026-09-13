# Write your MySQL query statement below
SELECT e.name AS Employee
FROM Employee e JOIN Employee m
ON e.managerId = m.id #Employee's manager ID = Manager's employee ID
WHERE e.salary > m.salary;