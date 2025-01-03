use db_rh
go

select * from tb_areas

select distinct id, descricao from tb_areas

-- constraints
select * from tb_areas where id=3
select * from tb_areas where id<3
select * from tb_areas where id<3 and id <> 4
select * from tb_areas where descricao = 'financeiro'
select * from tb_areas where descricao = 'FINANCEIRO' -- sql server não é case sensitive
select * from tb_areas where descricao like 'f%'
select * from tb_areas where descricao like '%a%g'

