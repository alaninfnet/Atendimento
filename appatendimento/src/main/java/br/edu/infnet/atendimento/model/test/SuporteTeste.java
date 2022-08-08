package br.edu.infnet.atendimento.model.test;

import br.edu.infnet.atendimento.model.domain.Suporte;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.atendimento.model.domain.Endereco;

@Component
public class SuporteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
    	Suporte s1 = new Suporte();
    	
    	s1.setNome("ALAN");
    	s1.setCPF(1234567890);
    	s1.setIdade(23);  	
    	s1.setSaberedes('N');
    	
        Endereco e1 = new Endereco();
        e1.setCidade("BOA ESPERANCA");
        e1.setCEP(37170000);    	
    	
        s1.setResidencial(e1);
    	
        System.out.println(s1.toString());     

	}

}
