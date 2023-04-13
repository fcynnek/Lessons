-- One to One relatioship 

create table address (
-- address_id int not null,
-- in order to enforce 1:1 the foreign key is the primary key
user_id int not null,
address_line_1 varchar(200) not null,
address_line_2 varchar(200),
city varchar(100) not null,
region varchar(100) not null,
country varchar(100) not null,
postal_code varchar(15) not null,
-- primary key (address_id)
primary key (user_id),
foreign key (user_id) references users (user_id)
);

select * from address;

insert into address (user_id, address_line_1, city, region, country, postal_code)
values (1, '123 Fake St', 'Some City', 'Some Region', 'Some Country', '12345')