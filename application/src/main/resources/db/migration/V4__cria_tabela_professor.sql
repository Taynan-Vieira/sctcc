create table if not exists public.tcc05_professor
(
    tcc05_cod_professor bigint not null,
    tcc05_nome varchar(255),
    tcc05_matricula varchar(255),
    tcc05_senha varchar(255),
    tcc05_examinador boolean,

    constraint pktcc05_cod_professor primary key (tcc05_cod_professor)
);