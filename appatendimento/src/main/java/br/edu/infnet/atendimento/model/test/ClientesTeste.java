package br.edu.infnet.atendimento.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.atendimento.model.domain.Clientes;
import br.edu.infnet.atendimento.model.domain.Endereco;

@Component
public class ClientesTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Clientes c1 = new Clientes();
    	
		c1.setNome("Joao da silva");
		c1.setCPF(1234567890);
		c1.setIdade(50);  	
    	
        Endereco e1 = new Endereco();
        e1.setCidade("BOA ESPERANCA");
        e1.setCEP(37170000);    	
    	
        c1.setResidencial(e1);
    	
        System.out.println(c1.toString());      	

	}

}
