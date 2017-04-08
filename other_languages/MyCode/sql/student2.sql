create database mydb
go

use mydb
create table Student
(
	id char(6) not null primary key, /* primary key must be unique and not null*/
	name varchar(20) null,
	score numeric(6,2) /* eg. 600.00 Note: the widthe of the number includes the dot*/	
)
go

insert into Student(id,name,score)
	value('01','Sanfeng Zhang', 588.88)
go
insert into Student(id,name,score)
	value('02','Yuanjia Huo', 588.88)
go
insert into Student(id,name,score)
	value('03','Bruce Lee', 588.88)
go

select id,name,score
from Student
where id='01'
go
