
INSERT INTO tb_categoria (descricao) VALUES ('Curso');
INSERT INTO tb_categoria (descricao) VALUES ('Oficina');

INSERT INTO tb_atividade (nome, descricao, preco, id_categoria) VALUES ('Curso de HTML', 'Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO tb_atividade (nome, descricao, preco, id_categoria) VALUES ('Oficina de GitHub', 'Controle versões de seus projetos', 50.00, 2);


INSERT INTO tb_bloco (id_atividade, inicio, fim) VALUES (1, TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T14:00:00Z');
INSERT INTO tb_bloco (id_atividade, inicio, fim) VALUES (2, TIMESTAMP WITH TIME ZONE '2017-09-25T17:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T21:00:00Z');
INSERT INTO tb_bloco (id_atividade, inicio, fim) VALUES (2, TIMESTAMP  WITH TIME ZONE '2017-09-26T11:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-26T14:00:00Z');

INSERT INTO tb_participante (nome, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Maria do Rosário', 'maria@gmail.com');
INSERT INTO tb_participante (nome, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

