package principal;

import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioChefia;

public class ProgramFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lendo = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		Funcionario chefia = new FuncionarioChefia();
		//Funcionario chefia = new FuncionarioChefia(); polimorfismo
		
		System.out.println("Funcionario Comum: ");
		
		
		System.out.println("Digite o nome do Funcionario: ");
		funcionario.setNome(lendo.next());
		
		System.out.println("Digite o cargo do Funcionario: ");
		funcionario.setCargo(lendo.next());
		
		System.out.println("Digite a idade do Funcionario: ");
		funcionario.setIdade(lendo.nextInt());
		
		System.out.println("Digite o Salario Bruto do Funcionario:");
		funcionario.setSalarioBruto(lendo.nextDouble());
	
		
		
		
		
		System.out.println("Funcionario 'Chefia': ");
		
		System.out.println("Digite o nome do Funcionario: ");
		chefia.setNome(lendo.next());
		
		
		chefia.setCargo("Chefia");
		
		System.out.println("Digite a idade do Funcionario: ");
		chefia.setIdade(lendo.nextInt());
		
		System.out.println("Digite o Salario Bruto do Funcionario:");
		chefia.setSalarioBruto(lendo.nextDouble());
		
		funcionario.ObterDados();
		chefia.ObterDados();
		
		lendo.close();
	}

}
