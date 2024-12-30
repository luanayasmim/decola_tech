USE db_rh
GO

-- inserindo registros na tabela tb_areas
INSERT INTO tb_areas (descricao) VALUES ('administração')
GO

-- inserindo vários registros de uma vez
INSERT INTO tb_areas (descricao) VALUES 
('marketing'),
('financeiro'),
('recursos humanos'),
('suporte técnico')
GO