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
    	Chamado chamado = new Chamado();
    	
    	chamado.setCodigo(1);
    	chamado.setDataini(LocalDate.now());
    	chamado.setProblema("PROBLEMA NA NOTA");
    	
    	System.out.println(chamado.toString());
    	
	}
}
