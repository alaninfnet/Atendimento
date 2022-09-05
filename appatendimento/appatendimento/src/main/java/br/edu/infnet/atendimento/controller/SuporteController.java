package br.edu.infnet.atendimento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.atendimento.model.domain.Suporte;
import br.edu.infnet.atendimento.model.test.AppImpressao;

@Controller
public class SuporteController {
	
	private static Map<Integer, Suporte> mapaSuporte = new HashMap<Integer, Suporte>();
	public static Integer id = 1;
	
	public static void incluir(Suporte suporte) {
		
		suporte.setId(id++);
		
		mapaSuporte.put(suporte.getId(), suporte);
		
		AppImpressao.relatorio("Inclusão do Suporte "+id, suporte);
		
	}
	
	public static Collection<Suporte> obterLista(){
		return mapaSuporte.values();
	}
	
	public static void excluir(Integer id) {
		System.out.println("ID = "+id);
		mapaSuporte.remove(id);
	}
	
	@GetMapping(value= "/suporte/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "suporte/lista";
	}
	
	@GetMapping(value= "/suporte/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/suporte/lista";
	}	


}
