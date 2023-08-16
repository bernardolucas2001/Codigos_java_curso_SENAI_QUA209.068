package principal;

import java.util.Scanner;

import entities.EquacaoSegundoGrau;

public class Números {

	public static void main(String[] args) {
		// Faça um programa que receba os números de uma equação do segundo grau, retorne o valor de xI, e xII;
		
		Scanner scan = new Scanner(System.in);
		EquacaoSegundoGrau calculo = new EquacaoSegundoGrau();
		
		System.out.print("Digite o primeiro numero ou numero a: ");
		calculo.numero1 = scan.nextDouble();
		
		System.out.print("Digite o segundo número ou numero b: ");
		calculo.numero2 = scan.nextDouble();
		
		System.out.print("Digite o terceiro numero ou numero c: ");
		calculo.numero3 = scan.nextDouble();
		
		
		System.out.println("X1 =" + calculo.calcularX1());
		
		System.out.println("X2 =" + calculo.calcularX2());
		System.out.println(calculo.calcularBhaskara());
		scan.close();

	}

}
