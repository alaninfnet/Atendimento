package br.edu.infnet.atendimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComercialController {
	
	@GetMapping(value= "/comercial/lista")
	public String telaLista() {
		return "comercial/lista";
	}

}
