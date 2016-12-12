# --- First database schema

# --- !Ups

create table comida (
  id                        bigint not null,
  name                      varchar(255),
  tipodecomida					bigint not null,
  calorias					bigint not null,
  constraint pk_comida primary key (id))
;


create sequence Comida_seq start with 1000;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists Comida;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists Comida_seq;