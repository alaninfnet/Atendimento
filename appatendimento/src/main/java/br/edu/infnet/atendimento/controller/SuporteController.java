package br.edu.infnet.atendimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuporteController {
	
	@GetMapping(value= "/suporte/lista")
	public String telaLista() {
		return "suporte/lista";
	}

}
