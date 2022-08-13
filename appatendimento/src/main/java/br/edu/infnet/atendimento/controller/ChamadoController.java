package br.edu.infnet.atendimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChamadoController {
	
	@GetMapping(value= "/chamado/lista")
	public String telaLista() {
		return "chamado/lista";
	}

}
