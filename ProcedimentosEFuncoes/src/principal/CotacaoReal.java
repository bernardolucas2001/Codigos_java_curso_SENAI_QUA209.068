package principal;

import java.util.Scanner;

public class CotacaoReal {

	public static void main(String[] args) {
		// Fa�a um programa que receba um valor em dolar 
		//e converta para reais na cota��o atual,
		//fa�a o inverso tamb�m;
		Scanner leu = new Scanner(System.in);
		
		System.out.println("Digite o valor em Dolar Americano");
		double dolar = leu.nextDouble();
		
		leu.close();
		
		System.out.printf("convertido em reais igual a  %.2f", conversao(dolar));

	} 
	static double conversao(double dolar) {
		return dolar*4.99;
	}

}
