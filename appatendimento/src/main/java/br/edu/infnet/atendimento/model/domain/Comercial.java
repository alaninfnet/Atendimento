package br.edu.infnet.atendimento.model.domain;

import java.time.LocalDate;

public class Comercial extends Profissional {
	
    private LocalDate dtultmavenda;
    private double metamensal;
    private char bomdevenda;
    
	public Comercial() {

	}
    
    
	public Comercial(LocalDate dtultmavenda, double metamensal, char bomdevenda) {
		this.dtultmavenda = dtultmavenda;
		this.metamensal = metamensal;
		this.bomdevenda = bomdevenda;
	}

	public LocalDate getDtultmavenda() {
		return dtultmavenda;
	}

	public void setDtultmavenda(LocalDate dtultmavenda) {
		this.dtultmavenda = dtultmavenda;
	}

	public double getMetamensal() {
		return metamensal;
	}

	public void setMetamensal(double metamensal) {
		this.metamensal = metamensal;
	}

	public char getBomdevenda() {
		return bomdevenda;
	}

	public void setBomdevenda(char bomdevenda) {
		this.bomdevenda = bomdevenda;
	}

	@Override
	public String toString() {
		return "Comercial [dtultmavenda=" + dtultmavenda + ", metamensal=" + metamensal + ", bomdevenda=" + bomdevenda+", "
				+ super.toString()+ "]";
	}
        
    
}