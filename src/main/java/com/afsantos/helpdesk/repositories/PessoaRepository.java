package com.afsantos.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afsantos.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
