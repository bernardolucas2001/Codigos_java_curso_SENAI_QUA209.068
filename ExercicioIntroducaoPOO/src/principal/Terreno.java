package principal;

import java.util.Scanner;

import entities.AreaTerreno;

public class Terreno {

	public static void main(String[] args) {
		//Faça um programa que calcule a área de um terreno e mostre o m²;
		
		Scanner scan = new Scanner(System.in);
		AreaTerreno area = new AreaTerreno();
		
		System.out.println("Digite a largura do terreno: ");
		 area.largura = scan.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		area.comprimento = scan.nextDouble();
		
		scan.close();
		
		
		System.out.println("Área = " + area.calcularArea() + " m²");
		
		
		

	}

}
