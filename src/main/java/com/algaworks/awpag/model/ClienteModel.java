package com.algaworks.awpag.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteModel {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
}