package entities;

public class veiculo {
	protected String marca;
	protected int anoFabricacao;
	
	






	public veiculo(String marca, int anoFabricacao) {
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
	}








	public void exibirDados() {
		System.out.println("Marca = " + marca);
		System.out.println("Ano de Fabricação = " + anoFabricacao);
	}

}
