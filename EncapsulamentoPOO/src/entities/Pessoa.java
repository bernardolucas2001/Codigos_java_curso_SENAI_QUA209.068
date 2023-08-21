package entities;

public class Pessoa {
	
	private String nome;
	private int anoNascimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getIdade() {
		return idade;
	}
	private int idade = 2023 - anoNascimento;
	
	public void imprimeDados() {
		System.out.printf("%s tem %d anos e nasceu em %d", getNome(), getIdade(), getAnoNascimento());
	}
	
	}


