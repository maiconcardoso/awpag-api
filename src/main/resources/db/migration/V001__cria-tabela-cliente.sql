create table cliente (
	id bigint not null auto_increment,
    nome varchar(50) not null,
    email varchar(50) not null,
    telefone varchar(20) not null,
    
    primary key (id)
);

alter table cliente add constraint uk_cliente unique (email);