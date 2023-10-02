package questao4;

import java.util.Scanner;

public class Financeiro {

	public static void main(String[] args) {
		double taxa_juros = 0.12;
		
		Scanner lendo = new Scanner(System.in);
		System.out.print("Digite o valor do emprestímo: ");
		double valor_emprestimo = lendo.nextDouble();
		lendo.close();
		
		double juros_totais = valor_emprestimo*taxa_juros;
		
		double total_pagar = valor_emprestimo + juros_totais;
		
		double parcelas = total_pagar/12;
		
		System.out.println("Valor do Emprestimo = " + valor_emprestimo);
		System.out.println("Valor calculado dos juros = " + juros_totais);
		System.out.println("Total a pagar = " + total_pagar);
		System.out.printf("Valor da Parcela(12x) = %.2f" , parcelas);

	}

}
