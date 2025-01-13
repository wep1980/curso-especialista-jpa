package com.algaworks.ecommerce.model;

import com.algaworks.ecommerce.enums.SexoCliente;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // Configuracao para equals e hash code que define com quais campos esses metodos serao implementados
@Table(name = "cliente")
public class Cliente {

    @EqualsAndHashCode.Include // Unico campo a ser considerado no equals e hashcode
    @Id
    private Integer id;

    private String nome;

    private SexoCliente sexo;
}

