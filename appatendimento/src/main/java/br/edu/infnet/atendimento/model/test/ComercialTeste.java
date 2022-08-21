package br.edu.infnet.atendimento.model.test;

import br.edu.infnet.atendimento.model.domain.Endereco;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.atendimento.controller.ComercialController;
import br.edu.infnet.atendimento.model.domain.Comercial;
@Component
public class ComercialTeste implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
    	Comercial c1 = new Comercial();    	
    	c1.setNome("HENRRIQUE");
    	c1.setCPF("1234567890");
    	c1.setSexo('M');
    	c1.setIdade(23);  	
    	c1.setBomdevenda('S');
    	c1.setMetamensal(1000);
    	c1.setDtultmavenda(LocalDate.now());
    	
        Endereco e1 = new Endereco();
        e1.setCidade("BOA ESPERANCA");
        e1.setCEP(37170000);    	
    	
        c1.setResidencial(e1);    	
        ComercialController.incluir(c1);
        
    	Comercial c2 = new Comercial();    	
    	c2.setNome("LIDIANE");
    	c2.setCPF("1234567890");
    	c2.setSexo('F');
    	c2.setIdade(23);  	
    	c2.setBomdevenda('S');
    	c2.setMetamensal(1000);
    	c2.setDtultmavenda(LocalDate.now());
    	
        Endereco e2 = new Endereco();
        e2.setCidade("BOA ESPERANCA");
        e2.setCEP(37170000);    	
    	
        c2.setResidencial(e2);    	
        ComercialController.incluir(c2);
        
    	Comercial c3 = new Comercial();    	
    	c3.setNome("DENISE");
    	c3.setCPF("1234567890");
    	c3.setSexo('F');
    	c3.setIdade(23);  	
    	c3.setBomdevenda('S');
    	c3.setMetamensal(1000);
    	c3.setDtultmavenda(LocalDate.now());
    	
        Endereco e3 = new Endereco();
        e3.setCidade("BOA ESPERANCA");
        e3.setCEP(37170000);    	
    	
        c3.setResidencial(e3);    	
        ComercialController.incluir(c3);
	}
}
