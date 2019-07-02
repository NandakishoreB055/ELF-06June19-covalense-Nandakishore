

1.Query to display all the employee whose name and job is having  exactly 5 character.
************************************************************************************

select * from empp where fname like '_____' and job like '_____';



2.Query to display the employee whose job starts whith soft.
**********************************************************

select * empp where job like 'soft%';



3.Query to display the maximum salary for each job.
*************************************************

select max(salary) from empp group by job; 	



4.Query to display the dept number along with the number of employee in working it.
*********************************************************************************

select deptno, count(id) from empp group by deptno; 



5.Query to display the minimum salary for each job excluding all the emp whose name ends with 's'.
************************************************************************************************
	
select max(salary) from empp group by job where fname not like '%s';

	

6.Query to display the list of emp who is working in 'admin' dept.
****************************************************************

select * from empp e where e.deptno=(select d.deptno from dept where dname='admin');



7.Query to display the list of the dept names that are working in as software developer.
**************************************************************************************

select dname from dept d where d.deptno=(select * from empp e where e.job='software developer');



8.Query to display the 2nd maximum salary.
****************************************

select max(salary) from empp where salary<>(select max(salary) from empp);



9.Query to display the 3rd maximum salary.
****************************************

select max(salary) from empp where salary<>(select max(salary) from emp where salary<>(select max(salary) from empp));



10.Query to display the 4th least salary.
***************************************

select min(salary) from empp where salary<>(select min(salary) from empp where salary<>(select min(salary) from empp where salary<>(select min(salary) from empp)));

