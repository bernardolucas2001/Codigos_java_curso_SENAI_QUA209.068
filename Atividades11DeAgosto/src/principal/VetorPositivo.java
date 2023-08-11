package principal;

import java.util.Scanner;

public class VetorPositivo {

	public static void main(String[] args) {
		// Ler um vetor Q de 20 posi��es (aceitar somente n�meros positivos), caso n�o atenda a condi��o deve informar novamente 
		// o numero at� que a condi��o seja aceita, ao final mostre os n�meros inseridos no vetor e a soma deles.
		
		// inicia��o do scanner para a leitura de dados 
		Scanner scan = new Scanner(System.in);
		
		// iniciaa�a� do vetor posi��es com o tamanho de 20 posi��es;
		int [] posicoes = new int [20];
		
		//inicia��o da variavel numero do tipo inteiro;
		int numero;
		
		//inicia��o da variavel soma do tipo inteiro
		int soma = 0;
		
		
		for(int cont =0; cont < posicoes.length; cont++) {
			System.out.println("Digite um n�mero:");
			//leitura de dados da variavel numero
			numero = scan.nextInt();
			if(numero<=0) { // se o numero digitado for menor ou igual a 0(no caso um numero n�o positivo)
				// ent�o o sistema pede para que ele escreva de novo ate que a condi��o seja atendida.
				System.out.println("N�mero invalido! Digite novamente: ");
				numero = scan.nextInt();
			} else { //se o numero � positivo, ele � colocado no vetor e a variavel soma vai somar todos os numeros ate o fim da estrutura de repeti�a�
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
