CREATE DATABASE IF NOT EXISTS db_locadora;

USE db_locadora;

CREATE TABLE IF NOT EXISTS tb_cidade(
	cd_cidade INT NOT NULL AUTO_INCREMENT,
    nm_cidade VARCHAR(45) NOT NULL,
    CONSTRAINT pk_cidade PRIMARY KEY(cd_cidade)
);

CREATE TABLE IF NOT EXISTS tb_bairro(
	cd_bairro INT NOT NULL AUTO_INCREMENT,
    nm_bairro VARCHAR(64) NOT NULL,
    cd_cidade INT NOT NULL,
    CONSTRAINT pk_bairro PRIMARY KEY(cd_bairro),
    CONSTRAINT fk_bairro_cidade FOREIGN KEY(cd_cidade) REFERENCES tb_cidade(cd_cidade)
);

CREATE TABLE IF NOT EXISTS tb_endereco(
	cd_endereco INT NOT NULL AUTO_INCREMENT,
    nm_endereco VARCHAR(64) NOT NULL,
    cd_cep CHAR(8) NOT NULL,
    cd_bairro INT NOT NULL,
    CONSTRAINT pk_endereco PRIMARY KEY(cd_endereco),
    CONSTRAINT uk_cep_endereco UNIQUE KEY(cd_cep),
    CONSTRAINT fk_endereco_bairro FOREIGN KEY(cd_bairro) REFERENCES tb_bairro(cd_bairro)
);

CREATE TABLE IF NOT EXISTS tb_residencia(
	cd_residencia INT NOT NULL AUTO_INCREMENT,
    nr_residencia VARCHAR(5) NOT NULL,
    ds_complemento VARCHAR(45),
    cd_endereco INT NOT NULL,
    CONSTRAINT pk_residencia PRIMARY KEY(cd_residencia),
    CONSTRAINT fk_residencia_endereco FOREIGN KEY(cd_endereco) REFERENCES tb_endereco(cd_endereco)
);

CREATE TABLE IF NOT EXISTS tb_usuario(
	cd_usuario INT NOT NULL AUTO_INCREMENT,
    nm_usuario VARCHAR(64) NOT NULL,
    cd_cpf CHAR(11) NOT NULL,
    cd_residencia INT NOT NULL,
    cd_celular CHAR(9) NOT NULL,
    cd_ddd_celular CHAR(3) NOT NULL,
    cd_email VARCHAR(64) NOT NULL,
    CONSTRAINT pk_usuario PRIMARY KEY(cd_usuario),
    CONSTRAINT cd_cpf_usuario UNIQUE KEY(cd_cpf),
    CONSTRAINT cd_email_usuario UNIQUE KEY(cd_email),
    CONSTRAINT cd_residencia FOREIGN KEY(cd_residencia) REFERENCES tb_residencia(cd_residencia)
);

CREATE TABLE IF NOT EXISTS tb_filme(
	cd_filme INT NOT NULL AUTO_INCREMENT,
    nm_filme VARCHAR(64) NOT NULL,
    ds_filme VARCHAR(255),
    dt_lancamento DATE,
    cd_usuario INT,
    CONSTRAINT pk_filme PRIMARY KEY(cd_filme),
    CONSTRAINT uk_nome_filme UNIQUE KEY(nm_filme),
    CONSTRAINT cd_usuario FOREIGN KEY(cd_usuario) REFERENCES tb_usuario(cd_usuario)
);

CREATE TABLE IF NOT EXISTS tb_avaliacao(
	cd_avaliacao INT NOT NULL AUTO_INCREMENT,
    vl_avaliacao TINYINT(2) NOT NULL,
    ic_ativo BIT DEFAULT TRUE,
    dt_avaliacao DATE NOT NULL,
    cd_usuario INT NOT NULL,
    cd_filme INT NOT NULL,
    CONSTRAINT pk_avaliacao PRIMARY KEY(cd_avaliacao),
    CONSTRAINT fk_avaliacao_usuario FOREIGN KEY(cd_usuario) REFERENCES tb_usuario(cd_usuario),
    CONSTRAINT fk_avaliacao_filme FOREIGN KEY(cd_filme) REFERENCES tb_filme(cd_filme)
);

CREATE TABLE IF NOT EXISTS tb_categoria(
	cd_categoria INT NOT NULL AUTO_INCREMENT,
    nm_categoria VARCHAR(64) NOT NULL,
    CONSTRAINT pk_categoria PRIMARY KEY(cd_categoria),
    CONSTRAINT uk_nome_categoria UNIQUE KEY(nm_categoria)
);

CREATE TABLE IF NOT EXISTS categoria_filme(
	cd_categoria INT NOT NULL,
    cd_filme INT NOT NULL,
    CONSTRAINT pk_categoria_filme PRIMARY KEY(cd_categoria, cd_filme),
    CONSTRAINT fk_categoria_filme FOREIGN KEY(cd_categoria) REFERENCES tb_categoria(cd_categoria),
    CONSTRAINT fk_filme_categoria FOREIGN KEY(cd_filme) REFERENCES tb_filme(cd_filme)
);