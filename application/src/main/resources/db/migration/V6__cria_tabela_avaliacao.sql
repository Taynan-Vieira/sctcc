create table if not exists public.tcc06_avaliacao
(
    tcc06_cod_avaliacao bigint not null,
    tcc06_nota_final double precision,
    fktcc06tcc03_cod_trabalho bigint not null,

    constraint pktcc06_cod_avaliacao primary key (tcc06_cod_avaliacao),
    constraint fktcc06tcc03_cod_trabalho foreign key (fktcc06tcc03_cod_trabalho)
    references tcc03_trabalho (tcc03_cod_trabalho)

);