package br.edu.infnet.atendimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientesController {
	
	@GetMapping(value= "/clientes/lista")
	public String telaLista() {
		return "clientes/lista";
	}

}
