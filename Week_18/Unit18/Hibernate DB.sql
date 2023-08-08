create database hibernate_example;
-- for Unit 18 ORM

INSERT INTO users (name, username, password)
VALUE ('Trevor Page', 'trevor@cratycodr.com', 'asdfasdf');
INSERT INTO users (name, username, password)
VALUE ('Jane Doe', 'jane@doe.com', 'asdfasdf');
INSERT INTO users (name, username, password)
VALUE ('John Doe', 'john@doe.com', 'asdfasdf');
INSERT INTO users (name, username, password)
VALUE ('Kenny Cheng', 'name@email.com', 'asdfasdf');

SELECT * FROM users;
