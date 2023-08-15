package principal;

import java.util.Scanner;

public class bonificacao {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba o salario e a quantidade de venda total que o vendedor fez
no mes, e calcule o salario do mês. Há também o desconto de 5% de inss e 11% de IRPF
sobre o salario bruto.

Se o vendedor possui o total de venda acima de 20 mil no mês, ele recebe uma bonificação
de 5% sobre o valor das vendas;

Se o vendedor possui o total de venda entre 15 e 20 mil reais, recebe uma bonificação de
3% no valor da venda;

Se o vendedor possui o total de venda entre 10 e 15 mil reais, recebe uma bonificação de
1% no valor da venda;

Se o valor não passar de 10 mil, imprima uma frase motivacional;

Todos os funcionários devem ter o contracheques detalhado, funcionários que receberam
bonificações não devem ter descontos sobre a bonificação, indicando o mês de referencia;
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o mês atual: ");
		String mes = sc.next(); 
		
		
		System.out.print("Digite o seu salario: ");
		double salario = sc.nextDouble();
		
		System.out.print("Digite a quantidade de vendas do mes atual: ");
		double vendas = sc.nextDouble();
		
		
		
	
		
		if(vendas > 20000) {
			double bonificacao = (vendas*1.05)- vendas;
			System.out.println("contracheque do mês: " + mes);
			System.out.println("Salario BRUTO(SEM DESCONTOS): " + salario);
			System.out.println("salario final( com desconto de INSS e IRPF): " + desconto(salario));
			System.out.println("Bonificações = " + bonificacao);
			System.out.println("Total a receber = " +(desconto(salario)+bonificacao));
		} else if(vendas <= 20000 && vendas > 15000) {
			double bonificacao =(vendas*1.03) - vendas;
			System.out.println("contracheque do mês " + mes);
			System.out.println("Salario BRUTO(SEM DESCONTOS): " + salario);
			System.out.println("salario final( com desconto de INSS e IRPF): " + desconto(salario));
			System.out.println("Bonificações = " + bonificacao);
			System.out.println("Total a receber = " +(desconto(salario)+bonificacao));
			
		} else if(vendas <= 15000 && vendas >= 10000) {
			double bonificacao = (vendas*1.01) - vendas;
			System.out.println("contracheque do mês " + mes);
			System.out.println("Salario BRUTO(SEM DESCONTOS): " + salario);
			System.out.println("salario final( com desconto de INSS e IRPF): " + desconto(salario));
			System.out.println("Bonificações = " + bonificacao);
			System.out.println("Total a receber = " +(desconto(salario)+bonificacao));
		} else {
			
			System.out.println("contracheque do mês " + mes);
			System.out.println("Salario BRUTO(SEM DESCONTOS): " + salario);
			System.out.println("salario final( com desconto de INSS e IRPF): " + desconto(salario));
			System.out.println("Total a receber = " +(desconto(salario)));
			System.out.println(" Frase Motivacional: Quando você tiver finalizado uma meta, não olhe para ela como a linha de chegada;"
					+ " olhe para ela como o ponto de partida para sua próxima conquista"
					+ ".A vida é uma maratona sem fim. Não fique ocioso por muito tempo;"
					+ " em vez disso, concentre-se no próximo ponto do marcador.");
		}
		
		sc.close();
		
		
		
		
		
		
		
		

	}
	static double desconto(double salario) {
		double descontoInss = salario*0.05;
		double descontoIrpf = salario *0.11;
		double salarioFinal = salario -(descontoInss + descontoIrpf);
		return salarioFinal;
	}

}
