create database biblioteca;

-- public.alunos definition

-- Drop table

-- DROP TABLE public.aluno;

CREATE TABLE public.aluno (
	numeromatriculaaluno serial NOT NULL,
	nome varchar(100) NOT NULL,
	datanascimento date NULL,
	cpf bpchar(11) NULL,
	logradouro varchar(100) NULL,
	numerologradouro varchar(10) NULL,
	complemento varchar(50) NULL,
	bairro varchar(50) NULL,
	cidade varchar(50) NULL,
	CONSTRAINT alunos_cpf_key UNIQUE (cpf),
	CONSTRAINT alunos_pkey PRIMARY KEY (numeromatriculaaluno)
);


-- public.editora definition

-- Drop table

-- DROP TABLE public.editora;

CREATE TABLE public.editora (
	codigoeditora serial NOT NULL,
	nome varchar(50) NOT NULL,
	imagem_nome varchar(255),
	imagem_filename varchar(255),
	imagem_url varchar(255),	
	CONSTRAINT editora_pkey PRIMARY KEY (codigoeditora)
);


-- public.emprestimo definition

-- Drop table

-- DROP TABLE public.emprestimo;

CREATE TABLE public.emprestimo (
	codigoemprestimo serial NOT NULL,
	numeromatriculaaluno int4 NOT NULL,
	codigolivro int4 NOT NULL,
	dataemprestimo date NOT NULL DEFAULT now(),
	dataentrega date NULL,
	valoremprestimo numeric(10,2) NULL,
	CONSTRAINT emprestimo_pkey PRIMARY KEY (codigoemprestimo)
);


-- public.livros definition

-- Drop table

-- DROP TABLE public.livros;

CREATE TABLE public.livro (
	codigolivro serial NOT NULL,
	nomelivro varchar(120) NOT NULL,
	nomeautor varchar(100) NULL,
	datalancamento date NULL,
	codigoisbn int4 NOT NULL,
	codigoeditora int4 NOT NULL,
	CONSTRAINT livros_pkey PRIMARY KEY (codigolivro)
);

CREATE TABLE public.usuario (
	user_id serial NOT NULL,
	user_nome varchar(255) NOT NULL,
	user_email varchar(255) NOT NULL,
	user_password varchar(100) NOT NULL,
	UNIQUE (user_email),
	PRIMARY KEY (user_id)
);

--ALTER TABLE usuario ADD CONSTRAINT unique_email UNIQUE(user_email);

--Chaves estrangeira
ALTER TABLE emprestimo ADD FOREIGN KEY (codigolivro) REFERENCES livro(codigolivro);

ALTER TABLE emprestimo ADD FOREIGN KEY (numeromatriculaaluno) REFERENCES aluno(numeromatriculaaluno);

ALTER TABLE livro ADD FOREIGN KEY (codigoeditora) REFERENCES editora(codigoeditora);

--Imagens da Editora (para hospedagem no freeimagehost)
--ALTER TABLE editora ADD COLUMN imagem_nome varchar(255);
--ALTER TABLE editora ADD COLUMN imagem_filename varchar(255);
--ALTER TABLE editora ADD COLUMN imagem_url varchar(255);