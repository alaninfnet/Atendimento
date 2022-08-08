package br.edu.infnet.atendimento.model.domain;

public class Suporte extends Profissional{
	
    private String sopreferido;
    private char sabeformatar;
    private char saberedes;
    
	public Suporte() {
		
	}    
    
	public Suporte(String sopreferido, char sabeformatar, char saberedes) {
		this.sopreferido = sopreferido;
		this.sabeformatar = sabeformatar;
		this.saberedes = saberedes;
	}

	public String getSopreferido() {
		return sopreferido;
	}

	public void setSopreferido(String sopreferido) {
		this.sopreferido = sopreferido;
	}

	public char getSabeformatar() {
		return sabeformatar;
	}

	public void setSabeformatar(char sabeformatar) {
		this.sabeformatar = sabeformatar;
	}

	public char getSaberedes() {
		return saberedes;
	}

	public void setSaberedes(char saberedes) {
		this.saberedes = saberedes;
	}

	@Override
	public String toString() {
		return "Suporte [sopreferido=" + sopreferido + ", sabeformatar=" + sabeformatar + ", saberedes=" + saberedes+
				", "+ super.toString()+ "]";
	}
	

}