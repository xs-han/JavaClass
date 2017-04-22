create database mydb
go

use mydb
create table Family
(
	u_id char(6) not null primary key, /* primary key must be unique and not null*/
	u_name varchar(20) null,
	pwd char(16) /* eg. 600.00 Note: the wu_idthe of the number includes the dot*/	
)
go

insert into Family(u_id,u_name,pwd)
	value('1','admin', 123456)
go
insert into Family(u_id,u_name,pwd)
	value('2','Peter', 654321)
go
insert into Family(u_id,u_name,pwd)
	value('3','Mary', 111111)
go

select u_id,u_name,pwd
from Family
where u_id='01'
go
