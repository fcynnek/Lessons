select * from transactions;

update transactions
set user_id = 1;

update users
set first_name = 'John'
where user_id = 2;

-- selecting data using a primary key
select * from transactions
where transaction_id = 2;

select * from users
where first_name = 'Jane'
and last_name = 'Musk';

update users
set last_name = 'Musk'
where password = 'password123';

update transactions
set user_id = 2
where transaction_id = 3;

delete from users
where user_id = 7;

select * from users
where first_name = 'Jane'
or first_name = 'John';