# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table checkstore (
  check_id                  integer auto_increment not null,
  storename                 varchar(255),
  user                      varchar(255),
  description               varchar(255),
  constraint pk_checkstore primary key (check_id))
;

create table comment (
  comment_id                integer auto_increment not null,
  commodity_id              integer,
  user                      varchar(255),
  content                   varchar(255),
  time                      varchar(255),
  constraint pk_comment primary key (comment_id))
;

create table commodity (
  commodity_id              integer auto_increment not null,
  commodity_name            varchar(255),
  price                     double,
  agio                      double,
  picture                   varchar(255),
  c_type                    varchar(255),
  user                      varchar(255),
  constraint pk_commodity primary key (commodity_id))
;

create table paper (
  issueid                   integer auto_increment not null,
  title                     varchar(255),
  author                    varchar(255),
  content                   varchar(255),
  time                      varchar(255),
  constraint pk_paper primary key (issueid))
;

create table store (
  store_id                  integer auto_increment not null,
  storename                 varchar(255),
  user                      varchar(255),
  description               varchar(255),
  time                      varchar(255),
  constraint pk_store primary key (store_id))
;

create table user (
  username                  varchar(255),
  password                  varchar(255),
  powerid                   integer)
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table checkstore;

drop table comment;

drop table commodity;

drop table paper;

drop table store;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

