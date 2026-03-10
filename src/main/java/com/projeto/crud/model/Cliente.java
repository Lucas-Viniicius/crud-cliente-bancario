package com.projeto.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id // define essa coluna como primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera Id automaticamente
    private Long id;
    private String userName;
    private String email;
    private String password;
    private boolean ativo;
    private Integer numeroDaConta;
}
