package principal;

import java.util.Scanner;

public class IntervaloDoisNumeros {

	public static void main(String[] args) {
		// Programa recebe 2 n�meros digitados e imprimir os numeros que est�o no intervalo entre eles.
		// Vale ressaltar que o primeiro numero deve ser menor que o segundo.
		Scanner lendo = new Scanner(System.in);
		int numero1, numero2; //entradas do usuario
		int soma = 0;
		
		System.out.print("Digite um n�mero: ");
		numero1 = lendo.nextInt();
		System.out.print("Digite outro n�mero: ");
		numero2 = lendo.nextInt();
		
		
		for(int i=numero1;i<=numero2;i++){
		   soma = i;
		   System.out.println(soma);
		} 
		
		lendo.close();

	}

}
