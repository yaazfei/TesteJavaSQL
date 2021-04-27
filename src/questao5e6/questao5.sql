create table alunos_notas (id_notas bigint(20) not null, id_alunos bigint(20) not null,
	  CONSTRAINT `notas_fk` FOREIGN KEY (`id_notas`) REFERENCES `Alunos` (`id`),
	  CONSTRAINT `alunos_fk` FOREIGN KEY (`id_alunos`) REFERENCES `Notas` (`nota`)
);

select
    case
	    when n.nota < 8 then 'NULL' 
		else a.nome 
	end as 'Nome',
	n.nota,
	a.valor
    from alunos a 
    inner join alunos_notas an 
    	on an.id_alunos = a.id 
    inner join notas n 
    	on n.nota = an.id_notas
    
    	order by n.nota desc,  a.nome asc;
    	
    	