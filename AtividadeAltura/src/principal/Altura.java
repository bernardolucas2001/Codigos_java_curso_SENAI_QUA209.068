package principal;

import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		// O Programa recebe 10 alturas digitadas pelo usuario e retorna a média delas.
		Scanner ler = new Scanner(System.in);
		double altura1,altura2,altura3,altura4,altura5,altura6,altura7,altura8,altura9,altura10, media;
		
		 System.out.println("Digite a primeira altura: ");
		 altura1 = ler.nextDouble();
		
		 System.out.println("Digite a segunda altura: ");
		 altura2 = ler.nextDouble();
		 
		 System.out.println("Digite a terceira altura: ");
		 altura3 = ler.nextDouble();
		 
		 System.out.println("Digite a quarta altura: ");
		 altura4 = ler.nextDouble();
		 
		 System.out.println("Digite a quinta altura: ");
		 altura5 = ler.nextDouble();
		 
		 System.out.println("Digite a sexta altura: ");
		 altura6 = ler.nextDouble();
		 
		 System.out.println("Digite a setima altura: ");
		 altura7 = ler.nextDouble();
		 
		 System.out.println("Digite a oitava altura: ");
		 altura8 = ler.nextDouble();
		 
		 System.out.println("Digite a nona altura: ");
		 altura9 = ler.nextDouble();
		 
		 System.out.println("Digite a ultima altura: ");
		 altura10 = ler.nextDouble();
		 
		 	
		ler.close();
		
		media = (altura1 + altura2+ altura3 + altura4 + altura5 + altura6 + altura7 + altura8 + altura9 + altura10)/10;
		
		System.out.printf("A média das alturas, em cm, é: %.2f ", media);

	}

}
