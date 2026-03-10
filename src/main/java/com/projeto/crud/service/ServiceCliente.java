package com.projeto.crud.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.projeto.crud.model.Cliente;
import com.projeto.crud.repository.RepositoryCliente;

@Service
public class ServiceCliente {

    private RepositoryCliente repositoryCliente;
    // Injeção por construtor
    public ServiceCliente(RepositoryCliente repositoryCliente){
        this.repositoryCliente = repositoryCliente;
    }

    public List<Cliente> create(Cliente usuarioCreate){
        repositoryCliente.save(usuarioCreate);
        return list();
    }

    public List<Cliente> list(){
        Sort sort = Sort.by("userName").ascending();
        return repositoryCliente.findAll(sort);
    }

    public List<Cliente> update(Cliente usuarioUpdate){
        repositoryCliente.save(usuarioUpdate);
        return list();
    }

    public List<Cliente> delete(Long id){
        repositoryCliente.deleteById(id);
        return list();
    }
}
