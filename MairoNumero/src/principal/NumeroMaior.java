package principal;
import java.util.Scanner;
public class NumeroMaior {

	public static void main(String[] args) {
		// o usuario digita 2 n�meros e o programa digita qual o maior
		
		Scanner leu = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		double numero1 = leu.nextDouble();
		System.out.print("Digite outro n�mero: ");
		double numero2 = leu.nextDouble();
		leu.close();
		
		System.out.printf("O maior n�mero � " + Math.max(numero1, numero2));
		

	}

}
