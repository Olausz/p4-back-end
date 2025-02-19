package com.p4.api.repository;

import com.p4.api.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
