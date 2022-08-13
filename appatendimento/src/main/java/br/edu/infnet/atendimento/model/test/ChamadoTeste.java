package br.edu.infnet.atendimento.model.test;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.atendimento.model.domain.Chamado;

@Component
public class ChamadoTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
    	
		Chamado chamado1 = new Chamado();    	
    	chamado1.setCodigo(1);
    	chamado1.setProblema("PROBLEMA NA NOTA");
    	chamado1.setDataini(LocalDate.now());
    	chamado1.setDatafim(LocalDate.now());
    	chamado1.setSolucao("RECEITA ESTAVA FORA DO AR");    	    	
    	System.out.println(chamado1.toString());
    	
    	AppImpressao.relatorio("Inclusão do Chamado 1", chamado1);
    	
		Chamado chamado2 = new Chamado();    	
    	chamado2.setCodigo(2);
    	chamado2.setProblema("ESTOQUE DANDO DIFERENÇA NO INVENTARIO");
    	chamado2.setDataini(LocalDate.now());
    	chamado2.setDatafim(LocalDate.now());
    	chamado2.setSolucao("NFE LANÇADA ERRADA");    	    	
    	System.out.println(chamado2.toString());    	
    	
    	AppImpressao.relatorio("Inclusão do Chamado 2", chamado2);
    	
		Chamado chamado3 = new Chamado();    	
    	chamado3.setCodigo(2);
    	chamado3.setProblema("CONTAS RECEBER DIFERENTE DO EXTRATO");
    	chamado3.setDataini(LocalDate.now());
    	chamado3.setDatafim(LocalDate.now());
    	chamado3.setSolucao("LANÇAMENTO ERRADO NO CONTAS RECEBER");    	    	
    	System.out.println(chamado3.toString());     
    	
    	AppImpressao.relatorio("Inclusão do Chamado 3", chamado3);
    	
    	
	}
}
