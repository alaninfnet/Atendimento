package br.edu.infnet.atendimento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.atendimento.model.domain.Comercial;
import br.edu.infnet.atendimento.model.test.AppImpressao;

@Controller
public class ComercialController {
	
	
	private static Map<Integer, Comercial> mapaComercial = new HashMap<Integer, Comercial>();
	public static Integer id = 1;
	
	public static void incluir(Comercial comercial) {
		
		comercial.setId(id++);
		
		mapaComercial.put(comercial.getId(), comercial);
		
		AppImpressao.relatorio("Inclusão do Comercial "+id, comercial);
		
	}
	
	public static Collection<Comercial> obterLista(){
		return mapaComercial.values();
	}
	
	public static void excluir(Integer id) {
		System.out.println("ID = "+id);
		mapaComercial.remove(id);
	}
	
	@GetMapping(value= "/comercial/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "comercial/lista";
	}
	
	@GetMapping(value= "/comercial/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/comercial/lista";
	}
	
}
