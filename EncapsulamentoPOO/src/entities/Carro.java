package entities;

public class Carro {
	private String modelo;
	private int ano;
	private String cor;
	private String motor;
	private String cambio;
	private double velocidade;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public void acelerar() {
		velocidade++;
		
		
	}
	public void desacelerar() {
		 velocidade--;
			
	}
	
	public void imprimirDados() {
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Cor: " + getCor());
		System.out.println("Motor: " + getMotor());
		System.out.println("Cambio: " + getCambio());
		System.out.println("Velocidade: " + getVelocidade());
	}
	

}
