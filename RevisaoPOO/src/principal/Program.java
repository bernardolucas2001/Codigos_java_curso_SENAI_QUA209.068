package principal;

import entities.Funcionario;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Funcionario func = new Funcionario();
		
		
		System.out.println("Dados pessoais: ");
		pessoa.setNome("Bernardo");
		pessoa.setAltura(1.90);
		pessoa.setCpf("123.456.789-10");
		pessoa.setGenero("Masculino");
		pessoa.setIdade(22);
		
		
		System.out.println(pessoa);
		
		System.out.println("Dados pessoais empresa: ");
		func.setNome("Bernardo");
		func.setAltura(1.90);
		func.setCpf("123.456.789-10");
		func.setGenero("Masculino");
		func.setIdade(22);
		func.setSalario(20000.00);
		func.setEmpresa("Hotmart");
		
		System.out.println(func);
		
		int[] numeros = new int[5];
		int cont = 10;
		for(int contador = 0; contador < 5; contador++) {
			
			numeros[contador] = cont++;
		}
		
		for(int n : numeros) {
			System.out.println(n);
		}

		
	}
	
	

}


