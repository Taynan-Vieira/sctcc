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


