package br.edu.infnet.atendimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.atendimento.model.service.SuporteService;

@Controller
public class SuporteController {
	
	@Autowired
	SuporteService suporteService;
	
	@GetMapping(value= "/suporte/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", suporteService.obterLista());
		
		return "suporte/lista";
	}
	
	@GetMapping(value= "/suporte/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		suporteService.excluir(id);
		
		return "redirect:/suporte/lista";
	}	


}
