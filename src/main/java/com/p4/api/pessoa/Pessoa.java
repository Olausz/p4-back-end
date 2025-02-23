package com.p4.api.pessoa;

import jakarta.persistence.*;


@Entity(name = "Pessoa")
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String fone;

    public Pessoa(CadastroPessoaDados dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.fone = dados.fone();
    }
}
