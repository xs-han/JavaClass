create database mydb
on primary
(
	name='mydb1'
	filename='mydb1.mdf'
	size=4MB
	maxsize=20MB
	filegrowth=2MB
),
(
	name='mydb2'
	filename='mydb2.ndf'
	size=4MB
	maxsize=20MB
	filegrowth=2MB
)

log on
(
	name='mydb2'
	filename='mydb3.ldf'
	size=4MB
	maxsize=20MB
	filegrowth=2MB
)
go