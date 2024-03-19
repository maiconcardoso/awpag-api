package com.algaworks.awpag.awpagapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.awpag.model.ClienteModel;

@RestController
public class ClienteController {
    
    @GetMapping("/clientes")
    public List<ClienteModel> lista() {
        var cliente1 = new ClienteModel();
        cliente1.setId(1L);
        cliente1.setNome("João");
        cliente1.setEmail("joaodascouves@gmail.com");
        cliente1.setTelefone("44 3425 2978");

        var cliente2 = new ClienteModel();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setEmail("mariadasilva@hotmail.com");
        cliente2.setTelefone("44 3425 2973");

        return Arrays.asList(cliente1, cliente2);
    }
}
