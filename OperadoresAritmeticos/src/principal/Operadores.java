package principal;

public class Operadores {

	public static void main(String[] args) {
		/*
		 * operador '+' para soma
		 * operador '-' para subtra��o
		 * operador '*' para multiplica��o
		 * operador '/' para divis�o
		 * operador '%' para resto da divis�o
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
		
		
		System.out.println("O Resultado da soma � igual a " + soma);
		System.out.println("Somando 2 n�meros: " + (Numero1 + Numero2));
		System.out.println("Subtraindo 2 n�meros: " + subtracao);
		System.out.println("Multiplicando 2 n�meros: " + multiplicacao);
		System.out.println("Dividindo 2 n�meros: " + divisao);
		System.out.println("Resto da divis�o de 2 n�meros: " + resto);
		System.out.println("Calculo" +calculo);
		
		

	}

}
