package entities;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void mudarSenha(String novaSenha) {
		senha = novaSenha;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("E-mail: " + getEmail());
		System.out.println("Conta Cadastrada!");
	}

}
