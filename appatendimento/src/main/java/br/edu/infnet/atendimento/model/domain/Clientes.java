package br.edu.infnet.atendimento.model.domain;

public class Clientes {
    private String nome;
    private int idade;
    private char sexo;
    private long CPF;
    private Endereco residencial;
    
	public Clientes() {
	}    
    
	public Clientes(String nome, int idade, char sexo, long cPF, Endereco residencial) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		CPF = cPF;
		this.residencial = residencial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public long getCPF() {
		return CPF;
	}

	public void setCPF(long cPF) {
		CPF = cPF;
	}

	public Endereco getResidencial() {
		return residencial;
	}

	public void setResidencial(Endereco residencial) {
		this.residencial = residencial;
	}

	@Override
	public String toString() {
		return "Clientes [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", CPF=" + CPF + ", residencial="
				+ residencial + "]";
	}
	

    
}
