package principal;
import java.util.Scanner;
public class NumeroMaior {

	public static void main(String[] args) {
		// o usuario digita 2 números e o programa digita qual o maior
		
		Scanner leu = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double numero1 = leu.nextDouble();
		System.out.print("Digite outro número: ");
		double numero2 = leu.nextDouble();
		leu.close();
		
		System.out.printf("O maior número é " + Math.max(numero1, numero2));
		

	}

}
