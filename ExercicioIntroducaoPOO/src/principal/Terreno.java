package principal;

import java.util.Scanner;

import entities.AreaTerreno;

public class Terreno {

	public static void main(String[] args) {
		//Fa�a um programa que calcule a �rea de um terreno e mostre o m�;
		
		Scanner scan = new Scanner(System.in);
		AreaTerreno area = new AreaTerreno();
		
		System.out.println("Digite a largura do terreno: ");
		 area.largura = scan.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		area.comprimento = scan.nextDouble();
		
		scan.close();
		
		
		System.out.println("�rea = " + area.calcularArea() + " m�");
		
		
		

	}

}
