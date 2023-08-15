package principal;

import java.util.Scanner;

public class CalcularMetroQuadrado {

	public static void main(String[] args) {
		// Crie um programa que receba os valores 
		//de largura e comprimento do terreno
		//e informa quantos metros quadrados ele tem
		//utilize função
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite aqui os valores,em metros, de largura: ");
		double largura = leitura.nextDouble();
		
		System.out.println("Digite aqui os valores, em metros, de comprimento: ");
		double comprimento = leitura.nextDouble();
		
		System.out.printf("Resultado em Metros quadrados = %.2f", MetrosQuadrados(largura, comprimento));
		
		leitura.close();
		
		

	}
	static double MetrosQuadrados(double largura, double comprimento) {
		return largura*comprimento;	
	}

}
