create table if not exists public.tcc08_item
(
    tcc08_cod_item bigint not null,
    tcc08_descricao varchar(255),
    fktcc08tcc09_cod_tipo_avaliacao bigint not null ,

    constraint pktcc08_cod_item primary key (tcc08_cod_item),
    constraint fktcc08tcc09_cod_tipo_avaliacao foreign key (fktcc08tcc09_cod_tipo_avaliacao)
    references tcc09_tipo_avaliacao (tcc09_cod_tipo_avaliacao)
);