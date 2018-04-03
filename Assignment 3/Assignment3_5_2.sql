
create or replace package UMS_Package as


  
 procedure update_student_contact_info(
  new_reg_no IN varchar,
  new_e_mail in varchar,
  new_phone_number in number);
  
procedure getName(
  first_letter in char

);

function getAge(new_reg_no in varchar) return number;

function getPass(new_reg_no in varchar) return number;
  
  
end UMS_Package;


create or replace package body UMS_Package as

procedure update_student_contact_info(
  new_reg_no IN varchar,
  new_e_mail in varchar,
  new_phone_number in number)
  as
begin

update students
set
e_mail = new_e_mail,
phone_no = new_phone_number

where
students.s_id =
(select students.S_ID from students join student_courses on students.s_id = student_courses.s_id
where new_reg_no = reg_no);

end;


procedure getName(first_letter in char)
as
cursor names_cur is
select first_name,last_name,phone_no
from students
where first_name like first_letter||'%';

names_t  names_cur%ROWTYPE;
TYPE names_ntt IS TABLE OF names_t%TYPE; -- must use type
student_contact  names_ntt;
    
BEGIN
  open names_cur;
  fetch names_cur bulk collect into student_contact;
  close names_cur;

for i in 1..student_contact.count
loop 
DBMS_OUTPUT.put_line(student_contact(i).first_name ||' ' ||
student_contact(i).last_name ||' ' ||student_contact(i).phone_no);
end loop;  
  

end;





function getAge(new_reg_no varchar) return number

as
  age number;
begin

select Round((sysdate -  students.DATE_OF_BIRTH)/365.25) into age
from students join student_courses on students.s_id = student_courses.s_id
where new_reg_no = reg_no;
DBMS_OUTPUT.put_line(age);
return age;
end;

function getPass(new_reg_no varchar) return number

as
  passYear number;
begin

select floor((months_between(sysdate , students.DATE_OF_PASSING_12))/12) into passYear
from students join student_courses on students.s_id = student_courses.s_id
where new_reg_no = reg_no;
DBMS_OUTPUT.put_line(passYear);
return passYear;

end;
end ums_package;



BEGIN

UMS_PACKAGE.UPDATE_STUDENT_CONTACT_INFO('r1003', 'flsaflsa@gmail.com',5832785);

END;


BEGIN

UMS_PACKAGE.GETNAME('R');

END;

DECLARE
  STUDENT_AGE NUMBER;

BEGIN

STUDENT_AGE :=  UMS_PACKAGE.GETAGE('r1003');

END;


DECLARE
YEARSPASSED  NUMBER;

BEGIN

YEARSPASSED :=  UMS_PACKAGE.GETPASS('r1003');

END;

 