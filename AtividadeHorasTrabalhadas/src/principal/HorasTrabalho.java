package principal;
import java.util.Scanner;
public class HorasTrabalho {

	public static void main(String[] args) {
		// Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		//Calcule e mostre o total do seu sal�rio no referido m�s (sem descontos e impostos).
		Scanner leitura = new Scanner(System.in);
		double ValorHora;
		int HoraTrabalhada;
		
		System.out.print("Digite o valor de hora trabalhada aqui: ");
		ValorHora = leitura.nextDouble();
		
		System.out.print("Digite a quantidade de hora trabalhada no mes: ");
		HoraTrabalhada = leitura.nextInt();
		
		System.out.println("O total do seu sal�rio mensal atual, sem os descontos, � igual a " + (ValorHora * HoraTrabalhada));
		
		
		leitura.close();
		

	}

}
