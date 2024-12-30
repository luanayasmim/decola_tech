-- 1. Na tabela cargos, adicionar uma restrição impedindo que o salario seja negativo (>0)
ALTER TABLE tb_cargos ADD CHECK (salario>0)
GO
-- 2. Na tabela candidatos, o email deve ser único (exclusivo) - unique
ALTER TABLE tb_candidatos ADD UNIQUE(email)
GO

-- 3. Na tabela de inscrições, não deve ser permitido que um candidato se inscreva numa vaga mais de uma vez
ALTER TABLE tb_inscricoes ADD UNIQUE(id_cargo, cpf)
GO

--Para o projeto
--Impedir que o mesmo boleto seja pago duas vezes