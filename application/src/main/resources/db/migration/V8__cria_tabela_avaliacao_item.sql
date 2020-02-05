create table if not exists public.tcc07_avaliacao_item
(
    tcc07_cod_avaliacao_item bigint not null,
    tcc07_comentario varchar(255),
    tcc07_nota double precision,
    fktcc07tcc06_cod_avaliacao bigint not null,
    fktcc07tcc08_cod_item bigint not null,

    constraint pktcc07_cod_avaliacao_item primary key (tcc07_cod_avaliacao_item),
    constraint fktcc07tcc06_cod_avaliacao foreign key (fktcc07tcc06_cod_avaliacao)
    references tcc06_avaliacao (tcc06_cod_avaliacao),
    constraint fktcc07tcc08_cod_item foreign key (fktcc07tcc08_cod_item)
    references tcc08_item (tcc08_cod_item)
);