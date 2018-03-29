create table students
(
  first_name varchar(20),
  last_name varchar(20),
  e_mail varchar(20),
  address varchar(20),
  pin varchar(20),
  phone_no varchar(20),
  s_id varchar(5) primary key,
  date_of_birth date,
  qualification varchar(2),
  percent_10 number(2),
  percent_12 number(2),
  date_of_passing_12 date,
  subjects varchar(20)
);

create table courses(
c_name varchar(20),
c_code number(3) primary key,
c_subjects varchar(20),
c_duration number(2),
c_fee number(4),
c_description varchar(20)
);

create table student_courses(
s_id varchar(5) ,
c_code number(3) ,
reg_no varchar(5) primary key,
course_status varchar(5),

CONSTRAINT S_ID_FK FOREIGN key(S_ID) REFERENCES STUDENTs(s_ID),
CONSTRAINT c_code_fk FOREIGN key(C_CODE) REFERENCES COURSES(C_CODE)
);


create table student_SCORE(
REG_NO varchar(5),
SCORE number(3),
EXAM_DATE date,

CONSTRAINT REG_NO_FK FOREIGN key(REG_NO) REFERENCES STUDENT_COURSES(REG_NO)
);
INSERT INTO STUDENTS(first_name,last_name,e_mail,s_id)
VALUES('a','a', 'a', 's1001');

INSERT INTO STUDENTS(first_name,last_name,e_mail,s_id)
VALUES('b','b', 'b', 's1002');

INSERT INTO STUDENTS(first_name,last_name,e_mail,s_id)
VALUES('c','c', 'c', 's1003');

INSERT INTO courses(c_name,c_code,c_subjects)
VALUES('course1','100', 'subject1');

INSERT INTO courses(c_name,c_code,c_subjects)
VALUES('course2','101', 'subject2');

INSERT INTO courses(c_name,c_code,c_subjects)
VALUES('course2','102', 'subject2');

INSERT INTO student_courses(s_id,c_code,reg_no)
VALUES('s1001','100', 'r1001');
INSERT INTO student_courses(s_id,c_code,reg_no)
VALUES('s1001','104', 'r1002');
INSERT INTO student_courses(s_id,c_code,reg_no)
VALUES('s1002','103', 'r1003');
INSERT INTO student_courses(s_id,c_code,reg_no)
VALUES('s1003','100', 'r1004');
INSERT INTO student_courses(s_id,c_code,reg_no)
VALUES('s1004','103', 'r1005');
INSERT INTO student_courses(s_id,c_code,reg_no)
VALUES('s1001','103', 'r1006');
INSERT INTO student_courses(s_id,c_code,reg_no)
VALUES('s1001','102', 'r1007');
INSERT INTO student_courses(s_id,c_code,reg_no)
VALUES('s1002','104', 'r1008');




INSERT INTO student_score(reg_no,score,exam_date)
VALUES('r1001',70, TO_DATE('02-apr-80', 'DD-MON-yy'));

/* QUESTION ONE */
Select S.S_ID, S.FIRST_NAME,S.LAST_NAME, SC.C_CODE
FROM STUDENTS S JOIN STUDENT_COURSES SC ON (S.S_ID = SC.S_ID)
WHERE C_CODE = 102;

/*QUESTION TWO */
Select S.FIRST_NAME,S.LAST_NAME,S.E_MAIL,C.C_NAME,SC.C_CODE,SS.SCORE,SS.EXAM_DATE
FROM STUDENTS S JOIN STUDENT_COURSES SC ON (S.S_ID = SC.S_ID)
JOIN COURSES C ON (SC.C_CODE = C.C_CODE)
JOIN STUDENT_SCORE SS ON (SS.REG_NO = SC.REG_NO)
WHERE SC.REG_NO= 'r1001';

/* QUESTION 3 */
Select S.S_ID, S.FIRST_NAME,S.LAST_NAME, SC.C_CODE
FROM STUDENTS S left JOIN STUDENT_COURSES SC ON (S.S_ID = SC.S_ID);

Select S.S_ID, S.FIRST_NAME,S.LAST_NAME, SC.C_CODE
FROM STUDENT_COURSES SC right JOIN STUDENTS S ON (S.S_ID = SC.S_ID);
