package principal;
import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a dois n�meros e imprima a soma;
		Scanner leitura = new Scanner(System.in);
		double Numero1, Numero2;
		System.out.print("Digite o primeiro numero: ");
		Numero1 = leitura.nextDouble();
		System.out.print("Digite o segundo numero: ");
		Numero2 = leitura.nextDouble();
		leitura.close();
		
		System.out.println("A soma dos 2 numeros � igual a " + (Numero1 + Numero2));
		
		
		

	}

}
