package br.edu.infnet.atendimento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.atendimento.model.domain.Clientes;
import br.edu.infnet.atendimento.model.domain.Usuario;
import br.edu.infnet.atendimento.model.test.AppImpressao;
@Controller
public class UsuarioController {
	
	private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();
	
	public static void incluir(Usuario usuario) {
		
		mapaUsuario.put(usuario.getEmail(), usuario);
		
		AppImpressao.relatorio("Inclusão do Usuário "+usuario.getEmail(), usuario);
		
	}
	
	public static Collection<Usuario> obterLista(){
		return mapaUsuario.values();
	}
	
	public static void excluir(String email) {
		mapaUsuario.remove(email);
	}
	
	@GetMapping(value= "/usuario/cadastro")
	public String telaCadastro() {

		return "usuario/cadastro";
	}
	
	@GetMapping(value= "/usuario/lista")
	public String telaLista(Model model, String user) {
		
		model.addAttribute("listagem", obterLista());
		model.addAttribute("user", user);
		
		return "usuario/lista";
	}
	
	@GetMapping(value= "/usuario/{email}/excluir")
	public String exclusao(@PathVariable String email) {
		
		excluir(email);
		
		return "redirect:/usuario/lista";
	}
	
	@PostMapping(value= "/usuario/cadastro")
	public String inclusao(Model model, Usuario usuario) {
		
		incluir(usuario);
		
		return "redirect:/";
	}
	
	public static Usuario validar(String email, String senha) {
		Usuario usuario = mapaUsuario.get(email);
		if( usuario != null && usuario.getSenha().equals(senha)) {
			return usuario;
		}
		return null;
	}
	

}
