package br.edu.infnet.atendimento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.atendimento.model.domain.Chamado;
import br.edu.infnet.atendimento.model.test.AppImpressao;

@Controller
public class ChamadoController {
	
	private static Map<Integer, Chamado> mapaChamado = new HashMap<Integer, Chamado>();
	public static Integer id = 1;
	
	public static void incluir(Chamado chamado) {
		
		chamado.setCodigo(id++);
		
		mapaChamado.put(chamado.getCodigo(), chamado);
		
		AppImpressao.relatorio("Inclusão do Chamado "+id, chamado);
		
	}
	
	public static Collection<Chamado> obterLista(){
		return mapaChamado.values();
	}
	
	public static void excluir(Integer id) {
		System.out.println("ID = "+id);
		mapaChamado.remove(id);
	}
	
	@GetMapping(value= "/chamado/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "chamado/lista";
	}
	
	@GetMapping(value= "/chamado/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/chamado/lista";
	}


}
