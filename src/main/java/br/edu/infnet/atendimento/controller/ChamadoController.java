package br.edu.infnet.atendimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.atendimento.model.service.ChamadoService;

@Controller
public class ChamadoController {
	
	@Autowired
	ChamadoService chamadoService;
	
	@GetMapping(value= "/chamado/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", chamadoService.obterLista());
		
		return "chamado/lista";
	}
	
	@GetMapping(value= "/chamado/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		chamadoService.excluir(id);
		
		return "redirect:/chamado/lista";
	}


}
