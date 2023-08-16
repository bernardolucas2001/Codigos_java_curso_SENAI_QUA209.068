package entities;

public class Carro {
	public String modelo;
	public String placa;
	public String cor;
	public String ano;
	public int acelerar = 0;
	
	public void acelerarVeiculo() {
		acelerar += 1;
	}
	

}
