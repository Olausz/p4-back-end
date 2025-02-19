package com.p4.api.controller;

import com.p4.api.pessoa.CadastroPessoaDados;
import com.p4.api.pessoa.Pessoa;
import com.p4.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired
    private PessoaRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody CadastroPessoaDados dados){
    repository.save(new Pessoa(dados));


    }
}
