package principal;

import java.util.Scanner;

import entities.IdentificarTriangulo;

public class Triangulo {

	public static void main(String[] args) {
		//Faça um programa que receba 3 valores e indique/retorne que tipo de triangulo ele pode ser;
		
		Scanner leu = new Scanner(System.in);
		IdentificarTriangulo ver = new IdentificarTriangulo();
		
		System.out.println("Digite a primeira medida do Triangulo: ");
		ver.medida1 = leu.nextDouble();
		
		System.out.println("Digite a segunda medida do Triangulo: ");
		ver.medida2 = leu.nextDouble();
		
		System.out.println("Digite a terceir medida do Triangulo: ");
		ver.medida3 = leu.nextDouble();
		
		System.out.println("Resultado = " + ver.identificacaoTriangulo());
		
		
		leu.close();

	}

}
