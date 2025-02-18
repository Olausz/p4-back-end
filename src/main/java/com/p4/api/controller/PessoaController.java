package com.p4.api.controller;

import com.p4.api.pessoa.CadastroPessoaDados;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @PostMapping
    public void cadastrar(@RequestBody CadastroPessoaDados dados){

        System.out.println(json);
    }
}
