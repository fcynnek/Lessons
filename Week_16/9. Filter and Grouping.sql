select * from users
left join address on users.user_id = address.user_id
join user_account on user_account.user_id = users.user_id
join account on account.account_id = user_account.account_id
join transactions on transactions.account_id = account.account_id
-- where username = 'trevor@craftycodr.com'
-- or username = 'john@doe.com';
where username in ('trevor@craftycodr.com', 'john@doe.com');

insert into transactions (transaction_id, transaction_date, amount, type, account_id)
values (4, '2020-02-28 09:00:00', 57.56, 'C', 2);

select * from transactions
group by 'type';