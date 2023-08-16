package principal;

import java.util.Scanner;

public class bonificacao {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba o salario e a quantidade de venda total que o vendedor fez
no mes, e calcule o salario do m�s. H� tamb�m o desconto de 5% de inss e 11% de IRPF
sobre o salario bruto.

Se o vendedor possui o total de venda acima de 20 mil no m�s, ele recebe uma bonifica��o
de 5% sobre o valor das vendas;

Se o vendedor possui o total de venda entre 15 e 20 mil reais, recebe uma bonifica��o de
3% no valor da venda;

Se o vendedor possui o total de venda entre 10 e 15 mil reais, recebe uma bonifica��o de
1% no valor da venda;

Se o valor n�o passar de 10 mil, imprima uma frase motivacional;

Todos os funcion�rios devem ter o contracheques detalhado, funcion�rios que receberam
bonifica��es n�o devem ter descontos sobre a bonifica��o, indicando o m�s de referencia;
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o m�s atual: ");
		String mes = sc.next(); 
		
		
		System.out.print("Digite o seu salario: ");
		double salario = sc.nextDouble();
		
		System.out.print("Digite a quantidade de vendas do mes atual: ");
		double vendas = sc.nextDouble();
		
		System.out.println("********************************");
		System.out.println("contracheque do m�s de " + mes);
		System.out.println("Salario BRUTO(SEM DESCONTOS): " + salario);
		System.out.println("salario L�quido( com desconto de INSS e IRPF): " + desconto(salario));
		System.out.println("Descontos = " + (salario - desconto(salario)));
		System.out.println("Bonifica��es = " + comissao(vendas));
		System.out.println("Total a receber(S�lario L�quido + Bonifica��es/comiss�o(se tiver)=  " +(desconto(salario)+comissao(vendas))); 
		
		if(vendas<10000) {
			System.out.println(" Frase Motivacional: Quando voc� tiver finalizado uma meta, n�o olhe para ela como a linha de chegada;"
					+ " olhe para ela como o ponto de partida para sua pr�xima conquista"
					+ ".A vida � uma maratona sem fim. N�o fique ocioso por muito tempo;"
					+ " em vez disso, concentre-se no pr�ximo ponto do marcador.");
		}
		System.out.println("********************************");
	
		
		sc.close();
		
		
		
		
		
		
		
		

	}
	static double desconto(double salario) {
		double descontoInss = salario*0.05;
		double descontoIrpf = salario *0.11;
		double salarioFinal = salario -(descontoInss + descontoIrpf);
		return salarioFinal;
	}
	static double comissao(double vendas) {
		double bonificacao = 0;
		if(vendas > 20000) {
			 bonificacao = (vendas*0.05);
		}  else if(vendas <= 20000 && vendas > 15000) {
			 bonificacao =vendas*0.03 ;
		} else if(vendas <= 15000 && vendas >= 10000) {
			bonificacao = vendas*0.01 ;
		} else { 
			 bonificacao = 0;
			 
		} 
		return bonificacao;
		
	}
	

}
