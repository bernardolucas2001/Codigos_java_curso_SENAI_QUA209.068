package principal;

import java.util.Scanner;

public class ArrayNotas {

	public static void main(String[] args) {
		// Programa pede o nome do aluno e as respectivas 4 notas do bimestre, imprimi na tela a media e se o aluno foi aprovado ou reprovado.
		Scanner lendo = new Scanner(System.in);
		double media = 0;
		
		System.out.println("Digite o nome do aluno: ");
		String Nome = lendo.next();
		
		double [] notas = new double[4];
		
		for(int contador = 0; contador < notas.length;contador++ ) {
			System.out.println("Digite a nota do aluno: ");
			notas[contador] = lendo.nextDouble();
			media += notas[contador];
			
		}
		
		System.out.printf("Media do %s  = %.2f ", Nome, (media/4));
		System.out.println("");
	    
		
		
		if((media/4) < 7) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Aprovado");
		}
		
		
		lendo.close();
		
	

	}

}
