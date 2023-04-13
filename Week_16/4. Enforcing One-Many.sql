-- RDBMS -> Relational DataBase Management System
--       -> MySQL, PostgreSQL, MS SQL Server, Oracle
-- Relationships exist between tables (3 types):
-- One-to-Many
-- One-to-One
-- Many-to-Many

-- In any RDBMS the child will be responsible of storing the parent PK for reference
-- foreign key is the name of the relational column

alter table transactions
add column user_id int;

alter table transactions
add foreign key (user_id) references users (user_id);