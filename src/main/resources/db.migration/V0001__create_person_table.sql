create table person
(
    id         serial8 primary key,
    first_name text not null,
    last_name  text not null,
    birthday   date not null
)