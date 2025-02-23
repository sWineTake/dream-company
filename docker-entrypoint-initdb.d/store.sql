USE dream;
create table if not exists store
(
    id           bigint auto_increment primary key,
    name         varchar(40)           not null,
    head_store   bigint                null comment '본사의 PK',
    expired_at   datetime              null comment '폐점 일자',
    expired_type boolean default false not null comment '폐점 타입'
) comment '매장명';

