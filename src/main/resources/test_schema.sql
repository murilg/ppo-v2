-- ДЛЯ ТЕСТИРОВАНИЯ

drop table if exists permission_id, users_id, seller, buyer cascade;

create table permission_id
(
    permission_id int primary key generated by default as identity,
    role          text
);

create table users_id
(
    user_id       int primary key generated by default as identity,
    login         text not null,
    password      text not null,
    permission_id int references permission_id (permission_id)
);

create table seller
(
    seller_id    int primary key generated by default as identity,
    user_id      int references users,
    surname      text not null,
    name         text not null,
    patronymic   text,
    phone_number text not null,
    email        text,
    post         text -- должность
);

create table buyer
(
    buyer_id     int primary key generated by default as identity,
    user_id      int references users,
    surname      text not null,
    name         text not null,
    phone_number text not null,
    email        text,
    address      text
);

insert into permission (role)
values ('editor'),
       ('reader');
