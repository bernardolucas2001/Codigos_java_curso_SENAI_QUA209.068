package principal;
import java.util.Scanner;
public class Maisde3 {

	public static void main(String[] args) {
		// O usuario deve digitar 3 números e o programa digita o maior
		
		Scanner leu = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double numero1 = leu.nextDouble();
		System.out.print("Digite outro número: ");
		double numero2 = leu.nextDouble();
		System.out.print("Digite outro número: ");
		double numero3 = leu.nextDouble();
		
		leu.close();
		
		if(numero1>numero2 && numero2>numero3) {
			System.out.println("O maior dos 3 números é " + numero1);
		} else if (numero3>numero2 && numero3>numero1) {
			System.out.println("O maior dos 3 números é " + numero3);
		} else {
			System.out.println("O maior dos 3 números é " + numero2);
		}
		
	
		
		
		

	}

}
