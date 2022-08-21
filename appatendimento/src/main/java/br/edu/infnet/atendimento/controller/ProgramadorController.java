package br.edu.infnet.atendimento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.atendimento.model.domain.Programador;
import br.edu.infnet.atendimento.model.test.AppImpressao;

@Controller
public class ProgramadorController {
	
	
	private static Map<Integer, Programador> mapaProgramador = new HashMap<Integer, Programador>();
	public static Integer id = 1;
	
	public static void incluir(Programador programador) {
		
		programador.setId(id++);
		
		mapaProgramador.put(programador.getId(), programador);
		
		AppImpressao.relatorio("Inclusão do Programador "+id, programador);
		
	}
	
	public static Collection<Programador> obterLista(){
		return mapaProgramador.values();
	}
	
	public static void excluir(Integer id) {
		System.out.println("ID = "+id);
		mapaProgramador.remove(id);
	}
	
	@GetMapping(value= "/programador/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "programador/lista";
	}
	
	@GetMapping(value= "/programador/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/programador/lista";
	}	

}
