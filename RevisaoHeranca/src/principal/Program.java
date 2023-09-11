package principal;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		Carro carro = new Carro("Ferrari", 2010,"ROMA");
		carro.exibirDados();
		carro.ligarMotor();
		

	}

}
