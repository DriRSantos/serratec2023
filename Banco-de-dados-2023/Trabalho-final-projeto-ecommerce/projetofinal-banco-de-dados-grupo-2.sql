-- GRUPO 2 - Projeto Final Banco de Dados --
-- Adriana dos Santos Neves ----------------
-- Fernanda Aparecida Gomes de Meirelles --- 
-- João Paulo Franco Amaral ----------------
-- Mariane dos Santos Magalhães ------------
-- Matheus Machado de Souza Borges ---------

-- Criando tabelas --- 
-- categoria
CREATE TABLE categoria(
	id integer primary key autoincrement not null,
	nome text,
	descricao text
);

-- cliente
CREATE TABLE cliente(
	id integer primary key autoincrement not null,
	nome text,
	sobrenome text,
	usuario text,
	email text,
	cpf varchar(11) not null,
	data_nascimento date,
	rua text,
	bairro text,
	cidade text,
	uf text,
	cep varchar(8) not null
);

-- funcionario
CREATE TABLE funcionario(
	id integer primary key autoincrement not null,
	nome text,
	cpf varchar(11) not null
);

--pedido
CREATE TABLE pedido(
	id integer primary key autoincrement not null,
	data_pedido date,
	id_cliente integer,
	foreign key(id_cliente) references cliente(id)
);

--produto
CREATE TABLE produto(
	id integer primary key autoincrement not null,
	nome text,
	descricao text,
	quantidade_estoque real,
	data_produto date,
	valor real,
	id_categoria integer,
	id_funcionario integer,
	foreign key (id_categoria) references categoria(id),
	foreign key (id_funcionario) references funcionario(id)
);

--pedido_produto
CREATE TABLE pedido_produto(
	id integer primary key autoincrement not null,
	quantidade real,
	id_pedido integer,
	id_produto integer,
	foreign key (id_pedido) references pedido(id),
	foreign key (id_produto) references produto(id)
);

-- inserindo dados de 5 clientes ---
INSERT INTO cliente(nome, sobrenome, usuario, email, cpf, data_nascimento, rua, bairro, cidade, uf, cep) 
VALUES('Mariane','Magalhães','Mari','marianesantosmagalhaes@hotmail.com','12345678900','1993-05-18',
'Rua Aparecida','Quitandinha','Petrópolis','RJ','25850041');

INSERT INTO cliente (nome, sobrenome, usuario, email, cpf, data_nascimento, rua, bairro, cidade, uf, cep) 
VALUES ('João','Paulo','JP','jp@hotmail.com','12345678911','1994-04-07','Rua Imperador',
'Centro','Petrópolis','RJ','25850040');

INSERT INTO cliente (nome, sobrenome, usuario, email, cpf, data_nascimento, rua, bairro, cidade, uf, cep) 
VALUES ('Adriana','Neves','Dri','dri@hotmail.com','12345678912','1992-03-05','Rua 13 de maio',
'Centro','Petrópolis','RJ','25850035');

INSERT INTO cliente (nome, sobrenome, usuario, email, cpf, data_nascimento, rua, bairro, cidade, uf, cep) 
VALUES('Matheus','Borges','MB','mb@hotmail.com','12348978911','1998-09-02','Rua Teresa','Centro',
'Petrópolis','RJ','25850031');

INSERT INTO cliente (nome, sobrenome, usuario, email, cpf, data_nascimento, rua, bairro, cidade, uf, cep) 
VALUES ('Fernanda','Meirelles','Fê','fe@hotmail.com','12857678911','1989-05-17','Rua Castro Alves',
'Centro','Três Rios','RJ','29850020');

-- inserindo dados de funcionários --
INSERT INTO funcionario (nome, cpf) values ('Pedro', '1578996545');
INSERT INTO funcionario (nome, cpf) values ('Maria', '8565696545');
INSERT INTO funcionario (nome, cpf) values ('Fábio', '2358978542');
INSERT INTO funcionario (nome, cpf) values ('Carlos', '5418963254');
INSERT INTO funcionario (nome, cpf) values ('Júlia', '2355489675');

-- inserindo dados de categorias ---
INSERT INTO categoria(nome, descricao) values ('Vestuário', 'roupas esportivas, roupas de banho');
INSERT INTO categoria(nome, descricao) values ('Eletroeletrônicos', 'tv, computadores, jogos');
INSERT INTO categoria(nome, descricao) values ('Alimentação', 'frios, carnes, legumes, laticinios');
INSERT INTO categoria(nome, descricao) values ('Farmácia', 'medicamentos, higiene pessoal, higiene infantis');
INSERT INTO categoria(nome, descricao) values ('Decoração', 'quadros, sofá, mesa, cama, rack');

-- inserindo dados do pedido ---
INSERT INTO pedido(data_pedido, id_cliente) values ('2023-03-25', 1);
INSERT INTO pedido(data_pedido, id_cliente) values ('2023-01-05', 2);
INSERT INTO pedido(data_pedido, id_cliente) values ('2022-06-17', 3);
INSERT INTO pedido(data_pedido, id_cliente) values ('2023-02-18', 4);
INSERT INTO pedido(data_pedido, id_cliente) values ('2023-03-02', 5);
INSERT INTO pedido(data_pedido, id_cliente) values ('2023-02-22', 2);

-- inserindo dados do produto ---
INSERT INTO produto (nome, descricao, quantidade_estoque, data_produto, valor, id_categoria, id_funcionario)
VALUES ('Tênis', 'tênis para corrida', 20, '2023-02-20', 100.0, 1, 1);
INSERT INTO produto (nome, descricao, quantidade_estoque, data_produto, valor, id_categoria, id_funcionario)
VALUES ('Notebook', 'notebook gamer', 15, '2023-01-05', 2500.0, 2, 2);
INSERT INTO produto (nome, descricao, quantidade_estoque, data_produto, valor, id_categoria, id_funcionario)
VALUES ('Pizza', 'calabresa, portuguesa', 30, '2023-03-15', 50.0, 3, 3);
INSERT INTO produto (nome, descricao, quantidade_estoque, data_produto, valor, id_categoria, id_funcionario)
VALUES ('Fralda', 'pampers, huggies, turma mônica, pompom', 100, '2023-02-27', 50.0, 4, 4);
INSERT INTO produto (nome, descricao, quantidade_estoque, data_produto, valor, id_categoria, id_funcionario)
VALUES ('Sofá', 'reclinável, poltrona, 4 lugares', 60, '2023-02-20', 1800.0, 5, 5);
INSERT INTO produto (nome, descricao, quantidade_estoque, data_produto, valor, id_categoria, id_funcionario)
VALUES ('Armário', 'madeira, duas portas, com gavetas', 23, '2023-02-20', 2100.0, 5, 5);
INSERT INTO produto (nome, descricao, quantidade_estoque, data_produto, valor, id_categoria, id_funcionario)
VALUES ('Celular', 'android, 4G, 256 gb', 41, '2022-05-24', 3200.0, 2, 2);
INSERT INTO produto (nome, descricao, quantidade_estoque, data_produto, valor, id_categoria, id_funcionario)
VALUES ('Medidor de glicose', 'aparelho eletrônico mede glicose', 38, '2022-12-11', 90.0, 4, 4);
INSERT INTO produto (nome, descricao, quantidade_estoque, data_produto, valor, id_categoria, id_funcionario)
VALUES ('Televisão', '4k, som dolby digital, smartTV 50', 45, '2023-01-14', 2600.0, 2, 2);
INSERT INTO produto (nome, descricao, quantidade_estoque, data_produto, valor, id_categoria, id_funcionario)
VALUES ('Teste COVID-19', 'autoteste antígeno nasal', 75, '2023-02-27', 45.9, 4, 4);

-- inserindo dados do pedido_produto
INSERT INTO pedido_produto (quantidade, id_pedido, id_produto) VALUES (2, 1, 1);
INSERT INTO pedido_produto (quantidade, id_pedido, id_produto) VALUES (2, 2, 2);
INSERT INTO pedido_produto (quantidade, id_pedido, id_produto) VALUES (10, 3, 3);
INSERT INTO pedido_produto (quantidade, id_pedido, id_produto) VALUES (10, 4, 4);
INSERT INTO pedido_produto (quantidade, id_pedido, id_produto) VALUES (1, 5, 5);
INSERT INTO pedido_produto (quantidade, id_pedido, id_produto) VALUES (1, 2, 9);

-- SQL ALTERANDO registro de produto ---
UPDATE produto
SET descricao = 'pampers, huggies, turma mônica'
WHERE id = 4;

-- SQL EXCLUSÃO de registro de pedido --
INSERT INTO pedido_produto (quantidade, id_pedido, id_produto) values (1, 2, 9);
                            -- primeiro inseriu novamente pedido 6 para excluir

DELETE FROM pedido_produto -- exclusão do registro adicionado errado
WHERE id = 6;

-- comando SQLite para não permitir associar a FK que não existe --
PRAGMA foreign_keys = ON;

---- SQLs DE CONSULTAS -----
-- consulta produtos
SELECT * 
FROM produto;

-- consulta de quantidade de produtos em estoque, se estiver sem, informa ESGOTADO ---
UPDATE produto -- alteramos o produto 8 para qtd zero
SET quantidade_estoque = 0
WHERE id = 8

SELECT nome, 
	   CASE WHEN quantidade_estoque IS 0 THEN "Esgotado"
	   ELSE quantidade_estoque
	   END AS quantidade_estoque
FROM produto;

UPDATE produto   --adiciona a quantidade em estoque
SET quantidade_estoque = 38
WHERE id = 8; 

-- consulta produto com letra 'a' no meio 
SELECT nome
FROM produto
WHERE nome LIKE '%a%';

-- lista nome e quantidade_estoque do produto em ordem descrescente e limitado a 3
SELECT nome,
	quantidade_estoque
FROM produto
ORDER BY quantidade_estoque desc
LIMIT 3;

-- contagem de produtos da loja com a letra T
SELECT count(*) AS produtos_t
FROM produto
WHERE nome LIKE 'T%';

-- contagem de total de vendas de cada vendedor
SELECT f.nome AS nome,
	   COUNT(*) AS total_vendas
FROM pedido p
INNER JOIN pedido_produto pp ON p.id = pp.id_pedido
INNER JOIN produto pro ON pro.id = pp.id_produto
INNER JOIN funcionario f ON f.id = pro.id_funcionario
GROUP BY f.nome
ORDER BY total_vendas DESC;

-- seleciona produto mais vendido com id do cliente
SELECT p.id_cliente,
	   max(pp.quantidade) AS quantidade,
	   pro.nome
FROM pedido_produto pp,
	 pedido p,
	 produto pro
WHERE p.id = pp.id_pedido
AND pro.id = pp.id_produto;

-- seleciona produto menos vendido e id do cliente
SELECT p.id_cliente,
	   min (pp.quantidade),
	   pro.nome
FROM pedido_produto pp, pedido p, produto pro
WHERE p.id = pp.id_pedido
AND pro.id = pp.id_produto;

-- mostra setores e funcionários responsáveis
SELECT DISTINCT ca.nome AS setor, 
	   f.nome AS responsavel
FROM funcionario f
INNER JOIN produto pro ON f.id = pro.id_funcionario
INNER JOIN categoria ca ON ca.id = pro.id_categoria;

-- listar valor do pedido dos clientes que começam com 'M'
SELECT c.nome AS cliente, 
	   pro.valor * pp.quantidade AS valor_pedido
FROM cliente c,
	 pedido p,
	 pedido_produto pp,
	 produto pro
WHERE c.id = p.id_cliente
AND p.id = pp.id_pedido
AND pro.id = pp.id_produto
AND c.nome like 'M%'
ORDER BY 2 DESC;

-- listar valor do pedido dos clientes que começam com 'M' com INNER JOIN
SELECT c.nome AS cliente,
	   pro.valor * pp.quantidade AS valor_pedido
FROM cliente c
INNER JOIN pedido p ON c.id = p.id_cliente
INNER JOIN pedido_produto pp ON p.id = pp.id_pedido
INNER JOIN produto pro ON pro.id = pp.id_produto
AND c.nome like 'M%'
ORDER BY 2 DESC;

-- seleciona nome de três clientes e data do pedido
SELECT c.nome AS nome_cliente, 
       p.data_pedido AS data_pedido
FROM cliente c,
     pedido p
WHERE c.id = p.id_cliente
AND p.id_cliente BETWEEN 3 AND 5
ORDER BY c.nome DESC;

-- seleciona nome de três clientes, data do pedido e produto com INNER JOIN
SELECT c.nome AS nome_cliente,
       p.data_pedido AS data_pedido,
       pro.nome AS nome_produto
FROM cliente c
INNER JOIN pedido p ON c.id = p.id_cliente
INNER JOIN pedido_produto pp ON p.id = pp.id_pedido
INNER JOIN produto pro ON pro.id = pp.id_produto
WHERE c.id BETWEEN 3 AND 5
ORDER BY p.data_pedido DESC;

-- listar compras pela letra inicial do cliente, se houver erro no nome  ---
SELECT c.nome AS nome_cliente, 
       p.data_pedido AS data_pedido,
       pro.nome AS nome_produto,
       pro.valor AS valor_produto,
       pp.quantidade AS quantidade_comprada,
       (pro.valor * pp.quantidade) AS valor_total
FROM cliente c
INNER JOIN pedido p ON c.id = p.id_cliente
INNER JOIN pedido_produto pp ON p.id = pp.id_pedido
INNER JOIN produto pro ON pro.id = pp.id_produto
WHERE p.id IN (SELECT id
			   FROM cliente
			   WHERE nome LIKE 'M%')
ORDER BY p.data_pedido DESC;

--- SQL para gerar nota fical por número do pedido --
SELECT c.nome AS nome_cliente, 
       c.cpf AS cpf,
       p.data_pedido AS data_pedido,
       pro.nome AS nome_produto,
       pro.valor AS valor_produto,
       pp.quantidade AS quantidade_comprada,
       (pro.valor * pp.quantidade) AS valor_total
FROM cliente c
INNER JOIN pedido p ON c.id = p.id_cliente
INNER JOIN pedido_produto pp ON p.id = pp.id_pedido
INNER JOIN produto pro ON pro.id = pp.id_produto
WHERE pp.id = '2';  -- alterar número do pedido_produto para buscar conforme o que quiser

---- SQL para GERAR NOTA FISCAL por CPF ---
SELECT c.nome AS nome_cliente,
       c.cpf AS cpf,
       p.data_pedido AS data_pedido,
       pro.nome AS nome_produto,
       pro.valor AS valor_produto,
       pp.quantidade AS quantidade_comprada,
       (pro.valor * pp.quantidade) AS valor_total
FROM cliente c
INNER JOIN pedido p ON c.id = p.id_cliente
INNER JOIN pedido_produto pp ON p.id = pp.id_pedido
INNER JOIN produto pro ON pro.id = pp.id_produto
WHERE c.cpf = '12857678911';  -- alterar CPF conforme a nota que deseja

-- criando VIEW de emissão da nota fiscal por CPF ---
CREATE VIEW notafiscal_cpf AS
SELECT c.nome AS nome_cliente,
	   c.cpf AS cpf,
       p.data_pedido AS data_pedido,
       pro.nome AS nome_produto,
       pro.valor AS valor_produto,
       pp.quantidade AS quantidade_comprada,
       (pro.valor * pp.quantidade) AS valor_total
FROM cliente c
INNER JOIN pedido p ON c.id = p.id_cliente
INNER JOIN pedido_produto pp ON p.id = pp.id_pedido
INNER JOIN produto pro ON pro.id = pp.id_produto

SELECT * FROM notafiscal_cpf  -- busca o CPF pela VIEW para emissão da nota
WHERE cpf = '12348978911';