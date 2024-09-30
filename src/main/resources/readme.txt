
1.写一个查询语句，查询出所有员工的姓名、部门、职位、薪资、入职时间，并且按照薪资降序排列。
SELECT name, department, position, salary, hire_date
FROM employees
ORDER BY salary DESC;
2.写一个查询语句，查询出所有员工的姓名、部门、职位、薪资、入职时间，并且按照入职时间升序排列。
SELECT name, department, position, salary, hire_date
FROM employees
ORDER BY hire_date ASC;
3.写一个查询语句，查询出所有员工的姓名、部门、职位、薪资、入职时间，并且按照入职时间降序排列。
SELECT name, department, position, salary, hire_date
FROM employees
ORDER BY hire_date DESC;
4.写一个查询语句，查询出所有员工的姓名、部门、职位、薪资、入职时间，并且按照薪资升序排列。
SELECT name, department, position, salary, hire_date
FROM employees
ORDER BY salary ASC;
5.写一个查询员工工资在>1000 <3000 的员工的姓名、部门、职位、薪资、入职时间。
SELECT name, department, position, salary, hire_date
FROM employees
WHERE salary > 1000 AND salary < 3000;

6.查询出员工中工资大于同工种的平均工资的员工的姓名、部门、职位、薪资、入职时间 员工表 emp。
SELECT e.name, e.department, e.position, e.salary, e.hire_date
FROM employees e
WHERE e.salary > (SELECT AVG(salary) FROM employees WHERE department = e.department);
