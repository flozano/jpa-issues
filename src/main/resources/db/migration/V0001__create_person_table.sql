create table person
(
    id         bigint auto_increment primary key,
    first_name varchar(100) not null,
    last_name  varchar(100) not null,
    birthday   date not null
);