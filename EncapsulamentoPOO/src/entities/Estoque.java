package entities;

public class Estoque {
	private String produto;
	private double quantidade;
	private double preco;
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double valorTotal() {
		return preco*quantidade;
	}
	public double adicionarQuantidade(double adicionando) {
		return quantidade = quantidade+adicionando;
	}
	public double removendoQuantidade(double removendo) {
		return quantidade = quantidade-removendo;
	}
	

	
	public void imprimirDados() {
		System.out.println("O Nome do produto: " + getProduto());
		System.out.println("preço unitario = " + getPreco()+ " reais");
        System.out.println(" quantidade em estoque : " + getQuantidade());  
		System.out.println(" valor total do estoque = " + valorTotal() + " reais");
	
	}
}
