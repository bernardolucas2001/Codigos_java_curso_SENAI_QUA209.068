package principal;

import java.util.Scanner;

public class OrdemDecrescente {
	
	public static void main(String[] args) {
		//digite 3 n�meros e o programa vai exibir em ordem decrescente na tela.
		Scanner lendo = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("Digite o Primeiro n�mero: ");
		numero1 = lendo.nextInt();
		System.out.println("Digite o Segundo n�mero: ");
		numero2 = lendo.nextInt();
		System.out.println("Digite o Terceiro n�mero: ");
		numero3 = lendo.nextInt();
		
		if(numero1<numero2) {
			if(numero2<numero3) {
				System.out.println(numero3);
				System.out.println(numero2);
				System.out.println(numero1);
			} else {
				System.out.println(numero2);
				System.out.println(numero3);
				System.out.println(numero1);	
			}
		} else {
			if(numero2>numero3 && numero1>numero3) {
				System.out.println(numero1);
				System.out.println(numero2);
				System.out.println(numero3);
			} else {
				System.out.println(numero3);
				System.out.println(numero1);
				System.out.println(numero2);

				
			}
		}
		
			 
	
		
		lendo.close();
		

	}

}
