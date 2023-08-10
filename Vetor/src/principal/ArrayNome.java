package principal;

import java.util.Scanner;

public class ArrayNome {

	public static void main(String[] args) {
		// Programa recebe uma quantidade x de nomes e imprime os nuimeros recebidos(que o usuario digitou). 
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Digite o número total de nomes que voce quer guardar: ");
		int x = scan.nextInt();
		scan.nextLine();
		
		String[] nomes = new String[x];
		
		for(int cont = 0; cont < nomes.length; cont++) {
			System.out.print("Digite o nome aqui : ");
			nomes[cont] = scan.nextLine() ;
			 ;
			
			
		} for(String nome : nomes) {
			System.out.println(nome);
		}
		
		
		
			
		
		
		
		
		scan.close();

	}
}


