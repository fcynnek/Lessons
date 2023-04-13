-- many to many relationship is enforced by a join table

create table user_accountuser_accountuser_account (
'user_id' int not null,
'account_id' int not null,
foreign key (user_id) references 'users' (user_id),
foreign key (account_id) references 'account' (account_id)
);

insert into account (account_id, account_name, balance)
value ( 1, 'Checking', 100.00);

insert into account (account_id, account_name, balance)
value ( 2, 'Checking', 200.00);

insert into user_account (user_id, account_id)
values (1, 1);

insert into user_account (user_id, account_id)
values (2, 2);

insert into user_account (user_id, account_id)
values (5, 2);

alter table transactions
drop foreign key transactions_ibfk_1;

alter table transactions
drop column user_id;

select * from transactions;
select * from users;
select * from account;
select * from user_account;

alter table transactions
add column account_id int not null;

alter table transactions add
foreign key (account_id) references account (account_id);