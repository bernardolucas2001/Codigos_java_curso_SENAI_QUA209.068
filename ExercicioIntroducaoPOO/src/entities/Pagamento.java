package entities;

public class Pagamento {
	public String nome;
	public double preco;
	public double quantidade;
	public String pagamento;
	
	public double calcularPreco() {
		Double precoFinal = preco*quantidade;
		return precoFinal;
	}
	
	public double metodoPag() {
		double valorPagamento;
		if(pagamento.equals("pix") ) {
			valorPagamento = calcularPreco() - (calcularPreco()*0.06);
		} else if(pagamento.equals("dinheiro") ) {
			valorPagamento = calcularPreco() - (calcularPreco()*0.08);
		} else if(pagamento.equals("debito")) {
			valorPagamento = calcularPreco() - (calcularPreco()*0.05);
		} else {
			valorPagamento = calcularPreco();
		} 
		return valorPagamento;
		
	}

}
