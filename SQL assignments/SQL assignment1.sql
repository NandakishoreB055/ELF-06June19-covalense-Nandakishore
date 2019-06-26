
1.List of Employees working at deptno 20.
*********************************************************************************
mysql> select * from empp where deptno=20;
+----+-------+---------+--------+--------------------+--------+-----------------+
| id | fname | lname   | salary | jobtype            | deptno | email           |
+----+-------+---------+--------+--------------------+--------+-----------------+
| 10 | arun  | kumar   |  10000 | engineer           |     20 | arun@gmail.com  |
| 15 | raghu | biradar |  10000 | software developer |     20 | raghu@gmail.com |
+----+-------+---------+--------+--------------------+--------+-----------------+
2 rows in set (0.00 sec)



2.List of Employees earning more than 2500.
**********************************************************************************
mysql> select * from empp where salary>2500;
+----+----------+--------------+--------+----------+--------+--------------------+
| id | fname    | lname        | salary | jobtype  | deptno | email              |
+----+----------+--------------+--------+----------+--------+--------------------+
|  1 | nanda    | kishore      |  20000 | trainee  |     21 | nanda@gmail.com    |
|  2 | santhosh | kumar        |  40000 | engineer |     22 | santhosh@gmail.com |
|  3 | munna    | kumar        |  12000 | trainee  |     23 | munna@gmail.com    |
|  4 | manoj    | mansoor      |   5000 | trainee  |     24 | manoj@gmail.com    |
|  5 | sai      | kiran        |  15000 | designer |     25 | sai@gmail.com      |
|  6 | nikhil   | yellidhyappa |  10000 | engineer |     26 | nikhil@gmail.com   |
|  7 | nikhil   | yellidhyappa |  10000 | engineer |     22 | nikhil@gmail.com   |
| 10 | arun     | kumar        |  10000 | engineer |     20 | arun@gmail.com     |
+----+----------+--------------+--------+----------+--------+--------------------+
8 rows in set (0.00 sec)



3.List of Employees whose job type is software developer.
************************************************************************************
mysql> select * from empp where jobtype='software developer';
+----+---------+---------+--------+--------------------+--------+-------------------+
| id | fname   | lname   | salary | jobtype            | deptno | email             |
+----+---------+---------+--------+--------------------+--------+-------------------+
| 12 | manu    | pandith |  25000 | software developer |     21 | manu@gmail.com    |
| 14 | hrithik | kumar   |  30000 | software developer |     40 | hrithik@gmail.com |
| 15 | raghu   | biradar |  10000 | software developer |     20 | raghu@gmail.com   |
| 16 | prakash | raj     |  10000 | software developer |     10 | prakash@gmail.com |
+----+---------+---------+--------+--------------------+--------+-------------------+
4 rows in set (0.00 sec)



4.List of Employees working at department_number 10,20 and 40.
*************************************************************************************
mysql>  select * from empp where deptno IN (10,20,40);
+----+---------+---------+--------+--------------------+--------+-------------------+
| id | fname   | lname   | salary | jobtype            | deptno | email             |
+----+---------+---------+--------+--------------------+--------+-------------------+
| 10 | arun    | kumar   |  10000 | engineer           |     20 | arun@gmail.com    |
| 14 | hrithik | kumar   |  30000 | software developer |     40 | hrithik@gmail.com |
| 15 | raghu   | biradar |  10000 | software developer |     20 | raghu@gmail.com   |
| 16 | prakash | raj     |  10000 | software developer |     10 | prakash@gmail.com |
+----+---------+---------+--------+--------------------+--------+-------------------+
4 rows in set (0.00 sec)



5.List of Employees whose name starts with 'S'.
***************************************************************************
mysql> select * from empp where fname LIKE 's%';
+----+----------+-------+--------+----------+--------+--------------------+
| id | fname    | lname | salary | jobtype  | deptno | email              |
+----+----------+-------+--------+----------+--------+--------------------+
|  2 | santhosh | kumar |  40000 | engineer |     22 | santhosh@gmail.com |
|  5 | sai      | kiran |  15000 | designer |     25 | sai@gmail.com      |
+----+----------+-------+--------+----------+--------+--------------------+
2 rows in set (0.08 sec)



6.List of Employees whose first_name is having 'L' as second character. 
**************************************************************************
mysql> select * from empp where fname LIKE '_l%';
+----+-------+------------+--------+----------+--------+-----------------+
| id | fname | lname      | salary | jobtype  | deptno | email           |
+----+-------+------------+--------+----------+--------+-----------------+
| 11 | floyd | mayweather |  25000 | designer |     21 | floyd@gmail.com |
+----+-------+------------+--------+----------+--------+-----------------+
1 row in set (0.00 sec)



7.List of Employees whose first_name is having atleast 2 'A' character.
*************************************************************************************
mysql> select * from empp where fname LIKE '%a%a%';
+----+---------+---------+--------+--------------------+--------+-------------------+
| id | fname   | lname   | salary | jobtype            | deptno | email             |
+----+---------+---------+--------+--------------------+--------+-------------------+
|  1 | nanda   | kishore |  20000 | trainee            |     21 | nanda@gmail.com   |
| 16 | prakash | raj     |  10000 | software developer |     10 | prakash@gmail.com |
| 17 | baba    | basheer |  20000 | software developer |     10 | basheer@gmail.com |
+----+---------+---------+--------+--------------------+--------+-------------------+
3 rows in set (0.00 sec)



8.List of Employees whose last_name is having 'E' as second last character.
**************************************************************************************
mysql> select * from empp where lname LIKE '%e_';
+----+-------+------------+--------+--------------------+--------+-------------------+
| id | fname | lname      | salary | jobtype            | deptno | email             |
+----+-------+------------+--------+--------------------+--------+-------------------+
| 11 | floyd | mayweather |  25000 | designer           |     21 | floyd@gmail.com   |
| 17 | baba  | basheer    |  20000 | software developer |     10 | basheer@gmail.com |
+----+-------+------------+--------+--------------------+--------+-------------------+
2 rows in set (0.00 sec)



9.List of Employees who are having exactly 5 characters in their last_name.
*************************************************************************************
mysql> select * from empp where lname LIKE '_____';
+----+----------+-------+--------+--------------------+--------+--------------------+
| id | fname    | lname | salary | jobtype            | deptno | email              |
+----+----------+-------+--------+--------------------+--------+--------------------+
|  2 | santhosh | kumar |  40000 | engineer           |     22 | santhosh@gmail.com |
|  3 | munna    | kumar |  12000 | trainee            |     23 | munna@gmail.com    |
|  5 | sai      | kiran |  15000 | designer           |     25 | sai@gmail.com      |
|  8 | mahesh   | kumar |   NULL | NULL               |   NULL | mahesh@gmail.com   |
| 10 | arun     | kumar |  10000 | engineer           |     20 | arun@gmail.com     |
| 14 | hrithik  | kumar |  30000 | software developer |     40 | hrithik@gmail.com  |
+----+----------+-------+--------+--------------------+--------+--------------------+
6 rows in set (0.00 sec)


10.List of Employees whose salary is between 20000 and 30000.
****************************************************************************************
mysql> select * from empp where salary BETWEEN 20000 AND 30000;
+----+---------+------------+--------+--------------------+--------+-------------------+
| id | fname   | lname      | salary | jobtype            | deptno | email             |
+----+---------+------------+--------+--------------------+--------+-------------------+
|  1 | nanda   | kishore    |  20000 | trainee            |     21 | nanda@gmail.com   |
| 11 | floyd   | mayweather |  25000 | designer           |     21 | floyd@gmail.com   |
| 12 | manu    | pandith    |  25000 | software developer |     21 | manu@gmail.com    |
| 14 | hrithik | kumar      |  30000 | software developer |     40 | hrithik@gmail.com |
| 17 | baba    | basheer    |  20000 | software developer |     10 | basheer@gmail.com |
+----+---------+------------+--------+--------------------+--------+-------------------+
5 rows in set (0.00 sec)
