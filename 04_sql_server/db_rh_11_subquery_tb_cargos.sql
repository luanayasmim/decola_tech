use db_rh
go

select * from tb_areas
select * from tb_cargos

-- listar todas as areas que possuem um cargo correspondente cadastrado
select * from tb_areas where id in (select id_area from tb_cargos) -- mais performático que o join debaixo
select distinct a.* from tb_cargos c join tb_areas a on c.id_area = a.id

select distinct id_area, a.descricao as [nome da area], count(*) as [total de cargos] from tb_cargos c join tb_areas a on c.id_area = a.id group by id_area, a.descricao

-- listar todas as areas que não possuem um cargo correspondente cadastrados
select * from tb_areas where id not in (select id_area from tb_cargos)

-- buscar todos os cargos cujo o id esteja no intervalo entre 3 e 5
select * from tb_cargos where id between 3 and 5
select * from tb_cargos where id = 3 or id = 4 or id = 5
select * from tb_cargos where id in (3, 4, 5);

-- listar todos os candidatos que ainda não se inscreveram em nenhuma vaga
select * from tb_candidatos where cpf not in (select cpf from tb_inscricoes)