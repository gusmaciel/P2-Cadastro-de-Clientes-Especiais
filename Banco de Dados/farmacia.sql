CREATE DATABASE farmacia;

USE farmacia;

CREATE TABLE cidade (
  id INTEGER NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,  
  PRIMARY KEY(id)
)
ENGINE = InnoDB;

INSERT INTO cidade (nome) VALUES ('Bragança Paulista');
INSERT INTO cidade (nome) VALUES ('Campinas');
INSERT INTO cidade (nome) VALUES ('São Paulo');

CREATE TABLE cliente (
	id INTEGER NOT NULL AUTO_INCREMENT,
	nome VARCHAR (50) NOT NULL,
	endereco VARCHAR (50) NOT NULL,
	telefone VARCHAR (15) NOT NULL,
	dataNascimento DATE NOT NULL,
	cidade_id INTEGER NOT NULL ,
	PRIMARY KEY (id) ,
	CONSTRAINT fk_cidade 
	FOREIGN KEY fk_cidade (cidade_id)	
	REFERENCES cidade (id)
	ON DELETE RESTRICT
	ON UPDATE RESTRICT
)
ENGINE = InnoDB;

INSERT INTO cliente (nome, endereco, telefone, dataNascimento, cidade_id) VALUES ('João Pedro', 'R XV de Novembro, 15',  '(11) 1234-5678', '1956-05-10', 1);
INSERT INTO cliente (nome, endereco, telefone, dataNascimento, cidade_id) VALUES ('Maria Silva', 'R 13 de Maio, 13',  '(11) 5678-9012', '1950-11-15', 2);

