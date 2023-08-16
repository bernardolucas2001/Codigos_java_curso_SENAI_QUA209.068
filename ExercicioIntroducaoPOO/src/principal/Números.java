package principal;

import java.util.Scanner;

import entities.EquacaoSegundoGrau;

public class N�meros {

	public static void main(String[] args) {
		// Fa�a um programa que receba os n�meros de uma equa��o do segundo grau, retorne o valor de xI, e xII;
		
		Scanner scan = new Scanner(System.in);
		EquacaoSegundoGrau calculo = new EquacaoSegundoGrau();
		
		System.out.print("Digite o primeiro numero ou numero a: ");
		calculo.numero1 = scan.nextDouble();
		
		System.out.print("Digite o segundo n�mero ou numero b: ");
		calculo.numero2 = scan.nextDouble();
		
		System.out.print("Digite o terceiro numero ou numero c: ");
		calculo.numero3 = scan.nextDouble();
		
		
		System.out.println("X1 =" + calculo.calcularX1());
		
		System.out.println("X2 =" + calculo.calcularX2());
		System.out.println(calculo.calcularBhaskara());
		scan.close();

	}

}
