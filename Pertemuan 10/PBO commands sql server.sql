create database PBO;

use PBO;

drop table mahasiswa;

create table Mahasiswa(
	id int(11) primary key not null,
    name varchar (20));
    
describe mahasiswa;

show tables;

select * from mahasiswa;

delete from mahasiswa where id = 5;