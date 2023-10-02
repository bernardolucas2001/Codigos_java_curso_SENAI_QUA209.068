package questao2;

import java.util.Scanner;

public class SegundaQuestao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o total de aulas: ");
		double total_aulas = scanner.nextDouble();
		System.out.print("Digite a quantidade de aulas frequentadas pelo aluno: ");
		double aulas_frenq = scanner.nextDouble();
		
		double frequencia = (aulas_frenq/total_aulas)*100;
		
		System.out.println(frequencia);
		if(frequencia < 75) {
			System.out.println("O aluno está reprovado por faltas");
		} else {
			System.out.println("O aluno esta com a frequencia de faltas aceitavel");
		}
		
		scanner.close();

	}

}
