package principal;

import java.util.Scanner;

public class ArrayNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lendo = new Scanner(System.in);
		double media = 0;
		
		double [] notas = new double[4];
		
		for(int contador = 0; contador < notas.length;contador++ ) {
			System.out.println("Digite sua nota: ");
			notas[contador] = lendo.nextDouble();
			media += notas[contador];
			
		}
		System.out.println("Media = " + media/4);
		
		if((media/4) < 7) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Aprovado");
		}
		
		lendo.close();
		
	

	}

}
