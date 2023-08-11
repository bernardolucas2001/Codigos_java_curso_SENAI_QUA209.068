package principal;

import java.util.Scanner;

public class VetorPositivo {

	public static void main(String[] args) {
		// Ler um vetor Q de 20 posições (aceitar somente números positivos), caso não atenda a condição deve informar novamente 
		// o numero até que a condição seja aceita, ao final mostre os números inseridos no vetor e a soma deles.
		
		// iniciação do scanner para a leitura de dados 
		Scanner scan = new Scanner(System.in);
		
		// iniciaaçaõ do vetor posições com o tamanho de 20 posições;
		int [] posicoes = new int [20];
		
		//iniciação da variavel numero do tipo inteiro;
		int numero;
		
		//iniciação da variavel soma do tipo inteiro
		int soma = 0;
		
		
		for(int cont =0; cont < posicoes.length; cont++) {
			System.out.println("Digite um número:");
			//leitura de dados da variavel numero
			numero = scan.nextInt();
			if(numero<=0) { // se o numero digitado for menor ou igual a 0(no caso um numero não positivo)
				// então o sistema pede para que ele escreva de novo ate que a condição seja atendida.
				System.out.println("Número invalido! Digite novamente: ");
				numero = scan.nextInt();
			} else { //se o numero é positivo, ele é colocado no vetor e a variavel soma vai somar todos os numeros ate o fim da estrutura de repetiçaõ
				posicoes[cont] = numero;
				soma += numero;
			}
			
			
		 	
			
		}
		//Imprime todos os numeros que o usuario digitou que foram guardados no vetor
		for(int numeros : posicoes) {
			System.out.println(numeros);
		} 
		// imprime uma mensagem de "Soma dos numeros = " + o valor da soma de todos os numeros que o vetor salvou que o usuario digitou
		System.out.println("Soma dos numeros = " + soma);
		
		scan.close();
	

	}

}
