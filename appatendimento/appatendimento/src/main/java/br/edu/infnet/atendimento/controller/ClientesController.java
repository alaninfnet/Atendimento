package br.edu.infnet.atendimento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.atendimento.model.domain.Clientes;
import br.edu.infnet.atendimento.model.test.AppImpressao;
@Controller
public class ClientesController {
	
	private static Map<Integer, Clientes> mapaCliente = new HashMap<Integer, Clientes>();
	public static Integer id = 1;
	
	public static void incluir(Clientes cliente) {
		
		cliente.setId(id++);
		
		mapaCliente.put(cliente.getId(), cliente);
		
		AppImpressao.relatorio("Inclusão do Cliente "+id, cliente);
		
	}
	
	public static Collection<Clientes> obterLista(){
		return mapaCliente.values();
	}
	
	public static void excluir(Integer id) {
		System.out.println("ID = "+id);
		mapaCliente.remove(id);
	}
	
	@GetMapping(value= "/clientes/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "clientes/lista";
	}
	
	@GetMapping(value= "/clientes/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/clientes/lista";
	}
	
	

}
