create database online_bank;
-- comments are done with the double minus sign
use online_bank;
-- another way to select a database is by double click the DB which should bold the name
create table users (
	user_id int, 
    username varchar(100), 
    password varchar(32), 
    first_name varchar(50),
    last_name varchar(50)
);
-- inside the parenthesis, you define the columns on a table
-- need to also define data type for each column. For Strings the equivalent is varchar
-- and it needs to be defined with the max number of characters that it should store

CREATE TABLE `transactions` (
  `transaction_id` INT NOT NULL,
  `transaction_date` DATETIME NULL,
  `amount` DECIMAL(2) NULL,
  `type` VARCHAR(1) NULL,
  PRIMARY KEY (`transaction_id`));
-- this code was created with the workbench UI and copied here
-- Trevor recommends to take away the name of the DB that is in front of the table name (`online_bank`.`transactions`)
-- so that the query code can be used to create other DB in other environments
-- PK = primary key
-- NN = not null

ALTER TABLE `users` 
ADD PRIMARY KEY (`user_id`);
-- this code was created with workbench UI
-- this line of code is "optional" (CHANGE COLUMN `user_id` `user_id` INT NOT NULL ,)
-- the above code allows to change the name of the column too

ALTER TABLE `users` 
CHANGE COLUMN `user_id` `user_id` INT NOT NULL;