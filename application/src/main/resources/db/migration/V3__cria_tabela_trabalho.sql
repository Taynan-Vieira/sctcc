create table if not exists public.tcc03_trabalho
(
    tcc03_cod_trabalho bigint not null,
    tcc03_tema varchar(255),
    tcc03_status varchar(255),
    fktcc03tcc02_cod_aluno bigint not null ,

    constraint pktcc03_cod_trabalho primary key (tcc03_cod_trabalho),
    constraint fktcc03tcc02_cod_aluno foreign key (fktcc03tcc02_cod_aluno)
    references tcc02_aluno (tcc02_cod_aluno)
);