package principal;

import java.util.Scanner;

public class Divis�oDeDois {
	//Escreva um algoritmo para ler 2 valores e se algum dos valores for zero n�o aceite, deve ser lido
	//um novo valor, imprimir o resultado da divis�o do primeiro valor lido pelo segundo valor lido

	public static void main(String[] args) {
		
		// inicia��o das variaveis numero 1 e numero 2 do tipo double
		double numero1, numero2; 
		
		//Scanner para a leitura de dados que o usuario inserir no sistema.
		Scanner sc = new Scanner(System.in);
		
		// Validar o primeiro numero
		do {
		System.out.println("Digite um n�mero maior que 0");
		//leitura do primeiro numero digitado pelo usuario
		numero1 = sc.nextDouble();
		} while (numero1 <=0);
		
		// Validar o segundo numero
		do {
		System.out.println("Digite um n�mero maior que 0");
		numero2 = sc.nextDouble();
		} while (numero2 <= 0);
		
		//inicia��o da variavel divisao e o c�lculo da divis�o do primeiro numero pelo 2 numero
		Double divisao = numero1/numero2;
		
		//Impress�o na tela da mensagem Resultado da divis�o + o valor da divis�o dos 2 n�meros
		System.out.println("Resultado da divis�o = " + divisao);
		sc.close();
		
		

	}

}
