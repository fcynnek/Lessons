-- many to many relationship is enforced by a join table

create table user_account (
'user_id' int not null,
'account_id' int not null,
foreign key (user_id) references 'users' (user_id),
foreign key (account_id) references 'account' (account_id)
);
