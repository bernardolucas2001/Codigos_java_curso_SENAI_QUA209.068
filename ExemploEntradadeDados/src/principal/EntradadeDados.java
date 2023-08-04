package principal;

import java.util.Scanner;

public class EntradadeDados {
//leitura.nextLine() é o comado usado quando ocorre um problema quando ler um dado do tipo inteiro antes da leitura de um dado do tipo String.
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		//final double PI = 3.1415;
		String nome;
		System.out.print("Por favor , Digite o seu nome: ");
		//leitura de dados dotipo String (conjunto de caracteres)
		nome = leitura.nextLine();
		
		
		
		System.out.print("Digite sua idade: ");
		//leitura de dados do tipo int(inteiros)
		int idade = leitura.nextInt();
		
		
		System.out.print("Digite sua altura: ");
		//leitura dados do tipo Double(aceita números "quebrados")
		double altura = leitura.nextDouble();
		
		
		System.out.print("Digite seu sexo (M ou F): ");
		//leitura de dados do tipo de dados Char(no caso pegando no indice 0, ou seja , a primeira letra"
		char sexo = leitura.next().charAt(0);
		
		
		
		System.out.println("o nome digitado foi " + nome);
		System.out.println("a idade digitada foi " + idade + " anos.");
		System.out.println("A altura digitada foi " + altura + " metros.");
		System.out.println("o sexo definido foi " + sexo);
		
		
		
		
		
		
		
		leitura.close();

	}

}
