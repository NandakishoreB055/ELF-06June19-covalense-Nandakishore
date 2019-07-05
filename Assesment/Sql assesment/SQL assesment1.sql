1.Write a query to display Employee name, his salary along with the designation for all the employee.
  select name,salary,designation from employee;


2.Write a query to obtain name and his current salary and new salary with a hike 25 % for all the Employee.
 select name,salary as current_salary,salary=((salary*25)/100) as new_salary from employee;


3.Write a query to display all the details of the Employee who are working as salesman.
 select * from employee where jobtype='salesman';


4.Write a query to display all the employees of Dept.no 20.
 select * from employee where deptno=20;


5.Write a query to display all the Employees DOB before 1994.
 select * from employee where dob < '1994-01-01';


6.Write a query to display all the employees whose annual salary is less than 30,000.
 select * from employee where salary=(salary*12)<30000;



7.Write a query to display name, salary and Annual salary of all the clerks.
 select name,salary,salary*12 as anualsal from employee where jobtype='clerk';


8.Write a query to display all the details of Employee Whoever Hired after Feb of 2013.
 select * from employee where joining_date > '2013-02-01';


9.Write a query to display managers working in deptno 20 only if salary is greater than 2500.
 select * from employee where jobtype='manager' and deptno=20 and salary>2500;


10.Write a query to display all the employee excluding Analyst.
 select * from employee where jobtype!='analyst';


10.Write a query to display all the employee excluding Analyst.
 select * from employee where jobtype!='salesman' and dept_id=30;


12.Write a query to display names of all the employee who are working in dept 30 as manager OR all the names of employee who are working as a clerk and salary less than 2000.
 select name from employee where dept_id=30 and jobtype='manager' or jobtype='clerk' and salary<2000;


13.Write a query to display all the Employees in dept 20 only if their salary is greater than 1000 and less than 3500, including 1000 & 3500.
 select * from employee where dept_id=20 and salary between 1000 and 3500;

14.Write a query to display all the details of Employees who are working as clerk in deptno 20,30 or 40.
 select * from employee  where jobtype='clerk' and deptno in(20,30,40);


15.Write a query to display the details of software developer, manager or clerk who are working in dept.  10 or 20 and salary is greater than 1500.
 select * from employee where jobtype IN('developer','manager','clerk') and deptno IN (10,20) and salary>1500;


16. Write a query to display all the details of Employees who are working in department 10,20 excluding all the Salesman and Analyst.
 select * from employee where deptno IN (10,20) and jobtype not in ('salesman','analyst');

17. Write a query to display name, Salary for all the Employees who are working in dept 10 or 20 and their annual salary between 20,000 and 40,000 including the limits.
 select name,salary from employee where deptno IN (10,20) and (salary*12) between 20000 and 40000;

18.Write a query to display all the details of employees who were hire in the month of September working in dept 20 or 30.
 select * from employee where deptno IN (10,20) and joining_date like "____-09-__"

19.Write a query to display their name and DOJ of employee who works as salesman or clerk and their names has at least one S or E.
 select name,joining_date from employee where jobtype IN ('salesman','clerk') and name like "%s%e%";

20.Write a query to display Average salary and Highest salary of dept. 20.
 select avg(salary),max(salary) from employee where deptno=20;


21.Write a query to display date of first and last Hired Employees.
select max(joing_date) as ,min(joining_date) as from employee;

22.Write a query to display AVG Salary of Employees by excluding president and manager(job).
 select avg(salary) from employee where jobtype not in ('president','manager');

23. Write a query to display the total salary and average salary of each department.
 select sum(salary),avg(salary) from employee group by deptno;

24.Write a query to find the highest and least salary of an Employee in each job by excluding the employees whose name has ‘R’ as the last but one character. 
 select max(salary),min(salary) from employee where name like "%r_" group by jobtype;

26.Write a query to list the employee whose designation are same as Vikas    or Rahul.
 select * from  employee where jobtype in (select jobtype from employee where name in('vikas','rahul'));


27.Write a query to List the employee whose salary is equal to the average of max and minimum.
 select * from employee where salary in (select (max(salary)+min(salary))/2 from employee); 

 
28.Write a query to display employee name, department name and the location of all employee.
 select * from employee where (select name,deptname,location from employee);

29.Write a query to display all the details of employee whose name begins with the consonants.
 select * from employee where name NOT IN('a%','e%','i%','o%','u%');

30.Create a Views from Employee_Info table .Views should have all  the record whose salary is greater than 10000.
 CREATE
    /*[ALGORITHM = {UNDEFINED | MERGE | TEMPTABLE}]
    [DEFINER = { user | CURRENT_USER }]
    [SQL SECURITY { DEFINER | INVOKER }]*/
    VIEW `covalense_db`.`empview` 
    AS
    (SELECT * FROM employee_info)

In query:select * from empview where salary>10000


31.Create a trigger which will work before deletion in employee_info table     and create a duplicate copy of the record in another table employee_backup
 DELIMITER $$

CREATE
    /*[DEFINER = { user | CURRENT_USER }]*/
    TRIGGER `covalense_db`.`trig` BEFORE DELETE
    ON `covalense_db`.`employee_info`
    FOR EACH ROW BEGIN
insert into employee_backup(select * from employee_info)
    END$$

DELIMITER ;

32.What is Driver Class?
->It is provided by DB vendor.
->it implements driver interface of JDBC.
->package is com.mysql.jdbc.Driver


33.What is DB URL?
->it is an url to identify unique application.
->syntax:protocol:sub:protocol:sub-name
->sub-name has subdivided into 
 *host name.
 *port number.
 *database name.
 *user name and password.



