package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		// Conceito de carro
		//caracteristicas(atributos)
		//exemplo de comportamentos(métodos): acelerar, freiar, acender farois.
		//comportamentos(métodos/função)
		//classes tem muitos recursos como :
		//sobrecarga de metodos e construtores
		//4 pilares podem ser aplicados
		//emtities(entidades do sistema) de acordo com a modelagem
		//de negocios: Carro, Pessoa, endereço...
		//Services: ClientService, E-mail Service...
		//Controllers
		//utilitarias : Math
		// classe é um molde para o objeto
		Scanner sc = new Scanner(System.in);
		
		Carro carro = new Carro();
		Carro carroPopular = new Carro();
		
		carro.modelo = "celta";
		carro.ano = "2010";
		carro.placa = "xpt-2023";
		carro.cor = "azul";
		
		carroPopular.modelo = "gol";
		carroPopular.cor = "vermelho";
		
		/*System.out.println("Entre com o ano do carro: ");
		carroPopular.ano = sc.nextLine();
		
		System.out.println(carro.ano);
		System.out.println(carroPopular.ano);
		*/
		
		System.out.println(carro.acelerar);
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		
		System.out.println(carro.acelerar);
		carro.acelerar = 10;
		
		System.out.println(carro.acelerar);
		
		
		
		sc.close();
	}

}
