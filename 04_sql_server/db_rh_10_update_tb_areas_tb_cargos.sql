use db_rh
go

-- alterar a descrição da area cujo o id seja igual a dois
update tb_areas set descricao = 'marketing digital' where id = 2

-- reajustar os salarios da tabela tb_cargos
update tb_cargos set salario = salario * 1.1