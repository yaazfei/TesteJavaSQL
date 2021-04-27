select distinct name from (
    select name from cats 
    union 
    select name from dogs);