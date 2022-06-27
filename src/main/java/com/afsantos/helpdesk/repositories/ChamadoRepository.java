package com.afsantos.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afsantos.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
