create table user (
    id int auto_increment primary key,
    lastname varchar(255),
    firstname varchar(255),
    code varchar(4)
);


create table account (
    id int auto_increment primary key,
    balance INTEGER,
    user_id int,
    foreign key (user_id) references user(id)
);

create table operation (
    id int auto_increment primary key,
    operation_type varchar(20),
    amount INTEGER,
    operation_date TIMESTAMP,
    balance INTEGER,
    account_id INTEGER,
    foreign key (account_id) references account(id)
);