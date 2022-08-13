package br.edu.infnet.atendimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramadorController {
	
	@GetMapping(value= "/programador/lista")
	public String telaLista() {
		return "programador/lista";
	}

}
