package br.edu.infnet.atendimento.model.test;

import br.edu.infnet.atendimento.model.domain.Suporte;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.atendimento.controller.SuporteController;
import br.edu.infnet.atendimento.model.domain.Endereco;

@Component
public class SuporteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
    	Suporte s1 = new Suporte();    	
    	s1.setNome("FABRICIO");
    	s1.setCPF("1234567890");
    	s1.setSexo('M');
    	s1.setIdade(23);  	
    	s1.setSopreferido("WINDOWS");
    	s1.setSabeformatar('S');
    	s1.setSaberedes('S');    	   	
        Endereco e1 = new Endereco();
        e1.setCidade("BOA ESPERANCA");
        e1.setCEP(37170000);    	    	
        s1.setResidencial(e1);    	
        SuporteController.incluir(s1);
        
    	Suporte s2 = new Suporte();    	
    	s2.setNome("ELDER");
    	s2.setCPF("1234567890");
    	s2.setSexo('M');
    	s2.setIdade(23);  	
    	s2.setSopreferido("WINDOWS");
    	s2.setSabeformatar('S');
    	s2.setSaberedes('S');    	   	
        Endereco e2 = new Endereco();
        e2.setCidade("BOA ESPERANCA");
        e2.setCEP(37170000);    	    	
        s2.setResidencial(e2);    	
        SuporteController.incluir(s2);
        
    	Suporte s3 = new Suporte();    	
    	s3.setNome("ALEX");
    	s3.setCPF("1234567890");
    	s3.setSexo('M');
    	s3.setIdade(23);  	
    	s3.setSopreferido("LINUX");
    	s3.setSabeformatar('S');
    	s3.setSaberedes('S');    	   	
        Endereco e3 = new Endereco();
        e3.setCidade("BOA ESPERANCA");
        e3.setCEP(37170000);    	    	
        s3.setResidencial(e3);    	
        SuporteController.incluir(s3);

	}

}
