package org.app1.myfirstspringbootapp.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produtos")

//getters e setters do lombok
@Getter
@Setter
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;

    //construtor da classe
    public Produtos(){}
    public Produtos(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }
}
