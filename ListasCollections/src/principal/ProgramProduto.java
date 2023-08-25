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
	    
	   
		 
		System.out.println("Digite nome segundo produto:");
		 String nome2 = scan.next();
		
		System.out.println("Digite a quantidade do segundo produto:");
		int quantidade2 = scan.nextInt();
		 
		
		System.out.println("Digite nome do terceiro produto:");
		String nome3 = scan.next();
		
		System.out.println("Digite a quantidade do terceiro produto:");
	    int quantidade3 = scan.nextInt();
	    
	    
		
		Produtos produto1 = new Produtos(nome1, quantidade1, 5.00);
		Produtos produto2 = new Produtos(nome2, quantidade2, 10.50);
		Produtos produto3 = new Produtos(nome3, quantidade3, 20.50);
		
		
		
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
