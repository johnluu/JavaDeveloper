/* Question 1
BEGIN
  DBMS_OUTPUT.put_line ('Hello World');
END;
*/


/* Question 2
DECLARE
  isprime boolean;
  
BEGIN

FOR i IN 1..100 LOOP
isprime := true;

  FOR j in 2..sqrt(i) LOOP
  
    if remainder(i,j)=0 then
      isprime := false;
      end if;
  
  END LOOP;
  
  if isprime = true then
      DBMS_OUTPUT.put_line (i);
    end if;
    
    END LOOP;
 
END; 
*/

/* Question 3
CREATE OR REPLACE PROCEDURE
Factorial(n int) 

IS
total int := 1;
  
BEGIN

FOR i IN 1..N LOOP

total := total*i;
    
    END LOOP;
    
     DBMS_OUTPUT.put_line (total);
 
END; 
*/

/* Question 3 Execute function
execute Factorial(10);
*/
 

/* Question 4
create or replace package emp_pack as

procedure add_emp(
  first_name in varchar,
  last_name in varchar,
  start_date in date,
  title in varchar,
  assigned_branch_id in number,
  dept_id in number,
  superior_emp_id in number);
  
  procedure chg_emp(
  chg_emp_id in number,
  chg_first_name in varchar,
  chg_last_name in varchar,
  chg_start_date in date,
  chg_title in varchar,
  chg_assigned_branch_id in number,
  chg_dept_id in number,
  chg_superior_emp_id in number);
  
  
  
end emp_pack;


*/
/*
create or replace package body emp_pack as

procedure add_emp(
  first_name in varchar,
  last_name in varchar,
  start_date in date,
  title in varchar,
  assigned_branch_id in number,
  dept_id in number,
  superior_emp_id in number)
  as
begin

insert into employee (emp_id,first_name,last_name,start_date,title,assigned_branch_id,dept_id,SUPERIOR_EMP_ID)
values((SELECT max(emp_id)+1 FROM employee), first_name,last_name,TO_DATE(start_date, 'DD-MON-yy'),title,assigned_branch_id,dept_id,SUPERIOR_EMP_ID);

end add_emp;


procedure chg_emp(
  chg_emp_id in number,
  chg_first_name in varchar,
  chg_last_name in varchar,
  chg_start_date in date,
  chg_title in varchar,
  chg_assigned_branch_id in number,
  chg_dept_id in number,
  chg_superior_emp_id in number)
  as
begin

update employee
set
first_name = chg_first_name,
last_name = chg_last_name,
start_date = TO_DATE(chg_start_date, 'DD-MON-yy'),
title = chg_title,
assigned_branch_id = chg_assigned_branch_id,
dept_id = chg_dept_id,
SUPERIOR_EMP_ID = chg_SUPERIOR_EMP_ID
where emp_id = chg_emp_id;

end chg_emp;


end emp_pack;

*/

/* EXECUTE PACKAGES*/
begin
EMP_PACK.ADD_EMP('people','places','04-jan-05','officer',2,2,2);
end;


begin
EMP_PACK.CHG_EMP(21,'places','people','04-jan-05','officer',2,2,2);
end;

