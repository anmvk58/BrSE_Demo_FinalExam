create database brse2305;
use brse2305;

--  FirstName, LastName, Phone, Email, ExpInYear , ProSkill

create table experience_candidate(
                                     FIRST_NAME 	VARCHAR(50),
                                     LAST_NAME	VARCHAR(50),
                                     PHONE		VARCHAR(10),
                                     EMAIL		VARCHAR(100),
                                     EXP_IN_YEAR	SMALLINT,
                                     PRO_SKILL	VARCHAR(100)
);

create table fresher_candidate(
                                  FIRST_NAME 	VARCHAR(50),
                                  LAST_NAME	VARCHAR(50),
                                  PHONE		VARCHAR(10),
                                  EMAIL		VARCHAR(100),
                                  GRADUATION_RANK ENUM('Excellence', 'Good', 'Fair', 'Poor')
);


insert into experience_candidate(FIRST_NAME, LAST_NAME, PHONE, EMAIL, EXP_IN_YEAR, PRO_SKILL) values ('Henry', 'Ford', '0989622266', 'henry.ford@gmail.com', 5, 'Producer');

insert into experience_candidate(FIRST_NAME, LAST_NAME, PHONE, EMAIL, EXP_IN_YEAR, PRO_SKILL) values (?, ?, ?, ?, ?, ?);

insert into fresher_candidate(FIRST_NAME, LAST_NAME, PHONE, EMAIL, GRADUATION_RANK) values ('Vin', 'Fast', '0915152362', 'contact@vinfast.com.vn', 'Good');

select * from experience_candidate;

select * from fresher_candidate;


alter table experience_candidate add password varchar(50);
alter table fresher_candidate add password varchar(50);

update experience_candidate set password = '123456';

select password from experience_candidate where email = 'henry.ford@gmail.com';