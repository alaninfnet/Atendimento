package br.edu.infnet.atendimento.model.test;

import br.edu.infnet.atendimento.model.domain.Suporte;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.atendimento.controller.SuporteController;
import br.edu.infnet.atendimento.model.domain.Endereco;

@Component
public class SuporteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		String dir = "c:/atendimento/";
		String arq = "suporte.txt";
		
		FileReader filereader = new FileReader(dir+arq);
		BufferedReader leitura = new BufferedReader(filereader);
		
		String linha = leitura.readLine();
		
		while(linha != null) {	
			
			try {		
				
				String[] campos = linha.split(";");			
		
		    	Suporte s1 = new Suporte();    	
		    	s1.setNome(campos[0]);
		    	s1.setCPF(campos[1]);
		    	s1.setSexo(campos[2].charAt(0));
		    	s1.setIdade(Integer.parseInt(campos[3]));  	
		    	s1.setSopreferido(campos[4]);
		    	s1.setSabeformatar(campos[5].charAt(0));
		    	s1.setSaberedes(campos[6].charAt(0));    	   	
		        Endereco e1 = new Endereco();
		        e1.setCidade(campos[7]);
		        e1.setCEP( Integer.parseInt(campos[8]));    	    	
		        s1.setResidencial(e1);    	
		        SuporteController.incluir(s1);
					}catch (Exception e) {
						System.out.println("[ERRO]: "+e.getMessage());
					}
					
					linha = leitura.readLine();
		}
				
		leitura.close();
        
	}

}
