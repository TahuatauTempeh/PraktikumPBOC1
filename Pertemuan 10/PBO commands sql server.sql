create database PBO;

use PBO;

create table person(
	id int primary key auto_increment not null,
    name varchar (100));
    
show tables;

delete from 
	person
where
	id = 1;

describe person;

select * from person;