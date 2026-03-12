package com.projeto.crud.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.crud.model.Cliente;
import com.projeto.crud.service.ServiceCliente;

@RestController
@RequestMapping("clientes")
public class ControllerCliente {
    
    private ServiceCliente serviceCliente;
    // Injeção por construtor
    public ControllerCliente(ServiceCliente serviceCliente){
        this.serviceCliente = serviceCliente;
    }

    @PostMapping("/cadastrar")
    public List<Cliente> cadastraCliente(@RequestBody Cliente clienteCreate){
        return serviceCliente.create(clienteCreate);
    }

    @GetMapping("/listar")
    public List<Cliente> listaCliente(){
        return serviceCliente.list();
    }

    @PutMapping("/editar")
    public List<Cliente> editarCliente(@RequestBody Cliente clienteUpdate){
        return serviceCliente.create(clienteUpdate);
    }

    @DeleteMapping("/deletar/{id}")
    public List<Cliente> deletaCliente(@PathVariable Long id){
        return serviceCliente.delete(id);
    }
}
