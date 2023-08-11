package principal;

import java.util.Scanner;

public class DivisãoDeDois {
	//Escreva um algoritmo para ler 2 valores e se algum dos valores for zero não aceite, deve ser lido
	//um novo valor, imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido

	public static void main(String[] args) {
		
		// iniciação das variaveis numero 1 e numero 2 do tipo double
		double numero1, numero2; 
		
		//Scanner para a leitura de dados que o usuario inserir no sistema.
		Scanner sc = new Scanner(System.in);
		
		// Validar o primeiro numero
		do {
		System.out.println("Digite um número maior que 0");
		//leitura do primeiro numero digitado pelo usuario
		numero1 = sc.nextDouble();
		} while (numero1 <=0);
		
		// Validar o segundo numero
		do {
		System.out.println("Digite um número maior que 0");
		numero2 = sc.nextDouble();
		} while (numero2 <= 0);
		
		//iniciação da variavel divisao e o cálculo da divisão do primeiro numero pelo 2 numero
		Double divisao = numero1/numero2;
		
		//Impressão na tela da mensagem Resultado da divisão + o valor da divisão dos 2 números
		System.out.println("Resultado da divisão = " + divisao);
		sc.close();
		
		

	}

}
