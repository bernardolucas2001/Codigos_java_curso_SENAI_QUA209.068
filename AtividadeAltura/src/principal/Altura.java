package principal;

import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		// O Programa recebe 10 alturas digitadas pelo usuario e retorna a média delas.
		Scanner ler = new Scanner(System.in);
		double altura = 0;
		double media = 0;
		double pessoa = 0;
		
		
		
		 for(int cont = 1; cont<= 10; cont++) {
			 System.out.println("Digite sua altura:");
		     altura = ler.nextDouble();
		     media = media + altura;
		    
		 }   
		     
		     
		 
		 	
		ler.close();
		
		
		System.out.printf("A média das alturas, em cm, é: %.2f ", (media/10));

	}

}
