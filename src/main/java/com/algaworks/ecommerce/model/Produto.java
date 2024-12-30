package com.algaworks.ecommerce.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;



@Getter
@Setter
// Configuracao para equals e hash code que define com quais campos esses metodos serao implementados
@EqualsAndHashCode(of = {"id"})
@Entity
public class Produto {

    @Id
    private Integer id;

    private String nome;

    private String descricao;

    private BigDecimal preco;

}
