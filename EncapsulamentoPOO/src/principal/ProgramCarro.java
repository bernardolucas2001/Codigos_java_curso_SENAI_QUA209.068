package principal;

import java.util.Scanner;

import entities.Carro;

public class ProgramCarro {

	public static void main(String[] args) {
		//crie um programa que receba os dados de um carro com os seguintes atributos: modelo, ano, cor, motor, cambio e velocidade e 
		//os métodos para aumentar e diminuir a velocidade; use scanner 
		
		
		Scanner scan = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.println("Digite o modelo do carro: ");
		carro.setModelo(scan.next());
		
		System.out.println("Digite a cor do carro: ");
		carro.setCor(scan.next());
		
		System.out.println("Digite o motor do carro: ");
		carro.setMotor(scan.next());
		
		System.out.println("Digite o cambio do carro: ");
		carro.setCambio(scan.next());
		
		System.out.println("Digite o ano do carro: ");
		carro.setAno(scan.nextInt());
		
		
		System.out.println("Digite a velocidade do carro: ");
		carro.setVelocidade(scan.nextDouble());
		
		
		
		
		
		scan.close();
		
		
		// exemplo abaixo de como utilizar os metodos para acelerar e desacelerar a velocidade
		//carro.acelerar();
		//carro.acelerar();
		//carro.desacelerar();
		
		carro.imprimirDados();

	}

}
