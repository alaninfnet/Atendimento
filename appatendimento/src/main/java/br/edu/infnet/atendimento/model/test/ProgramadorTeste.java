package br.edu.infnet.atendimento.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.atendimento.model.domain.Endereco;
import br.edu.infnet.atendimento.model.domain.Programador;

@Component
public class ProgramadorTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
    	Programador p1 = new Programador();
    	
    	p1.setNome("ALAN");
    	p1.setCPF(1234567890);
    	p1.setIdade(23);  	
    	p1.setBebecafe('S');
    	
        Endereco e1 = new Endereco();
        e1.setCidade("BOA ESPERANCA");
        e1.setCEP(37170000);    	
    	
    	p1.setResidencial(e1);
    	
        System.out.println("Nome: "+p1.toString());      

	}

}
