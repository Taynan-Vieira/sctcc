create table if not exists public.tcc09_item_avaliacao
(
    tcc09_cod_item_avaliacao bigint not null,
    fktcc09tcc06_cod_avaliacao bigint not null,
    fktcc09tcc08_cod_item bigint not null,

    constraint pktcc09_item_avaliacao primary key (tcc09_cod_item_avaliacao),
    constraint fktcc09tcc06_cod_avaliacao foreign key (fktcc09tcc06_cod_avaliacao)
    references tcc06_avaliacao (tcc06_cod_avaliacao),
    constraint fktcc09tcc08_cod_item foreign  key (fktcc09tcc08_cod_item)
    references tcc08_item (tcc08_cod_item)
);