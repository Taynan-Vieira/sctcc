create table if not exists public.tcc04_trabalho_professor
(
    tcc04_cod_trabalho_professor bigint not null,
    fktcc04tcc03_cod_trabalho bigint not null,
    fktcc04tcc05_cod_professor bigint not null,

    constraint pktcc04_cod_trabalho_professor primary key (tcc04_cod_trabalho_professor),
    constraint fktcc04tcc03_cod_trabalho foreign key (fktcc04tcc03_cod_trabalho)
    references tcc03_trabalho (tcc03_cod_trabalho),
    constraint fktcc04tcc05_cod_professor foreign key (fktcc04tcc05_cod_professor)
    references tcc05_professor (tcc05_cod_professor)
);