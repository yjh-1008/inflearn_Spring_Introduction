drop table if exists member CASCADE;
create table mamber
(
    id bigint generated by default as identity,
    name varchar(255),
    primary key (id)
);