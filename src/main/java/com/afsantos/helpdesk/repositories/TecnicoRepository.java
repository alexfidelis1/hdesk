package com.afsantos.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afsantos.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
