create database progweb;
USE progweb;

CREATE TABLE alunos (
id INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
email VARCHAR(255),
endereco VARCHAR(255),
PRIMARY KEY (id)
);

INSERT INTO alunos (nome,email,endereco) VALUES ('Pedro','pedro@gmail.com','Rua das Flores, 13');
INSERT INTO alunos (nome,email,endereco) VALUES ('Ana','ana@gmail.com','Rua das Flores, 13');
INSERT INTO alunos (nome,email,endereco) VALUES ('Carlos','carlos@gmail.com','Rua Padre Afonso, 27');
INSERT INTO alunos (nome,email,endereco) VALUES ('Vanessa','vanessa@gmail.com','Av. Paulista, 212');

select * from alunos;
update alunos SET email='pp@gmail.com', endereco='av. dos estados, 5001' where id=1;
select * from alunos;