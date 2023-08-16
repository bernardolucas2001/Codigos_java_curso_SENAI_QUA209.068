package principal;

import java.util.Scanner;

import entities.NomeEIdade;

public class Usuario {

	public static void main(String[] args) {
		//Faça um programa que receba o nome e o ano de nascimento e retorne a idade atual do usuário;
		
		NomeEIdade user = new NomeEIdade();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		user.nome = sc.nextLine();
		
		System.out.print("Digite seu Ano de Nascimento: ");
		user.anoNascimento = sc.nextInt();
		
		
		System.out.println("Você, " + user.nome +" ,possui " + user.calcularIdade(user.anoNascimento) + " anos de idade.");
		
		sc.close();

	}

}
