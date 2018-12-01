create database Exampledatabase;
show databases;
use exampledatabase;

create table Registration(username varchar(40),password varchar(40),repassword varchar(40),usertype varchar(40));

select * from Registration;


create database customerorders;



select * from Registration;

create table orders
(
OrderId integer,
userName varchar(40),
orderName varchar(40),
orderPrice double,
userAddress varchar(40),
creditCardNo varchar(40),
Primary key(OrderId,userName,orderName)
);

create table productdetails 
(
ProductType varchar(40),
Id varchar(40),
productName varchar(40),
productPrice double,
productImage varchar(40),
productCondition varchar(40),
productDiscount double
);

update orders set orderTime = now();


select * from orders;

select * from productdetails;		

select * from registration;







