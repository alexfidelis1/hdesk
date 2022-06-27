package com.afsantos.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afsantos.helpdesk.domain.Chamado;
import com.afsantos.helpdesk.domain.Cliente;
import com.afsantos.helpdesk.domain.Tecnico;
import com.afsantos.helpdesk.domain.enums.Perfil;
import com.afsantos.helpdesk.domain.enums.Prioridade;
import com.afsantos.helpdesk.domain.enums.Status;
import com.afsantos.helpdesk.repositories.ChamadoRepository;
import com.afsantos.helpdesk.repositories.PessoaRepository;

@Service
public class DBService {


	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	

	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Alex Fidelis", "268.875.375-40", "vinicius_enrico_moreira@tedde.com.br", "123");
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Vanessa Sônia ", "335.433.480-00", "vanessasonia@tedde.com.br", "123");
		Tecnico tec3 = new Tecnico(null, "Priscila Pires", "027.653.484-05", "priscilapires@tedde.com.br", "123");
		Tecnico tec4 = new Tecnico(null, "Rafael José da Costa", "348.651.978-69", "rafaeljose@tedde.com.br", "123");
		Tecnico tec5 = new Tecnico(null, "Renata Evelyn Martins", "603.695.488-33", "renataevelyn@tedde.com.br", "123");

		Cliente cli1 = new Cliente(null, "Pedro Henrique", "556.704.796-70", "nicole-melo85@fepextrusao.com.br", "123");
		Cliente cli2 = new Cliente(null, "Samuel Nathan Arthur da Luz", "632.694.991-24", "samuel-melo85@fepextrusao.com.br", "123");
		Cliente cli3 = new Cliente(null, "Regina Mirella Márcia Ribeiro", "507.978.860-79", "regina-melo85@fepextrusao.com.br", "123");
		Cliente cli4 = new Cliente(null, "Kaique Manuel Cardoso", "180.817.998-69", "kaique-melo85@fepextrusao.com.br", "123");
		Cliente cli5 = new Cliente(null, "Manuela Olivia Costa", "871.643.343-23", "manuela-melo85@fepextrusao.com.br", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado_01", "Primeiro chamado", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado_02", "Segundo chamado", tec1, cli2);
		Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado_03", "Terceiro chamado", tec2, cli3);
		Chamado c4 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado_04", "Quarto chamado", tec3, cli3);
		Chamado c5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado_05", "Quinto chamado", tec2, cli1);
		Chamado c6 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado_06", "Sexto chamado", tec1, cli5);

		pessoaRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5,tec1, tec2, tec3, tec4, tec5 ));		
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6));

	}

}
