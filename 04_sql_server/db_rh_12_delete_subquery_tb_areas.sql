use db_rh
go

-- removendo uma area que tenha um cargo cadastrado
delete from tb_areas where id = 2

-- removendo uma area que não tenha um cargo cadastrado
delete from tb_areas where id = 1 

-- removendo todas as areas que não possuem um cargo associado (isso inclui as areas repetidas)
delete from tb_areas where id not in (select id_area from tb_cargos)