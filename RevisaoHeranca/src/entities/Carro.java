package entities;

public class Carro extends veiculo{
	protected String modelo;
	

	public Carro(String marca, int ano, String modelo) {
		super(marca, ano);
		this.modelo = modelo;	
	}

	
	
	public void ligarMotor() {
		System.out.println("Carro ligando o motor");
	}
	public void desligarMotor() {
		System.out.println("Carro desligando o motor");
	}
	
	public void exibirDados() {
		System.out.println("Marca = " + marca);
		System.out.println("Ano de Fabricação = " + anoFabricacao);
		System.out.println("Modelo = " + modelo);


	}


	

	

	
	


}
