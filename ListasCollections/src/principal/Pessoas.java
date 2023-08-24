package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Pessoas  {

	public Pessoas(String nome1) {
		// TODO Auto-generated constructor stub
	}

	
	public static  void main(String[] args) {
		//Faça um programa que receba o nome de 5 pessoas 
		//e imprima na ordem alfabética (usar o Scanner, não precisa de classe);
		
	
		ArrayList<String> pessoas = new ArrayList<>();
		Scanner lendo = new Scanner(System.in);
		
		
		System.out.println("Digite o nome da primeira pessoa: ");
		String pessoa1 = lendo.next();
		
		System.out.println("Digite o nome da segunda pessoa: ");
	    
		String pessoa2 = lendo.next();
		
		System.out.println("Digite o nome da terceira pessoa: ");
		 String pessoa3 = lendo.next();
		
		System.out.println("Digite o nome da quarta pessoa: ");
		String pessoa4 = lendo.next();
		
		System.out.println("Digite o nome da quinta pessoa: ");
		String pessoa5 = lendo.next();
		
		
		
		
		
		
		
		pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        
        Collections.sort(pessoas, String.CASE_INSENSITIVE_ORDER);
        System.out.println(pessoas);
        
		
		
		
		
		
		
		lendo.close();

	}

}
