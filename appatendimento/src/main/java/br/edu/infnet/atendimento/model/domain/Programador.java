package br.edu.infnet.atendimento.model.domain;

public class Programador extends Profissional {
    private String linguagem;
    private char sabeoo;
    private char bebecafe;
    
	public Programador() {
	}
    
	public Programador(String linguagem, char sabeoo, char bebecafe) {
		super();
		this.linguagem = linguagem;
		this.sabeoo = sabeoo;
		this.bebecafe = bebecafe;
	}
	
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public char getSabeoo() {
		return sabeoo;
	}
	public void setSabeoo(char sabeoo) {
		this.sabeoo = sabeoo;
	}
	public char getBebecafe() {
		return bebecafe;
	}
	public void setBebecafe(char bebecafe) {
		this.bebecafe = bebecafe;
	}

	@Override
	public String toString() {
		return "Programador [linguagem=" + linguagem + ", sabeoo=" + sabeoo + ", bebecafe=" + bebecafe+", " + super.toString()+ "]";
	}

    

}
