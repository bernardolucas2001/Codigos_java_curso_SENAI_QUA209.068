package principal;
import java.util.Scanner;
public class BissextoAno {

	public static void main(String[] args) {
		//O USUARIO ENTRA COM UM ANO E O PROGRAMA DIZ SE ELE É BISSEXTO OU NÃO.
		
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
