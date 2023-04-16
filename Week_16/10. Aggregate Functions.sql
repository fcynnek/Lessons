insert into transactions (transaction_id, transaction_date, amount, type, account_id)
values (5, '2020-01-31', 45.50, 'D', 2);

select sum(amount), count(amount) from transactions
-- or count(*)
group by account_id;

select account_id , sum(amount) as account_balance from transactions
group by account_id;

-- CASE
-- 	WHEN [boolean expression] THEN [return value]
-- 	WHEN [boolean expression] THEN [return value]
-- 	ELSE [return value]
-- END

select account_id,
	sum(CASE
		WHEN 'type' = 'D' THEN amount
		WHEN 'type' = 'C' THEN amount * -1
		END) as account_balance
from transactions
group by account_id;
    
select account_id,
	sum(CASE
		WHEN 'type' = 'D' THEN amount
        ELSE amount * -1
        END) as account_balance
from transactions
group by account_id;