package pratica_aula;
import java.util.Scanner;

public class ExercicioPratica1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double Numero;
		
		System.out.print("Digite um número: ");
		Numero = ler.nextDouble();
		
		System.out.println("O número digitado foi: " + Numero);
		
		ler.close();
		

	}

}
