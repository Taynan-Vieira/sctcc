---POPULANDO TABELA AVALIACAO---
INSERT INTO tcc09_tipo_avaliacao(tcc09_cod_tipo_avaliacao, tcc09_descricao)
VALUES (1, 'ESCRITA'),
       (2, 'ORAL');

---POPULANDO TABELA ITEM---
INSERT INTO tcc08_item(tcc08_cod_item, tcc08_descricao, fktcc08tcc09_cod_tipo_avaliacao)
VALUES (1, 'CONTEUDO', 1),
       (2, 'REDACAO', 1),
       (3, 'NORMALIZACAO', 1),
       (4, 'CAPACITACAO DE EXPOSICAO', 2),
       (5, 'RESPOSTAS AS ARGUICOES', 2),
       (6, 'PREVISAO DO TEMPO', 2);

---POPULANDO TABELA CURSO---
INSERT INTO tcc01_curso(tcc01_cod_curso, tcc01_descricao)
VALUES (1, 'SISTEMAS DE INFORMACAO'),
       (2, 'ENGENHARIA CIVIL'),
       (3, 'QUIMICA'),
       (4, 'BIOLOGIA');

---POPULANDO TABELA ALUNO---
INSERT INTO tcc02_aluno (tcc02_cod_aluno, tcc02_nome, tcc02_matricula, fktcc02tcc01_cod_curso)
VALUES (1, 'MAYA FABIANA RAFAELA ALMEIDA', 'SI150374072', 1),
       (2, 'BENTO DANILO CAUA CALDEIRA', 'SI156973967', 1),
       (3, 'SEBASTIAO HENRY HEITOR DE PAULA', 'SI158788110', 1),
       (4, 'VICTOR IAN BERNARDO SILVEIRA', 'SI158673445', 1),
       (5, 'REGINA ISABELLY CAVALCANTI', 'SI157774331', 1),
       (6, 'GIOVANA NAIR ANDREA DAS NEVES', 'SI158206099', 1);

---POPULANDO TABELA TRABALHO---
INSERT INTO tcc03_trabalho (tcc03_cod_trabalho, tcc03_tema, tcc03_status, fktcc03tcc02_cod_aluno)
VALUES (1, 'TECNOLOGIAS REATIVAS', 'ABERTO', 1),
       (2, 'PRIVACIDADE NA INTERNET', 'ABERTO', 2),
       (3, 'POLÍTICA DE SEGURANÇA DA INFORMAÇÃO EMPRESARIAL', 'ABERTO', 3),
       (4, 'PASSADO E FUTURO DA UML', 'ABERTO', 4),
       (5, 'ESTUDO DE SEGURANÇA APLICADO AO PROTOCOLO SIP', 'ABERTO', 5),
       (6, 'COMPUTAÇÃO EM CLUSTER', 'ABERTO', 6);

---POPULANDO TABELA PROFESSOR---
INSERT INTO tcc05_professor (tcc05_cod_professor, tcc05_nome, tcc05_matricula, tcc05_senha)
VALUES (1, 'IAN HEITOR MORAES', 'PF237827', '91f5167c34c400758115c2a6826ec2e3'),
       (2, 'CAIO SAMUEL ANTONIO OLIVEIRA', 'PF432092', '91f5167c34c400758115c2a6826ec2e3'),
       (3, 'PAULO FERNANDO BRITO', 'PF679690', '91f5167c34c400758115c2a6826ec2e3');

---POPULANDO TABELA TRABALHO_PROFESSOR---
INSERT INTO tcc04_trabalho_professor (tcc04_cod_trabalho_professor, tcc04_examinador, fktcc04tcc03_cod_trabalho,
                                      fktcc04tcc05_cod_professor)
VALUES (1, 'NAO', 1, 1),
       (2, 'SIM', 1, 2),
       (3, 'SIM', 1, 3),
       (4, 'NAO', 2, 2),
       (5, 'SIM', 2, 1),
       (6, 'SIM', 2, 3),
       (7, 'NAO', 3, 3),
       (8, 'SIM', 3, 1),
       (9, 'SIM', 3, 2),
       (10, 'NAO', 4, 1),
       (11, 'SIM', 4, 2),
       (12, 'SIM', 4, 3),
       (13, 'NAO', 5, 2),
       (14, 'SIM', 5, 1),
       (15, 'SIM', 5, 3),
       (16, 'NAO', 6, 3),
       (17, 'SIM', 6, 1),
       (18, 'SIM', 6, 2);
