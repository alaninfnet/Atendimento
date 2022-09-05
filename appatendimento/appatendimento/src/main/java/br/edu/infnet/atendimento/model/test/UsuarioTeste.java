package br.edu.infnet.atendimento.model.test;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.atendimento.controller.ClientesController;
import br.edu.infnet.atendimento.controller.UsuarioController;
import br.edu.infnet.atendimento.model.domain.Clientes;
import br.edu.infnet.atendimento.model.domain.Endereco;
import br.edu.infnet.atendimento.model.domain.Usuario;

@Component
public class UsuarioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		String dir = "c:/atendimento/";
		String arq = "usuarios.txt";
		
		FileReader filereader = new FileReader(dir+arq);
		BufferedReader leitura = new BufferedReader(filereader);
		
		String linha = leitura.readLine();
		
		while(linha != null) {
			
			try {
				
				String[] campos = linha.split(";");
				
				Usuario u1 = new Usuario();		
				u1.setNome(campos[0]);
				u1.setEmail(campos[1]);
				u1.setSenha(campos[2]);	    	
		        UsuarioController.incluir(u1);    	
			}catch (Exception e) {
				System.out.println("[ERRO]: "+e.getMessage());
			}
			
			linha = leitura.readLine();
		}
		
		leitura.close();
        
	}

}
