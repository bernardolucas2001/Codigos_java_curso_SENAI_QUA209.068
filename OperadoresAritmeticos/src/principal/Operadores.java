package principal;

public class Operadores {

	public static void main(String[] args) {
		/*
		 * operador '+' para soma
		 * operador '-' para subtração
		 * operador '*' para multiplicação
		 * operador '/' para divisão
		 * operador '%' para resto da divisão
		 */ 
		
		int Numero1, Numero2, soma, divisao, multiplicacao, subtracao, resto, calculo;
		
		Numero1 = 10;
		Numero2 = 10;
		soma = Numero1 + Numero2;
		subtracao = Numero1 - Numero2;
		multiplicacao = Numero1 * Numero2;
		divisao = Numero1 / Numero2;
		resto = Numero1 % Numero2;
		calculo = 10 + 10 * 10 / 10;
		
		
		System.out.println("O Resultado da soma é igual a " + soma);
		System.out.println("Somando 2 números: " + (Numero1 + Numero2));
		System.out.println("Subtraindo 2 números: " + subtracao);
		System.out.println("Multiplicando 2 números: " + multiplicacao);
		System.out.println("Dividindo 2 números: " + divisao);
		System.out.println("Resto da divisão de 2 números: " + resto);
		System.out.println("Calculo" +calculo);
		
		

	}

}
