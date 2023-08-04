package principal;
import java.util.Scanner;
public class HorasTrabalho {

	public static void main(String[] args) {
		// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		//Calcule e mostre o total do seu salário no referido mês (sem descontos e impostos).
		Scanner leitura = new Scanner(System.in);
		double ValorHora;
		int HoraTrabalhada;
		
		System.out.print("Digite o valor de hora trabalhada aqui: ");
		ValorHora = leitura.nextDouble();
		
		System.out.print("Digite a quantidade de hora trabalhada no mes: ");
		HoraTrabalhada = leitura.nextInt();
		
		System.out.println("O total do seu salário mensal atual, sem os descontos, é igual a " + (ValorHora * HoraTrabalhada));
		
		
		leitura.close();
		

	}

}
