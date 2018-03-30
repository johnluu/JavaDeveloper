create table students
(
  first_name varchar(20),
  last_name varchar(20),
  e_mail varchar(20),
  address varchar(20),
  state VARCHAR(2),
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


create table CERTIFICATION(
REG_NO varchar(5),
C_CODE number(3),
CERTIFICATE_REQUEST_ID NUMBER(3) PRIMARY KEY,
CERTIFICATE_STATUS VARCHAR(7),
ISSUE_DATE DATE,

CONSTRAINT CERT_REG_FK FOREIGN key(REG_NO) REFERENCES STUDENT_COURSES(REG_NO),
CONSTRAINT CERT_COURSE_FK FOREIGN key(C_CODE) REFERENCES COURSES(C_CODE)
);


create table instructor
(
  first_name varchar(20),
  last_name varchar(20),
  address varchar(20),
  state VARCHAR(2),
  pin varchar(20),
  instructor_id varchar(5) primary key,
  date_of_birth date,
  qualification varchar(2),
  subjects varchar(20),
  c_code number(3)
);




create table emp
(
  employee_id number(3) primary key,
  first_name varchar(20),
  last_name varchar(20),
  phone_number number(4),
  hire_date date,
  salary number(9),
  commision_pct number(3,2),
  manager_id number(3),
  job_id varchar(10),
  department_id varchar(3)
);

INSERT INTO STUDENTS(
first_name,last_name,e_mail,address,state,pin,phone_no,s_id,date_of_birth,qualification,percent_10,percent_12,date_of_passing_12,SUBJECTS)
VALUES('Ranjit','Chatterjee', 'r_chatt@aaa.com', '2/10 ashok vihar','WEST BENGAL','700101','9876578901','S1001',to_date('22-Apr-80','DD-MON-yy'),'BE',70,69,to_date('30-MAR-02','DD-MON-yy'),'MECHANICAL ENGG');


INSERT INTO STUDENTS(
first_name,last_name,e_mail,address,state,pin,phone_no,s_id,date_of_birth,qualification,percent_10,percent_12,date_of_passing_12,SUBJECTS)
VALUES('Kaushik','Bhatterjee', 'kaushik@bb.com', 'block A gagan vihar','WEST BENGAL','700096','9812345643','S1002',to_date('10-Aug-80','DD-MON-yy'),'BE',65,72,to_date('30-Apr-02','DD-MON-yy'),'CIVIL ENGG');

INSERT INTO STUDENTS(
first_name,last_name,e_mail,address,state,pin,phone_no,s_id,date_of_birth,qualification,percent_10,percent_12,date_of_passing_12,SUBJECTS)
VALUES('Kunal','GHOST', 'Kunal@gmail.com', '1A Shival APT','WEST BENGAL','700096','9678430987','S1003',to_date('12-dec-79','DD-MON-yy'),'BE',77,74,to_date('12-DEC-79','DD-MON-yy'),'MECHANICAL ENGG');

INSERT INTO STUDENTS(
first_name,last_name,e_mail,address,state,pin,phone_no,s_id,date_of_birth,qualification,percent_10,percent_12,date_of_passing_12,SUBJECTS)
VALUES('Pradeep','R', 'pradeep@gmail.com', '2B Trinity Tower','WEST BENGAL','700107','9234540987','S1004',to_date('3-may-81','DD-MON-yy'),'BE',78,70,to_date('22-sep-81','DD-MON-yy'),'ELECTRICAL ENGG');

INSERT INTO STUDENTS(
first_name,last_name,e_mail,address,state,pin,phone_no,s_id,date_of_birth,qualification,percent_10,percent_12,date_of_passing_12,SUBJECTS)
VALUES('RAKHI','R', 'TAKHI@gmail.com', '8/12C ASHOKA','WEST BENGAL','700109','9980768543','S1005',to_date('3-may-81','DD-MON-yy'),'BE',80,82,to_date('03-MAY-81','DD-MON-yy'),'ELECTRICAL ENGG');

INSERT INTO STUDENTS(
first_name,last_name,e_mail,address,state,pin,phone_no,s_id,date_of_birth,qualification,percent_10,percent_12,date_of_passing_12,SUBJECTS)
VALUES('DRKJST','TSO', 'S_RAO@gmail.com', '22/10 A VISHAL APT','WEST BENGAL','700109',' ','S1006',to_date('3-may-81','DD-MON-yy'),'BE',75,80,to_date('03-MAY-81','DD-MON-yy'),'ELECTRICAL ENGG');


INSERT INTO courses(c_name,c_code,c_subjects,C_DURATION,C_FEE,C_DESCRIPTION)
VALUES('C Data Structure','100', 'C,DS',40,4000,'DETAILED C AND DATASTRUCTURE CONCEPTS');

INSERT INTO courses(c_name,c_code,c_subjects,C_DURATION,C_FEE,C_DESCRIPTION)
VALUES('HTML and JS','101', 'HTML,JS',20,3500,'DETAILED HTML AND JAVA SCRIPT');

INSERT INTO courses(c_name,c_code,c_subjects,C_DURATION,C_FEE,C_DESCRIPTION)
VALUES('JAVA','102', 'JAVA',90,6000,'CORE JAVA');

INSERT INTO courses(c_name,c_code,c_subjects,C_DURATION,C_FEE,C_DESCRIPTION)
VALUES('DATABASE','103', 'RDBMS, ORACLE',40,4000,'DATABASE CONCEPTS');


INSERT INTO student_courses(s_id,c_code,reg_no,COURSE_STATUS)
VALUES('S1001','100', 'r1001' , 'COMPL');

INSERT INTO student_courses(s_id,c_code,reg_no,COURSE_STATUS)
VALUES('S1001','102', 'r1002' , 'VALID');

INSERT INTO student_courses(s_id,c_code,reg_no,COURSE_STATUS)
VALUES('S1002','100', 'r1003' , 'VALID');

INSERT INTO student_courses(s_id,c_code,reg_no,COURSE_STATUS)
VALUES('S1003','103', 'r1004' , 'BREAK');

INSERT INTO student_courses(s_id,c_code,reg_no,COURSE_STATUS)
VALUES('S1004','103', 'r1005' , 'COMPL');

INSERT INTO student_courses(s_id,c_code,reg_no,COURSE_STATUS)
VALUES('S1005','103', 'r1006' , 'COMPL');

INSERT INTO student_score(Reg_No,score,exam_date)
VALUES('r1001','70', to_date('12-jan-04', 'dd-mon-yy'));

INSERT INTO student_score(Reg_No,score,exam_date)
VALUES('r1005','80', to_date('15-sep-03', 'dd-mon-yy'));

INSERT INTO student_score(Reg_No,score,exam_date)
VALUES('r1006','78', to_date('12-dec-03', 'dd-mon-yy'));

INSERT INTO CERTIFICATION(Reg_No,C_CODE,CERTIFI)
VALUES('r1006','78', to_date('12-dec-03', 'dd-mon-yy'));

INSERT INTO student_score(Reg_No,score,exam_date)
VALUES('r1006','78', to_date('12-dec-03', 'dd-mon-yy'));

INSERT INTO student_score(Reg_No,score,exam_date)
VALUES('r1006','78', to_date('12-dec-03', 'dd-mon-yy'));

INSERT INTO student_score(reg_no,score,exam_date)
VALUES('r1001',70, TO_DATE('02-apr-80', 'DD-MON-yy'));

INSERT INTO CERTIFICATION(reg_no,C_CODE,CERTIFICATE_REQUEST_ID,CERTIFICATE_STATUS,ISSUE_DATE)
VALUES('r1001',100,101,'APPLIED', '');

INSERT INTO CERTIFICATION(reg_no,C_CODE,CERTIFICATE_REQUEST_ID,CERTIFICATE_STATUS,ISSUE_DATE)
VALUES('r1002',103,102,'ISSUED', TO_DATE('18-OCT-03', 'DD-MON-yy'));

INSERT INTO CERTIFICATION(reg_no,C_CODE,CERTIFICATE_REQUEST_ID,CERTIFICATE_STATUS,ISSUE_DATE)
VALUES('r1003',103,103,'ISSUED', TO_DATE('10-JAN-03', 'DD-MON-yy'));

INSERT INTO EMP
VALUES (10,'SMITH','TRENNA', 7890, TO_DATE('29-JAN-97'),20000,0.5,20,'SA_REP',10);





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
