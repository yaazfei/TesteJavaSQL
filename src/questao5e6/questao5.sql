CREATE TABLE Notas (
    Nota INT primary key,
    Valor_Min INT,
    Valor_Max INT
);

CREATE TABLE Alunos (
    ID INTEGER primary key autoincrement,
    Nome VARCHAR,
    Valor INT
);

create table alunos_notas (id_notas bigint(20) not null, id_alunos bigint(20) not null,
	  CONSTRAINT `notas_fk` FOREIGN KEY (`id_notas`) REFERENCES `Alunos` (`id`),
	  CONSTRAINT `alunos_fk` FOREIGN KEY (`id_alunos`) REFERENCES `Notas` (`nota`)
);

INSERT INTO Notas (Nota, Valor_Min, Valor_Max)
VALUES ('1','0','9');
INSERT INTO Notas (Nota, Valor_Min, Valor_Max)
VALUES ('2','10','19');
INSERT INTO Notas (Nota, Valor_Min, Valor_Max)
VALUES ('3','20','29');
INSERT INTO Notas (Nota, Valor_Min, Valor_Max)
VALUES ('4','30','39');
INSERT INTO Notas (Nota, Valor_Min, Valor_Max)
VALUES ('5','40','49');
INSERT INTO Notas (Nota, Valor_Min, Valor_Max)
VALUES ('6','50','59');
INSERT INTO Notas (Nota, Valor_Min, Valor_Max)
VALUES ('7','60','69');
INSERT INTO Notas (Nota, Valor_Min, Valor_Max)
VALUES ('8','70','79');
INSERT INTO Notas (Nota, Valor_Min, Valor_Max)
VALUES ('9','80', '89');
INSERT INTO Notas (Nota, Valor_Min, Valor_Max)

VALUES ('10','90','99');
INSERT INTO Alunos (ID, Nome, Valor)
VALUES ('1','Julia','81');
INSERT INTO Alunos (ID, Nome, Valor)
VALUES ('2','Carol','68');
INSERT INTO Alunos (ID, Nome, Valor)
VALUES ('3','Maria','99');
INSERT INTO Alunos (ID, Nome, Valor)
VALUES ('4','Andreia','78');
INSERT INTO Alunos (ID, Nome, Valor)
VALUES ('5','Jaqueline','63');
INSERT INTO Alunos (ID, Nome, Valor)
VALUES ('6','Marcela','88');
INSERT INTO Alunos (ID, Nome, Valor)
VALUES ('7','Helen','89');
INSERT INTO Alunos (ID, Nome, Valor)
VALUES (8,'Gustavo','90');
INSERT INTO Alunos (ID, Nome, Valor)
VALUES (9,'Marceline','91');
INSERT INTO Alunos (ID, Nome, Valor)
VALUES (10,'Rita','92');

INSERT INTO alunos_notas VALUES (2,5);
INSERT INTO alunos_notas VALUES (3,8);
INSERT INTO alunos_notas VALUES (4,9);
INSERT INTO alunos_notas VALUES (5,8);
INSERT INTO alunos_notas VALUES (6,10);
INSERT INTO alunos_notas VALUES (7,9);
INSERT INTO alunos_notas VALUES (8,10);
INSERT INTO alunos_notas VALUES (9,10);
INSERT INTO alunos_notas VALUES (10,10);

   SELECT
    case
	    when n.nota < 8 THEN 'NULL' 
		else a.nome 
	END AS 'Nome',
	n.nota,
	a.valor
    FROM alunos a 
    INNER JOIN alunos_notas an 
    	ON an.id_alunos = a.id 
    INNER JOIN notas n 
    	ON n.nota = an.id_notas
    
    	ORDER BY n.nota desc,  a.nome asc;
