use db_rh
go

-- buscando as informações: área, cargo e salario
-- usando duas tabelas com seus nomes completos (pior jeito)
select tb_areas.descricao as [área], tb_cargos.descricao as [cargo], tb_cargos.salario as [salario] from tb_areas, tb_cargos -- sem relação

-- usando aliases para as tabelas
select a.descricao as [área], c.descricao as [cargo], c.salario as [salario] from tb_areas a, tb_cargos c where a.id = c.id_area

-- usando o join
select a.descricao as [área], c.descricao as [cargo], c.salario as [salario] from tb_areas a inner join tb_cargos c on a.id = c.id


-- Mostrar o cpf e o nome do candidato, além da data da inscrição
select c.cpf, c.nome, i.data_inscricao from tb_candidatos c inner join tb_inscricoes i on c.cpf = i.cpf 

-- buscando todos os candidatos e as datas de inscrição, mesmo se os candidatos que não realizaram a inscrição
-- nesse caso deve-se priorizar a tabela de tb_candidatos usando o left join
select c.cpf, c.nome, i.data_inscricao from tb_candidatos c left join tb_inscricoes i on c.cpf = i.cpf 

-- de forma analoga, pode-se usar o right join, priorizando a tabela da direita
select c.cpf, c.nome, i.data_inscricao from tb_inscricoes i right join tb_candidatos c on c.cpf = i.cpf 

--aplicando joins entre quatro tabelas
select 
    a.descricao as  [área],
    c.descricao as [cargo], 
    i.data_inscricao as [inscrição], 
    cd.nome as [candidato], 
    cd.telefone as [contato] 
from tb_cargos c 
inner join tb_inscricoes i on c.id = i.id_cargo
inner join tb_candidatos cd on i.cpf = cd.cpf
inner join tb_areas a on c.id_area = a.id


select 
    a.descricao as  [área],
    c.descricao as [cargo], 
    convert(varchar(10), i.data_inscricao, 103) as [inscrição], -- https://learn.microsoft.com/pt-br/sql/t-sql/functions/cast-and-convert-transact-sql?view=sql-server-ver16
    cd.nome as [candidato], 
    cd.telefone as [contato] 
from tb_cargos c 
full join tb_inscricoes i on c.id = i.id_cargo
full join tb_candidatos cd on i.cpf = cd.cpf
full join tb_areas a on c.id_area = a.id