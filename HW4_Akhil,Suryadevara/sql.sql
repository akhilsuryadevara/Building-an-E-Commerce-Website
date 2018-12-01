create table CustomerOrders
(
OrderId integer,
userName varchar(40),
orderName varchar(40),
orderPrice double,
userAddress varchar(40),
creditCardNo varchar(40),
Primary key(OrderId,userName,orderName)
);

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

delete from productdetails;

select * from CustomerOrders;

select * from orders;
select * from productdetails;
select * from registration;