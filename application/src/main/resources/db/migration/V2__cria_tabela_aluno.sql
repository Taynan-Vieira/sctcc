create table if not exists public.tcc02_aluno
(
    tcc02_cod_aluno bigint not null,
    tcc02_nome varchar(255),
    tcc02_matricula varchar(255),
    fktcc02tcc01_cod_curso bigint not null,

    constraint pktcc02_cod_aluno primary key (tcc02_cod_aluno),
    constraint fktcc02tcc01_cod_curso foreign key (fktcc02tcc01_cod_curso)
    references tcc01_curso (tcc01_cod_curso)
);