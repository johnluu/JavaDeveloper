insert into Users (email,password,first_name,last_name)
values('test','test','john','luu');

insert into new_questions (user_id,question_text,question_date,watches)
values(1,'How are you my friends',sysdate-1,100);
insert into new_questions (user_id,question_text,question_date,watches)
values(1,'How are you my friends2',sysdate-1,200);
insert into new_questions (user_id,question_text,question_date,watches)
values(1,'How are you my friends3',sysdate-1,300);
insert into new_questions (user_id,question_text,question_date,watches)
values(1,'How are you my friends4',sysdate-1,400);
insert into new_questions (user_id,question_text,question_date,watches)
values(1,'How are you my friends5',sysdate-1,500);

insert into new_options(question_id,option_text)
values(1,'Good');
insert into new_options(question_id,option_text)
values(1,'Bad');
insert into new_options(question_id,option_text)
values(1,'Average');


insert into new_options(question_id,option_text)
values(2,'Good');
insert into new_options(question_id,option_text)
values(2,'Bad');
insert into new_options(question_id,option_text)
values(2,'Average');

insert into new_options(question_id,option_text)
values(3,'Good');
insert into new_options(question_id,option_text)
values(3,'Bad');
insert into new_options(question_id,option_text)
values(3,'Average');


insert into new_options(question_id,option_text)
values(4,'Good');
insert into new_options(question_id,option_text)
values(4,'Bad');
insert into new_options(question_id,option_text)
values(4,'Average');


insert into new_options(question_id,option_text)
values(5,'Good');
insert into new_options(question_id,option_text)
values(5,'Bad');
insert into new_options(question_id,option_text)
values(5,'Average');


INSERT INTO QUESTIONS(QUESTION_ID,USER_ID,QUESTION_TEXT,WATCHES,QUESTION_DATE)
select QUESTION_ID,USER_ID,QUESTION_TEXT,WATCHES,QUESTION_DATE from new_questions
order by watches desc, question_date asc
fetch first 5 rows only;


INSERT INTO OPTIONS(OPTION_ID,QUESTION_ID,OPTION_TEXT)
select OPTION_ID,QUESTION_ID,OPTION_TEXT from new_options
where QUESTION_ID in (select QUESTION_ID from new_questions
order by watches desc, question_date asc
fetch first 5 rows only);


delete from user_watching;
delete from new_options;
delete from new_questions;

insert into new_questions (user_id,question_text,question_date,watches)
values(1,'How are you my friends6',sysdate,600);
insert into new_questions (user_id,question_text,question_date,watches)
values(1,'How are you my friends7',sysdate,700);
insert into new_questions (user_id,question_text,question_date,watches)
values(1,'How are you my friends8',sysdate,800);
insert into new_questions (user_id,question_text,question_date,watches)
values(1,'How are you my friends9',sysdate,900);
insert into new_questions (user_id,question_text,question_date,watches)
values(1,'How are you my friends10',sysdate,1000);


insert into new_options(question_id,option_text)
values(6,'Good');
insert into new_options(question_id,option_text)
values(6,'Bad');
insert into new_options(question_id,option_text)
values(6,'Average');



insert into new_options(question_id,option_text)
values(7,'Good');
insert into new_options(question_id,option_text)
values(7,'Bad');
insert into new_options(question_id,option_text)
values(7,'Average');



insert into new_options(question_id,option_text)
values(8,'Good');
insert into new_options(question_id,option_text)
values(8,'Bad');
insert into new_options(question_id,option_text)
values(8,'Average');




insert into new_options(question_id,option_text)
values(9,'Good');
insert into new_options(question_id,option_text)
values(9,'Bad');
insert into new_options(question_id,option_text)
values(9,'Average');


insert into new_options(question_id,option_text)
values(10,'Good');
insert into new_options(question_id,option_text)
values(10,'Bad');
insert into new_options(question_id,option_text)
values(10,'Average');

INSERT INTO QUESTIONS(QUESTION_ID,USER_ID,QUESTION_TEXT,WATCHES,QUESTION_DATE)
select QUESTION_ID,USER_ID,QUESTION_TEXT,WATCHES,QUESTION_DATE from new_questions
order by watches desc, question_date asc
fetch first 5 rows only;


INSERT INTO OPTIONS(OPTION_ID,QUESTION_ID,OPTION_TEXT)
select OPTION_ID,QUESTION_ID,OPTION_TEXT from new_options
where QUESTION_ID in (select QUESTION_ID from new_questions
order by watches desc, question_date asc
fetch first 5 rows only);



insert into questions (question_id,user_id,question_text,question_date,watches)
values(1,'How are you my friends11',sysdate,400);

insert into new_options(question_id,option_text)
values(11,'Good');
insert into new_options(question_id,option_text)
values(11,'Bad');
insert into new_options(question_id,option_text)
values(11,'Average');

select * from comments;


select * from user_choices;

select option_id from user_choices where question_id = 7 and USER_ID = 1;

--
--INSERT INTO USER_WATCHING (USER_ID,QUESTION_ID)
--VALUES(1,2);
--
--UPDATE NEW_QUESTIONS SET WATCHES = WATCHES + 1
--where QUESTION_ID = 1;
commit;

select * from options;

SELECT OPTIONS.* FROM OPTIONS
JOIN QUESTIONS ON QUESTIONS.QUESTION_ID = OPTIONS.QUESTION_ID
			 where QUESTIONS.QUESTION_DATE >= trunc(sysdate);
       
select * from questions;
commit;
select * from questions where question_date >= trunc(sysdate);
