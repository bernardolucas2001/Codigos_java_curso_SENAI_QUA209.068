package principal;
import java.util.Scanner;
public class AtividadeGastosEmpresa {

	public static void main(String[] args) {
		// Uma empresa tem gastos mensais e a cada 3 meses realiza um balanço para verificar a media de gastos dos 3 meses. 
		//Faça um programa que receba os valores de cada mês e imprima na tela o valor total gasto no período e 
		//a media dos gastos.
		
		Scanner leitura = new Scanner(System.in);
		double mes1, mes2, mes3, SomaTotal;
		
		System.out.println("Digite os gastos do mes 1: ");
		mes1 = leitura.nextDouble();
		
		System.out.println("Digite os gastos do mes 2: ");
		mes2 = leitura.nextDouble();
		
		System.out.println("Digite os gastos do mes 3: ");
		mes3 = leitura.nextDouble();
		
		SomaTotal = (mes1 + mes2 + mes3);
		
		System.out.printf("Media do Trimestre = %.2f %n",  (SomaTotal/ 3));
		
		
		
		
		leitura.close();


	}

}
