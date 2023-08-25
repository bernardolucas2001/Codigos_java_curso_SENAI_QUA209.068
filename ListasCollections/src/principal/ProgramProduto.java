package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import entities.Produtos;

public class ProgramProduto {

	public static void main(String[] args) {
		//Faça um programa que receba o nome de 3 produtos, quantidade e preço, faça com que imprima na ordem alfabética e depois imprima por quantidade;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro produto:");
	    String nome1 = scan.next();
	    
	    System.out.println("Digite a quantidade do primeiro produto:");
	    int quantidade1 = scan.nextInt();
	    
	    System.out.println("Digita o preço do primeiro produto:");
	    double preco1 = scan.nextDouble();
	    
	   
		 
		System.out.println("Digite nome do segundo do produto:");
		 String nome2 = scan.next();
		
		System.out.println("Digite a quantidade do segundo produto:");
		int quantidade2 = scan.nextInt();
		
		System.out.println("Digita o preço do segundo produto:");
	    double preco2 = scan.nextDouble();
		 
		
		System.out.println("Digite nome do terceiro produto:");
		String nome3 = scan.next();
		
		System.out.println("Digite a quantidade do terceiro produto:");
	    int quantidade3 = scan.nextInt();
	    
	    System.out.println("Digita o preço do terceiro produto:");
	    double preco3 = scan.nextDouble();
	    
	    
		
		Produtos produto1 = new Produtos(nome1, quantidade1, preco1);
		Produtos produto2 = new Produtos(nome2, quantidade2, preco2);
		Produtos produto3 = new Produtos(nome3, quantidade3, preco3);
		
		
		
		ArrayList<Produtos> produto = new ArrayList<>();
		
		produto.add(produto1);
		produto.add(produto2);
		produto.add(produto3);
		
		Collections.sort(produto);
		
		System.out.println(produto);// ordem alfabetica
		
		Collections.sort(produto, Comparator.comparing(Produtos::getQuantidade));
		System.out.println(produto);
		
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
