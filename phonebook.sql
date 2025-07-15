/***************************************
*phonebook
****************************************/

use phonebook_db;

show databases;

show tables;

truncate table person;

create table person (
    person_id int primary key auto_increment,
    name varchar(100),
    hp varchar(20),
    company varchar(20)
);

insert into person values (null, '테스트이름', '010-1234-5678', '02-123-4567');
insert into person values (null, '정우성', '010-1111-1111', '02-1111-1111');
insert into person values (null, '강호동', '010-1111-1111', '02-1111-1111');


select 	person_id, 
		name, 
		hp, 
		company
from person
order by person_id desc;