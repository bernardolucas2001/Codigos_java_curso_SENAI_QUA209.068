package entities;

public class Produtos implements Comparable<Produtos> {
	private String nome;
	private int quantidade;
	private double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Produtos(String nome, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}
	@Override
	public int compareTo(Produtos outrosProdutos) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(outrosProdutos.nome);
	}
	
	

}
