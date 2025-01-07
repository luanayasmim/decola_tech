use db_rh
go

select * from tb_cargos

select 
    sum(salario) as soma,
    avg(salario) as media,
    max(salario) as maximo,
    min(salario) as minimo,
    count(salario) as  quantidade,
    stdev(salario) as [desvio padrão]
from tb_cargos
group by tp_salario


select 
    sum(salario) as soma,
    avg(salario) as media,
    max(salario) as maximo,
    min(salario) as minimo,
    count(salario) as  quantidade,
    stdev(salario) as [desvio padrão]
from tb_cargos

-- usando uma consulta com todas as tabelas incluindo junções e agrupamentos
select 
a.descricao as area,
c.descricao as cargo,
sum(c.salario) as [soma salario],
count(*) as quantidade,
c.tp_salario as tipo,
i.data_inscricao as [data],
cd.cpf as cpf,
cd.nome as nome
from tb_areas a join tb_cargos c on a.id=c.id_area
join tb_inscricoes i on c.id = i.id_cargo
join tb_candidatos cd on i.cpf = cd.cpf
group by 
a.descricao, c.descricao, c.tp_salario, i.data_inscricao, cd.cpf, cd.nome

--
select 
a.descricao as area,
c.descricao as cargo,
count(*) as quantidade,
cd.cpf as cpf,
cd.nome as nome
from tb_areas a join tb_cargos c on a.id=c.id_area
join tb_inscricoes i on c.id = i.id_cargo
join tb_candidatos cd on i.cpf = cd.cpf
group by 
a.descricao, 
c.descricao,
cd.cpf, 
cd.nome

-- exercicio 1 - quantidade de inscrições por candidato
select
count(*) as quantidade,
cd.cpf as cpf,
cd.nome as nome
from tb_areas a join tb_cargos c on a.id=c.id_area
join tb_inscricoes i on c.id = i.id_cargo
join tb_candidatos cd on i.cpf = cd.cpf
group by
cd.cpf, 
cd.nome

-- exercicio 2 - quantidade de inscrições por cargo
select 
a.descricao as area,
c.descricao as cargo,
count(*) as quantidade
from tb_areas a join tb_cargos c on a.id=c.id_area
join tb_inscricoes i on c.id = i.id_cargo
join tb_candidatos cd on i.cpf = cd.cpf
group by 
a.descricao, 
c.descricao