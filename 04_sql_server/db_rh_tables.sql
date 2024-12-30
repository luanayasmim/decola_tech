USE DB_RH
GO

CREATE TABLE tb_areas (
	id INT NOT NULL IDENTITY(1,1),
	descricao VARCHAR(100) NOT NULL,
	PRIMARY KEY(id)
)
GO

CREATE TABLE tb_cargos (
	id INT NOT NULL IDENTITY(1,1),
	id_area INT NOT NULL,
	descricao VARCHAR(100) NOT NULL,
	salario FLOAT NOT NULL,
	tp_salario SMALLINT NOT NULL, -- -32768 à 32767
	PRIMARY KEY(id),
	FOREIGN KEY(id_area) REFERENCES tb_areas(id),
	CHECK(tp_salario = 1 OR tp_salario = 2) -- 1: MENSAL, 2: HORA
)
GO

-- tabela independente pois não existe fk
CREATE TABLE tb_candidatos
(
	cpf VARCHAR(11) NOT NULL,
	nome VARCHAR(60) NOT NULL,
	telefone VARCHAR(20) not null,
	email varchar(60) not null
	PRIMARY KEY (cpf),
	CHECK(LEN(cpf) = 11)
)
GO

CREATE TABLE tb_inscricoes (
	id INT NOT NULL IDENTITY(1,1),
	id_cargo INT NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	situacao SMALLINT DEFAULT 0,
	data_inscricao DATETIME NOT NULL,
	data_efetivacao DATETIME,
	PRIMARY KEY(id),
	FOREIGN KEY(id_cargo) REFERENCES tb_cargos(id),
	FOREIGN KEY(cpf) REFERENCES tb_candidatos(cpf),
	CHECK(situacao BETWEEN 0 AND 2) --0: RECEM INSCRITO, 1: CONTRATADO, 2: EFETIVADO
)
GO
