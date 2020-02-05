create table if not exists public.tcc08_item
(
    tcc08_cod_item bigint not null,
    tcc08_descricao varchar(255),

    constraint pktcc08_cod_item primary key (tcc08_cod_item)
);