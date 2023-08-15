package principal;

import java.util.Scanner;

public class cotacao {

	public static void main(String[] args) {
		// Faça um programa que receba um valor em real 
		//e converta para dólares na cotação atual,
		//faça o inverso também;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em real: ");
		double real = scan.nextDouble();
		
		scan.close();
		
		System.out.printf("conversão em dolar americano = %.2f", conversao(real));

	}
	static double conversao(double real) {
		double dolar = 4.99;
		return real/dolar;
	}

}
