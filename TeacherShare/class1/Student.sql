create database mydb
go
use mydb
go

create table Student
(
   id char(6) not null primary key,
   name varchar(20) null,
   score numeric(6,2) null
)
go

insert into Student(id,name,score)
   values('01','������',588.88)
go
insert into Student(id,name,score)
   values('02','��Ԫ��',578.88)
go
insert into Student(id,name,score)
   values('03','��С��',538.58)
go

select s.id,s.name,s.score,c.id,c.name
from Student s,Coure c
where s.id=c.id
go


Connection con;
Statement st;
Resultset rs


�û�����㣨HTML+CSS+Script+JSP��
�м��(JAVA,c,C#,C++,VB.net)
���ݲ㣨sql��




