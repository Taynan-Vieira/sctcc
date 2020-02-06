create table if not exists public.tcc09_tipo_avaliacao
(
    tcc09_cod_tipo_avaliacao bigint not null,
    tcc09_descricao varchar(255),

    constraint pktcc09_cod_tipo_avaliacao primary key (tcc09_cod_tipo_avaliacao)
);