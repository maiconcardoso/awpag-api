package com.algaworks.awpag.awpagapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.awpag.model.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@RestController
public class ClienteController {

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("/clientes")
    public List<Cliente> lista() {
        return manager.createQuery("from Cliente", Cliente.class)
            .getResultList();
    }
}
