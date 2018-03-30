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
 
/*
Question 4

create or replace package emp_pack as

procedure add_emp(
  add_EMPLOYEE_ID IN number,
  add_first_name in varchar,
  add_last_name in varchar,
  add_PHONE_NUMBER IN NUMBER,
  add_HIRE_date in date,
  add_SALARY IN NUMBER,
  add_COMMISION_PCT in number,
  add_manager_id in number,
  add_JOB_id in varchar,
  add_DEPARTMENT_id in number);
  
  
  
  
  procedure chg_emp(
  CHG_EMPLOYEE_ID IN number,
  CHG_first_name in varchar,
  CHG_last_name in varchar,
  CHG_PHONE_NUMBER IN NUMBER,
  CHG_HIRE_date in date,
  CHG_SALARY IN NUMBER,
  CHG_COMMISION_PCT in number,
  CHG_MANAGER_ID in number,
  CHG_JOB_id in varchar,
  CHG_DEPARTMENT_id in number);
  
  
  
end emp_pack;




create or replace package body emp_pack as

procedure add_emp(
  add_EMPLOYEE_ID IN number,
  add_first_name in varchar,
  add_last_name in varchar,
  add_PHONE_NUMBER IN NUMBER,
  add_HIRE_date in date,
  add_SALARY IN NUMBER,
  add_COMMISION_PCT in number,
  add_manager_id in number,
  add_JOB_id in varchar,
  add_DEPARTMENT_id in number)
  as
begin

INSERT INTO EMP
VALUES(
  add_EMPLOYEE_ID,
  add_first_name ,
  add_last_name ,
  add_PHONE_NUMBER ,
  add_HIRE_date ,
  add_SALARY ,
  add_COMMISION_PCT,
  add_manager_id ,
  add_JOB_id ,
  add_DEPARTMENT_id 
);



end add_emp;


procedure chg_emp(
  chg_EMPLOYEE_ID IN number,
  chg_first_name in varchar,
  chg_last_name in varchar,
  chg_PHONE_NUMBER IN NUMBER,
  chg_HIRE_date in date,
  chg_SALARY IN NUMBER,
  chg_COMMISION_PCT in number,
  chg_manager_id in number,
  chg_JOB_id in varchar,
  chg_DEPARTMENT_id in number)
  as
begin

update EMP
set
  first_name = chg_first_name,
  last_name = chg_last_name,
  phone_number = chg_PHONE_NUMBER,
  hire_date = chg_HIRE_date,
  salary = chg_SALARY,
  commision_pct = chg_COMMISION_PCT,
  manager_id = chg_manager_id,
  job_id = chg_JOB_id,
  department_id = chg_DEPARTMENT_id
where employee_id = chg_employee_id;

end chg_emp;

end emp_pack;

*/

/* EXECUTE PACKAGES*/


begin
EMP_PACK.ADD_EMP(15,'SMITH','TRENNA', 7890,'29-JAN-97',20000,0.5,20,'SA_REP',10);
END;

begin
EMP_PACK.chg_EMP(15,'Samantha','TRENNA', 7890,'29-JAN-97',20000,0.5,20,'SA_REP',10);
end;

alter table emp rename
column Managager_id to manager_id;


