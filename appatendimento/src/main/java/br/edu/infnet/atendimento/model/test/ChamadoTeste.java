package br.edu.infnet.atendimento.model.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.atendimento.controller.ChamadoController;
import br.edu.infnet.atendimento.model.domain.Chamado;
import br.edu.infnet.atendimento.model.domain.Clientes;
import br.edu.infnet.atendimento.model.domain.Comercial;
import br.edu.infnet.atendimento.model.domain.Endereco;
import br.edu.infnet.atendimento.model.domain.Profissional;

@Component
public class ChamadoTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		List<Profissional> profissionais = new ArrayList<>();

        Endereco end1 = new Endereco();
        end1.setCidade("BOA ESPERANCA");
        end1.setCEP(37170000);  		
    	Comercial comercial1 = new Comercial("HENRRIQUE", "1234567890", 'M', 23, end1, LocalDate.now(), 1000, 'S');    	

        Endereco end2 = new Endereco();
        end2.setCidade("BOA ESPERANCA");
        end2.setCEP(37170000);  		
    	Comercial comercial2 = new Comercial("LIDIANE", "64674637683", 'F', 30, end2, LocalDate.now(), 1000, 'S');    	

        Endereco end3 = new Endereco();
        end3.setCidade("BOA ESPERANCA");
        end3.setCEP(37170000);  		
    	Comercial comercial3 = new Comercial("DENISE", "7845467363", 'F', 40, end3, LocalDate.now(), 1000, 'S');    	
    	
		profissionais.add(comercial1);
		profissionais.add(comercial2);
		profissionais.add(comercial3);
		
        Endereco e1 = new Endereco();
        e1.setCidade("SAO VICENTE DE MINAS");
        e1.setCEP(646476868);    						
		Clientes c1 = new Clientes("LUIZINHO", 50, 'M', "1234567890", e1);					
    	
		Chamado chamado1 = new Chamado();    	
    	chamado1.setCodigo(1);
    	chamado1.setProblema("PROBLEMA NA NOTA");
    	chamado1.setDataini(LocalDate.now());
    	chamado1.setDatafim(LocalDate.now());
    	chamado1.setSolucao("RECEITA ESTAVA FORA DO AR");    
    	chamado1.setCliente(c1);
    	chamado1.setProfissionais(profissionais);
    	ChamadoController.incluir(chamado1);
    	
        Endereco e2 = new Endereco();
        e2.setCidade("PASSOS");
        e2.setCEP(646476868);    						
		Clientes c2 = new Clientes("CAMILA", 27, 'F', "514264738", e2);		    	
    	
		Chamado chamado2 = new Chamado();    	
    	chamado2.setCodigo(2);
    	chamado2.setProblema("ESTOQUE DANDO DIFERENÇA NO INVENTARIO");
    	chamado2.setDataini(LocalDate.now());
    	chamado2.setDatafim(LocalDate.now());
    	chamado2.setSolucao("NFE LANÇADA ERRADA");    
    	chamado2.setCliente(c2);
    	ChamadoController.incluir(chamado2);
    	
        Endereco e3 = new Endereco();
        e3.setCidade("LAVRAS");
        e3.setCEP(646476868);    						
		Clientes c3 = new Clientes("ERICK", 35, 'M', "647382736", e3);	    	
    	
		Chamado chamado3 = new Chamado();    	
    	chamado3.setCodigo(2);
    	chamado3.setProblema("CONTAS RECEBER DIFERENTE DO EXTRATO");
    	chamado3.setDataini(LocalDate.now());
    	chamado3.setDatafim(LocalDate.now());
    	chamado3.setSolucao("LANÇAMENTO ERRADO NO CONTAS RECEBER");    	 
    	chamado3.setCliente(c3);
    	ChamadoController.incluir(chamado3);
    	
	}
}
