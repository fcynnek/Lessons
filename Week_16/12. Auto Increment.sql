-- auto increment

ALTER TABLE `online_bank`.`transactions` 
CHANGE COLUMN `transaction_id` `transaction_id` INT NOT NULL AUTO_INCREMENT ;

insert into transactions (transaction_date, amount, type, account_id)
values ('2020-03-02 10:30:00', 25.05, 'D', 2);