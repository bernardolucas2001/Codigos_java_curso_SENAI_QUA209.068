package principal;
import java.util.Scanner;
public class Sexo {

	public static void main(String[] args) {
		// Programa recebe o sexo de uma pessoa e imprime ele na tela
		Scanner leu = new Scanner(System.in);
		System.out.println("Digite o seu sexo: ");
		char sexo = leu.next().charAt(0);
		leu.close();
		
		
		
		if(sexo == 'M' || sexo == 'm') {
			System.out.println("Sexo Masculino");
		} else {
			System.out.println("Sexo Feminino");
		}
		
		

	}

}
