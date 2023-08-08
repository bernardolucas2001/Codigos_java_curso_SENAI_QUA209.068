package principal;
import java.util.Scanner;
public class BissextoAno {

	public static void main(String[] args) {
		//Entrada com algum ano e o programa responde se o ano é bissexto ou não.
		
		Scanner lendo = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = lendo.nextInt();
		lendo.close();
		
		
		
		if(ano% 4 == 0 && ano % 100 != 1 ) {
			System.out.println("Ano Bissexto");	
		} else {
			System.out.println("Ano não é Bissexto");
		}
		
		
		

	}

}
