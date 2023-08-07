package principal;
import java.util.Scanner;
public class ParOuImpar {

	public static void main(String[] args) {
		// TODO programa que define se um número é par ou impar
		Scanner lendo = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = lendo.nextInt();
		lendo.close();
		
		if(numero%2 == 0) {
			System.out.println("Número Par");
		} else {
			System.out.println("Número Impar");
		}

	}

}
