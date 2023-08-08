package principal;

import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lendo = new Scanner(System.in);
		/*
		 * Uma estrutura de repeticao
		 * repete determinado bloco de codigo enquanto
		 * uma condição for satisfeita
		 */ 
		
		//for = até; utilizado quando sabemos 
		//a quantidade de vezes qu será necessário repetir o bloco
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.println("Contador está valendo: " + contador);
		}
		
		/*while = enquanto
		 * geralmente usado quando não sabemos a quantidade de
		 * vezes que será executado comando
		 */ 
		
		int contador = 0;
		char opcao;
		
		
		 
		  System.out.println("Deseja entrar no loop s/n");
		  opcao = lendo.next().charAt(0);
		 
	
		while( opcao == 's') {
			System.out.println("Contador valendo: " + contador);
			contador++;
			System.out.println("Deseja continuar no Loop s/n");
			opcao = lendo.next().charAt(0);
		}
		
		/*do while
		 * executa pelo menos 1 vez, temos a garantia de que será
		 * executado ao menos uma vez
		 */
		
		do {
			System.out.println("Contador valendo: " + contador);
			contador++;
			System.out.println("Deseja continuar no loop s/n");
			opcao = lendo.next().charAt(0);
		} while(opcao == 's');
		
		
		lendo.close();

	}

}
