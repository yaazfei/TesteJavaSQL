CREATE TABLE gatos  (
    id INT primary key,
    nome varchar not null 
);

CREATE TABLE cachorros  (
    id INT primary key,
    nome varchar not null 
);

INSERT INTO gatos VALUES(1, 'Gugu');
INSERT INTO gatos VALUES(2, 'Travis');
INSERT INTO gatos VALUES(3, 'Hansi');
INSERT INTO cachorros VALUES(1, 'Hansi');
INSERT INTO cachorros VALUES(2, 'Jack');
INSERT INTO cachorros VALUES(3, 'Tako');


SELECT DISTINCT nome from (
    SELECT nome FROM gatos 
    UNION 
    SELECT nome FROM cachorros);
    

    