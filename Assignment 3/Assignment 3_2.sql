create table COURSE_INFO
(
  COURSE_CODE VARCHAR(10),
  COURSE_NAME varchar(20) NOT NULL,
  COURSE_DESCRIPTION VARCHAR(25),
  COURSE_START_DATE DATE,
  COURSE_DURATION INT,
  NO_OF_PARTICIPANTS INT,
  COURSE_TYPE CHAR(3),
  
  constraint course_code_pk primary key(course_code)
);

create table STUDENT_INFO
(
  STUDENT_ID VARCHAR(10),
  FIRST_NAME varchar(20),
  LAST_NAME VARCHAR(25),
  ADDRESS VARCHAR(150),
  
  constraint STUDENT_ID_PK primary key(STUDENT_ID)
);

create table STUDENT_COURSES
(
  STUDENT_ID VARCHAR(10),
  COURSE_CODE varchar(10),

  constraint STUDENT_ID_FK FOREIGN key(STUDENT_ID) REFERENCES STUDENT_INFO(STUDENT_ID),
  constraint COURSE_CODE_FK FOREIGN key(COURSE_CODE) REFERENCES COURSE_INFO(COURSE_CODE)
  
);

create table COURSE_FEES
(
  COURSE_CODE VARCHAR(10),
  BASE_FEES INT,
  SPECIAL_FEES INT,
  DISCOUNT INT,

  constraint COURSE_FEES_FK FOREIGN key(COURSE_CODE) REFERENCES COURSE_INFO(COURSE_CODE),
  CONSTRAINT BASE_CHECK CHECK (BASE_FEES > 15000 AND BASE_FEES > SPECIAL_FEES),
   CONSTRAINT DISCOUNT_CHECK CHECK (DISCOUNT > 5 AND DISCOUNT < 15)
);