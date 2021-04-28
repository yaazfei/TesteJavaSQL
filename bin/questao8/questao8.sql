CREATE TABLE cats  (
    id INT primary key,
    name varchar not null 
);

CREATE TABLE dogs  (
    id INT primary key,
    name varchar not null 
);

insert into cats values(1, 'Gugu');
insert into cats values(2, 'Travis');
insert into cats values(3, 'Hansi');
insert into dogs values(1, 'Hansi');
insert into dogs values(2, 'Jack');
insert into dogs values(3, 'Tako');


select distinct name from (
    select name from cats 
    union 
    select name from dogs);
    
    