drop database if exists testdb;
<<<<<<< HEAD
create database testdb; use testdb;
=======
create database testdb;
use testdb;
>>>>>>> 8c394c83d99aa7d3b9cd890bcdb0cd90ddc46889
create table test_table(
user_id int,
user_name varchar(255),
password varchar(255)
);

<<<<<<< HEAD
insert into test_table values(1,”taro”,”123”);
insert into test_table values(2,”jiro”,”456”);
insert into test_table values(3,”hanako”,”789”);
=======
insert into test_table values(1,"taro","123");
insert into test_table values(2,"jiro","456");
insert into test_table values(3,"hanako","789");
>>>>>>> 8c394c83d99aa7d3b9cd890bcdb0cd90ddc46889
