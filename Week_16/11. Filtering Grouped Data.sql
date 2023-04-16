insert into account (account_id, account_name, balance)
values (3, 'Savings', 123.45);

insert into transactions (transaction_id, transaction_date, amount, type, account_id)
values (6, '2020-03-01 15:30:00', 123.45, 'D', 3);

select account_id, count(8) from transactions
-- where transaction_date > '2020-03-01'
group by account_id
having count(*) > 1;
-- count of number of transactions