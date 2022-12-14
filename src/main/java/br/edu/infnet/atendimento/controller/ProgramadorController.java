package br.edu.infnet.atendimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.atendimento.model.service.ProgramadorService;

@Controller
public class ProgramadorController {
	
	@Autowired
	ProgramadorService programadorService;
	
	@GetMapping(value= "/programador/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", programadorService.obterLista());
		
		return "programador/lista";
	}
	
	@GetMapping(value= "/programador/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		programadorService.excluir(id);
		
		return "redirect:/programador/lista";
	}	

}
