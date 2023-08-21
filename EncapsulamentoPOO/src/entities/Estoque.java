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
	

	
	public void imprimirDados() {
		System.out.println("O produto " + getProduto() + " possui o preço unitario " + getPreco() + " reais e a quantidade em estoque de "+getQuantidade() +  
				" unidades e o valor total do estoque é de " + valorTotal() + " reais");
	
	}
}
