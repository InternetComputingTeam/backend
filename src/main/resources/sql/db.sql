-- user_table
create table user
(
    user_id varchar(256) not null,
    country varchar(32) null,
    province varchar(32) null,
    city varchar(32) null,
    gender int not null,
    lang varchar(32) null,
    nick_name varchar(32) not null,
    avatar_url varchar(256) not null,
    score int default 0 not null
)
    comment 'user table';

create unique index user_user_id_uindex
    on user (user_id);

alter table user
    add constraint user_pk
        primary key (user_id);

-- task_table
create table task
(
    task_id int auto_increment,
    user_id VARCHAR(256) not null,
    title varchar(32) not null,
    start_time datetime not null,
    end_time datetime not null,
    priority int not null,
    detail varchar(512) null,
    status int default 0 not null,
    constraint task_table_pk
        primary key (task_id),
    constraint task_table_user_id_fk
        foreign key (user_id) references user (user_id)
            on update cascade on delete cascade
);

-- comment
create table comment
(
    comment_id int auto_increment,
    user_id varchar(256) not null,
    comment_time datetime not null,
    constraint comment_pk
        primary key (comment_id),
    constraint comment_user_user_id_fk
        foreign key (user_id) references user (user_id)
            on update cascade on delete cascade
);