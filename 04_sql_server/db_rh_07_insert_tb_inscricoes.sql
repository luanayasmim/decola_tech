USE db_rh
GO

-- efetuando inscrições
INSERT INTO tb_inscricoes (id_cargo, cpf, data_inscricao) VALUES
(1, '09984352013', GETDATE()),
(2, '09984352013', GETDATE()),
(3, '09984352013', GETDATE());
--(2, '87434427060', '2024-12-29'),
--(2, '86288149063', '2024-12-27')

select * from tb_candidatos