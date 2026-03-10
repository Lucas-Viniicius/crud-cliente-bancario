package com.projeto.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.crud.model.Cliente;

public interface RepositoryCliente extends JpaRepository<Cliente, Long>{

}
