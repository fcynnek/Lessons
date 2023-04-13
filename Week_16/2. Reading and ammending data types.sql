-- C"R"UD

select * from users;
-- * means everything 

select * from transactions;

select user_id, username, password, first_name, last_name from users;
select username from users;
select password, username from users;

insert into transactions (transaction_id, transaction_date, amount, type)
values (1, '2020-01-31 13:01:59', 20, 'D');
-- DateTime type is YYYY-MM-DD 24H:mm:ss if time not specified, default is midnight

insert into transactions (transaction_id, transaction_date, amount, type)
values (2, '2020-01-30 15:01:59', 19.99, 'D');
-- this created a warning. When the table was created, it was defined as:
-- amount decimal(2) -> which translated into amount decimal(2, 0) -> (precision, scale)
-- Example (5, 2) -> total of 5 numerical digits and 2 are the digits after the decimal point

alter table transactions
change column amount amount decimal (6, 2);

insert into transactions (transaction_id, transaction_date, amount, type)
values (3, '2020-01-29 08:00:00', 119.99, 'D');