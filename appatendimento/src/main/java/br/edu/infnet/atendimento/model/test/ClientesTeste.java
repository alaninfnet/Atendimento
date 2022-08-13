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
		c1.setNome("LUIZINHO");
		c1.setIdade(50);
		c1.setSexo('M');
		c1.setCPF(1234567890);
        Endereco e1 = new Endereco();
        e1.setCidade("SAO VICENTE DE MINAS");
        e1.setCEP(646476868);    				
		c1.setResidencial(e1);		    	
        System.out.println(c1.toString());      	
        
        AppImpressao.relatorio("Inclusão do Cliente 1", c1);
        
		Clientes c2 = new Clientes();		
		c2.setNome("CAMILA");
		c2.setIdade(27);
		c2.setSexo('F');
		c2.setCPF(514264738);
        Endereco e2 = new Endereco();
        e2.setCidade("LAVRAS");
        e2.setCEP(65743267);    				
		c2.setResidencial(e2);		    	
        System.out.println(c2.toString());      
        
        AppImpressao.relatorio("Inclusão do Cliente 2", c2);
        
		Clientes c3 = new Clientes();		
		c3.setNome("ERICK");
		c3.setIdade(35);
		c3.setSexo('M');
		c3.setCPF(647382736);
        Endereco e3 = new Endereco();
        e3.setCidade("PASSOS");
        e3.setCEP(56542235);    				
		c3.setResidencial(e3);		    	
        System.out.println(c3.toString());      
        
        AppImpressao.relatorio("Inclusão do Cliente 3", c3);
        
	}

}
