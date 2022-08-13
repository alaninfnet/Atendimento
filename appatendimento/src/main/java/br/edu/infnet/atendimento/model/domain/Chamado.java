package br.edu.infnet.atendimento.model.domain;

import java.time.LocalDate;

import br.edu.infnet.atendimento.interfaces.IPrinter;

public class Chamado implements IPrinter {
	private int codigo;
    private String problema;
    private LocalDate dataini;
    private LocalDate datafim;
    private String solucao;
    
	public Chamado() {

	}
	
	public Chamado(int codigo, String problema, LocalDate dataini, LocalDate datafim, String solucao) {
		this.codigo = codigo;
		this.problema = problema;
		this.dataini = dataini;
		this.datafim = datafim;
		this.solucao = solucao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public LocalDate getDataini() {
		return dataini;
	}

	public void setDataini(LocalDate dataini) {
		this.dataini = dataini;
	}

	public LocalDate getDatafim() {
		return datafim;
	}

	public void setDatafim(LocalDate datafim) {
		this.datafim = datafim;
	}

	public String getSolucao() {
		return solucao;
	}

	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}

	@Override
	public String toString() {
		return "Chamado [codigo=" + codigo + ", problema=" + problema + ", dataini=" + dataini + ", datafim=" + datafim
				+ ", solucao=" + solucao + "]";
	}		
	
	@Override
	public void impressao() {
		System.out.println("#chamado");
		System.out.println(this);
		
	} 

    
}
