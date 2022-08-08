package br.edu.infnet.atendimento.model.test;

import br.edu.infnet.atendimento.model.domain.Endereco;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.atendimento.model.domain.Comercial;
@Component
public class ComercialTeste implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
    	Comercial c1 = new Comercial();
    	
    	c1.setNome("ZEZINHO");
    	c1.setCPF(1234567890);
    	c1.setIdade(23);  	
    	c1.setBomdevenda('S');
    	
        Endereco e1 = new Endereco();
        e1.setCidade("BOA ESPERANCA");
        e1.setCEP(37170000);    	
    	
        c1.setResidencial(e1);
    	
        System.out.println(c1.toString());        

	}
}
