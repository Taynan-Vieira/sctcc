create table if not exists public.tcc01_curso
(
    tcc01_cod_curso bigint not null,
    tcc01_descricao varchar(255),

    constraint pktcc01_cod_curso primary key (tcc01_cod_curso)
);