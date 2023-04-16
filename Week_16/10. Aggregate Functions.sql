insert into transactions (transaction_id, trasaction_date, amount, type, account_id)
values (5, '2020-01-31', 45.50, 'D', 2);

select sum(amount), count(amount) from transactions
-- or count(*)
group by account_id;