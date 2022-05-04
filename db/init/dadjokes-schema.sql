create schema dadjokes;

alter schema dadjokes owner to dad;

create table dadjokes.jokes
(
    id       serial
        constraint jokes_pk
            primary key,
    question text not null,
    answer   text not null,
    constraint jokes_pk_2
        unique (question, answer)
);

alter table dadjokes.jokes
    owner to dad;

insert into dadjokes.jokes (id, question, answer) values (1, 'What does a baby computer call his father?', 'Data');
