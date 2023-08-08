package principal;
import java.util.Scanner;
public class Nota {

	public static void main(String[] args) {
		Scanner leu = new Scanner(System.in);
		
		System.out.println("Digite sua nota de 0 a 10 aqui: ");
		int nota = leu.nextInt();
		
		while(nota > 10) {
			System.out.println("Valor inválido! Digite novamente sua nota: ");
			nota = leu.nextInt();
		}
		System.out.println("Sua nota foi cadastrada.");
		
		leu.close();

	}

}
