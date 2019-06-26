
1.Employees working as 'software developer' and deptno=40
***********************************************************************************
mysql> select * from empp where deptno=40 and jobtype='software developer';
+----+---------+-------+--------+--------------------+--------+-------------------+
| id | fname   | lname | salary | jobtype            | deptno | email             |
+----+---------+-------+--------+--------------------+--------+-------------------+
| 14 | hrithik | kumar |  30000 | software developer |     40 | hrithik@gmail.com |
+----+---------+-------+--------+--------------------+--------+-------------------+
1 row in set (0.00 sec)



2.Employees deatails working at deptno=40 and salary is grater than 5000
***********************************************************************************
mysql> select * from empp where deptno=40 and salary>5000;
+----+---------+-------+--------+--------------------+--------+-------------------+
| id | fname   | lname | salary | jobtype            | deptno | email             |
+----+---------+-------+--------+--------------------+--------+-------------------+
| 14 | hrithik | kumar |  30000 | software developer |     40 | hrithik@gmail.com |
+----+---------+-------+--------+--------------------+--------+-------------------+
1 row in set (0.00 sec)



3.Employees working except deptno 10 and 20
********************************************************************************************
mysql> select * from empp where deptno NOT IN(10,20);
+----+----------+--------------+--------+--------------------+--------+--------------------+
| id | fname    | lname        | salary | jobtype            | deptno | email              |
+----+----------+--------------+--------+--------------------+--------+--------------------+
|  1 | nanda    | kishore      |  20000 | trainee            |     21 | nanda@gmail.com    |
|  2 | santhosh | kumar        |  40000 | engineer           |     22 | santhosh@gmail.com |
|  3 | munna    | kumar        |  12000 | trainee            |     23 | munna@gmail.com    |
|  4 | manoj    | mansoor      |   5000 | trainee            |     24 | manoj@gmail.com    |
|  5 | sai      | kiran        |  15000 | designer           |     25 | sai@gmail.com      |
|  6 | nikhil   | yellidhyappa |  10000 | engineer           |     26 | nikhil@gmail.com   |
|  7 | nikhil   | yellidhyappa |  10000 | engineer           |     22 | nikhil@gmail.com   |
| 14 | hrithik  | kumar        |  30000 | software developer |     40 | hrithik@gmail.com  |
| 20 | mahendra | kumar        |  20000 | trainee            |     24 | mahendra@gmail.com |
| 21 | mahesh   | kumar        |  10000 | trainee            |     24 | mahesh@gmail.com   |
+----+----------+--------------+--------+--------------------+--------+--------------------+
10 rows in set (0.00 sec)



4.Employees not working as software engineer in dept no 10 and 20 with salary between 10000 and 30000
***************************************************************************************************************************
mysql> select * from empp where jobtype NOT IN('software engineer') AND deptno IN(21,23) AND salary BETWEEN 10000 AND 30000;
+----+-------+---------+--------+---------+--------+-----------------+
| id | fname | lname   | salary | jobtype | deptno | email           |
+----+-------+---------+--------+---------+--------+-----------------+
|  1 | nanda | kishore |  20000 | trainee |     21 | nanda@gmail.com |
|  3 | munna | kumar   |  12000 | trainee |     23 | munna@gmail.com |
+----+-------+---------+--------+---------+--------+-----------------+
2 rows in set (0.05 sec)



5.Display employee salary not in range of 10000 to 20000 in deptno 21,22,23
***************************************************************************************************************************
mysql> select * from empp where salary NOT BETWEEN 10000 and 20000  And deptno IN(21,22,23) and jobtype!='software engineer';
+----+----------+-------+--------+----------+--------+--------------------+
| id | fname    | lname | salary | jobtype  | deptno | email              |
+----+----------+-------+--------+----------+--------+--------------------+
|  2 | santhosh | kumar |  40000 | engineer |     22 | santhosh@gmail.com |
+----+----------+-------+--------+----------+--------+--------------------+
1 row in set (0.00 sec)



6.Arrange the employees by their salary in descending order.
********************************************************************************************
mysql> select * from empp order by salary desc;
+----+----------+--------------+--------+--------------------+--------+--------------------+
| id | fname    | lname        | salary | jobtype            | deptno | email              |
+----+----------+--------------+--------+--------------------+--------+--------------------+
|  2 | santhosh | kumar        |  40000 | engineer           |     22 | santhosh@gmail.com |
| 14 | hrithik  | kumar        |  30000 | software developer |     40 | hrithik@gmail.com  |
|  1 | nanda    | kishore      |  20000 | trainee            |     21 | nanda@gmail.com    |
| 17 | baba     | basheer      |  20000 | software developer |     10 | basheer@gmail.com  |
| 20 | mahendra | kumar        |  20000 | trainee            |     24 | mahendra@gmail.com |
|  5 | sai      | kiran        |  15000 | designer           |     25 | sai@gmail.com      |
|  3 | munna    | kumar        |  12000 | trainee            |     23 | munna@gmail.com    |
|  6 | nikhil   | yellidhyappa |  10000 | engineer           |     26 | nikhil@gmail.com   |
|  7 | nikhil   | yellidhyappa |  10000 | engineer           |     22 | nikhil@gmail.com   |
| 15 | raghu    | biradar      |  10000 | software developer |     20 | raghu@gmail.com    |
| 16 | prakash  | raj          |  10000 | software developer |     10 | prakash@gmail.com  |
| 21 | mahesh   | kumar        |  10000 | trainee            |     24 | mahesh@gmail.com   |
|  4 | manoj    | mansoor      |   5000 | trainee            |     24 | manoj@gmail.com    |
|  8 | mahesh   | kumar        |   NULL | NULL               |   NULL | mahesh@gmail.com   |
+----+----------+--------------+--------+--------------------+--------+--------------------+
14 rows in set (0.06 sec)



7.Display max salary,min salary and total salary of employees.
*************************************************************
mysql> select max(salary),min(salary),sum(salary) from empp;
+-------------+-------------+-------------+
| max(salary) | min(salary) | sum(salary) |
+-------------+-------------+-------------+
|       40000 |        5000 |      212000 |
+-------------+-------------+-------------+
1 row in set (0.01 sec)



8.Display the list of the number of s/w developer in dept 20 
************************************************************
+----------------+
| count(jobtype) |
+----------------+
|              2 |
+----------------+
1 row in set (0.00 sec)



9.Display the list of highest and lowest salary earned by software developer.
*****************************************************************************
+---------+---------------+
| highest | lowest_salary |
+---------+---------------+
|   30000 |         10000 |
+---------+---------------+
1 row in set (0.00 sec)



10.Display the total salary of all dept
****************************************************
mysql> select sum(salary) from empp group by deptno;
+-------------+
| sum(salary) |
+-------------+
|        NULL |
|       30000 |
|       10000 |
|       20000 |
|       50000 |
|       12000 |
|       35000 |
|       15000 |
|       10000 |
|       30000 |
+-------------+
10 rows in set (0.00 sec)