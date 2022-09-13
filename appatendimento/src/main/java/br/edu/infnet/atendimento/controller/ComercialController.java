package br.edu.infnet.atendimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.atendimento.model.service.ComercialService;

@Controller
public class ComercialController {
	
	@Autowired
	ComercialService comercialService;
	
	@GetMapping(value= "/comercial/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", comercialService.obterLista());
		
		return "comercial/lista";
	}
	
	@GetMapping(value= "/comercial/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		comercialService.excluir(id);
		
		return "redirect:/comercial/lista";
	}
	
}
