package br.edu.infnet.atendimento.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.atendimento.controller.ProgramadorController;
import br.edu.infnet.atendimento.model.domain.Endereco;
import br.edu.infnet.atendimento.model.domain.Programador;

@Component
public class ProgramadorTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
    	Programador p1 = new Programador();    	
    	p1.setNome("ALAN");
    	p1.setCPF("1234567890");
    	p1.setSexo('M');
    	p1.setIdade(23);  	
    	p1.setLinguagem("JAVA");
    	p1.setSabeoo('S');
    	p1.setBebecafe('S');    	   	
        Endereco e1 = new Endereco();
        e1.setCidade("BOA ESPERANCA");
        e1.setCEP(37170000);    	    	
        p1.setResidencial(e1);    	
        ProgramadorController.incluir(p1);
        
    	Programador p2 = new Programador();    	
    	p2.setNome("GABRIEL");
    	p2.setCPF("1234567890");
    	p2.setSexo('M');
    	p2.setIdade(23);  	
    	p2.setLinguagem("DELPHI");
    	p2.setSabeoo('N');
    	p2.setBebecafe('S');    	   	
        Endereco e2 = new Endereco();
        e2.setCidade("BOA ESPERANCA");
        e2.setCEP(37170000);    	    	
        p2.setResidencial(e2);    	
        System.out.println(p2.toString());   
        ProgramadorController.incluir(p2);
        
    	Programador p3 = new Programador();    	
    	p3.setNome("SANDRA");
    	p3.setCPF("1234567890");
    	p3.setSexo('F');
    	p3.setIdade(23);  	
    	p3.setLinguagem("COBOL");
    	p3.setSabeoo('S');
    	p3.setBebecafe('S');    	   	
        Endereco e3 = new Endereco();
        e3.setCidade("BOA ESPERANCA");
        e3.setCEP(37170000);    	    	
        p3.setResidencial(e3);    	
        System.out.println(p3.toString());           
        ProgramadorController.incluir(p3);
		
	}

}
