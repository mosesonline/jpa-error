create schema if not exists mydb;
CREATE TABLE if not exists mydb.main_entites
(my_main_id VARCHAR(255) PRIMARY KEY,
    some_main VARCHAR(255));

CREATE TABLE if not exists mydb.children
(id serial PRIMARY KEY,
    some_child VARCHAR(255),
    my_main_id VARCHAR(255));
