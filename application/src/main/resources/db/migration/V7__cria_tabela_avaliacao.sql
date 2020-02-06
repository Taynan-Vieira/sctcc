create table if not exists public.tcc06_avaliacao
(
    tcc06_cod_avaliacao bigint not null,
    tcc06_nota_final double precision,
    fktcc06tcc03_cod_trabalho bigint,
    fktcc06tcc09_cod_tipo_avaliacao bigint,

    constraint pktcc06_cod_avaliacao primary key (tcc06_cod_avaliacao),
    constraint fktcc06tcc03_cod_trabalho foreign key (fktcc06tcc03_cod_trabalho)
    references tcc03_trabalho (tcc03_cod_trabalho),
    constraint fktcc06tcc09_cod_tipo_avaliacao foreign key (fktcc06tcc09_cod_tipo_avaliacao)
    references tcc09_tipo_avaliacao (tcc09_cod_tipo_avaliacao)
);