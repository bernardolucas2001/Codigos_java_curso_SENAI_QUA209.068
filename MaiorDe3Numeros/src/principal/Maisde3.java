package principal;
import java.util.Scanner;
public class Maisde3 {

	public static void main(String[] args) {
		// O usuario deve digitar 3 n�meros e o programa digita o maior
		
		Scanner leu = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		double numero1 = leu.nextDouble();
		System.out.print("Digite outro n�mero: ");
		double numero2 = leu.nextDouble();
		System.out.print("Digite outro n�mero: ");
		double numero3 = leu.nextDouble();
		double comparacao = 0;
		leu.close();
		
		comparacao = Math.max(numero1, numero2);
		comparacao = Math.max(numero1, numero3);
		comparacao = Math.max(numero2, numero3);
		
		System.out.println("O maior dos 3 n�meros � " + comparacao);
		
		
		

	}

}
