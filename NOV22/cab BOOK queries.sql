create database cabBook;
use cabBook;

CREATE TABLE  admin(
a_id INT PRIMARY KEY AUTO_INCREMENT,
a_name VARCHAR(30) NOT NULL,
a_email VARCHAR (50) NOT NULL,
a_password VARCHAR(30) NOT NULL
);

create table Manager(
m_id int primary key auto_increment,
m_name varchar(30) not null,
m_email varchar(40) not null,
m_password varchar(20) not null);

CREATE TABLE cab(
c_number INT PRIMARY KEY AUTO_INCREMENT,
c_name VARCHAR(50) not null,
seaters INT not null);

create table Employee(
e_id int Primary Key auto_increment,
e_name varchar(20) not null,
e_email varchar(20) not null,
e_password varchar(20) not null,
m_id int not null,
foreign key(m_id) references Manager(m_id));

drop table booking;
CREATE TABLE booking(
	b_id INT AUTO_INCREMENT PRIMARY KEY,
	e_id INT NOT NULL,
	src VARCHAR(50) NOT NULL,
	destn VARCHAR(50) NOT NULL,
	`date` DATE NOT NULL,
	`time` TIME NOT NULL,
	m_id INT NOT NULL,
	approve boolean,
	c_number INT,
    foreign key(c_number) references cab(c_number),
    foreign key(e_id) references employee(e_id),
    foreign key(m_id) references manager(m_id)
);

insert into admin values (1, "Porkodi", "porkodi@org.com", "porkodi@123");

select * from admin;

