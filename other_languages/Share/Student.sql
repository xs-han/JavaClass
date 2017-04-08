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
   values('01','张三丰',588.88)
go
insert into Student(id,name,score)
   values('02','霍元甲',578.88)
go
insert into Student(id,name,score)
   values('03','李小龙',538.58)
go

select s.id,s.name,s.score,c.id,c.name
from Student s,Coure c
where s.id=c.id
go


Connection con;
Statement st;
Resultset rs


用户界面层（HTML+CSS+Script+JSP）
中间件(JAVA,c,C#,C++,VB.net)
数据层（sql）




