select * from users
join address on users.user_id = address.user_id;

select * from users u
join address a on u.user_id = a.user_id;

select * from address;

insert into address (user_id, address_line_1, address_line_2, city, region, country, postal_code)
values( 5, '1 Musk Dr', 'Ste. 205', 'City', 'State', 'USA', '10000'); 

select * from users
left join address on users.user_id = address.user_id;

select * from users
left join address on users.user_id = address.user_id
join user_account on user_account.user_id = users.user_id
join account on account.account_id = user_account.account_id
join transactions on transactions.account_id = account.account_id;