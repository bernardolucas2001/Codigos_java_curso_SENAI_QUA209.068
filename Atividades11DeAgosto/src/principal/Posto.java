package principal;

import java.util.Scanner;

public class Posto {
	

	public static void main(String[] args) {
		// Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		//até 20 litros, desconto de 3% por litro Álcool
		//acima de 20 litros, desconto de 5% por litro 
		//até 20 litros, desconto de 4% por litro Gasolina
		//acima de 20 litros, desconto de 6% por litro

		//Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
		//seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
		//que o preço do litro da gasolina é R$ 5,80 e o preço do litro do álcool é R$ 3,90. 
		
		
		//Declaração do Scanner para fazer a leitura dos dados que o usuario vai inserir
		Scanner lendo = new Scanner(System.in);
		
		double litros; // iniciando variavel litros do tipo double.
		
		//Varíavel para saber qual o tipo de combustivel
		System.out.println("Digite se o combustivel vai ser A-álcool ou G-gasolina");
		char combustivel = lendo.next().charAt(0);
		combustivel = Character.toUpperCase(combustivel); // tranforma tudo que for digitado em número maiusculo para evitar que o sistema tenha erro por letra minuscula inserida pelo usuario.
		
		//Validar a quantidade de litros
		do {
		System.out.println("Digite a quantidade de litros abastecido: ");
		 litros = lendo.nextDouble(); //usuario digita a quantidade de litros abastecida ou que ele pretende abastecer
		} while(litros <= 0);
		 
		
		
		// o calculo d valor decontado é o seguinte: a quantidade litro *(Valor do litro do tipo do combustivel *(Valor do tipo do combustivel * pelo desconto respectivo que pode ser: desconto/100 ou o resultado ja da divisão)
		if(combustivel == 'A' && litros <= 20) { // se abastecer do tipo Alcool e menor ou igual a 20 litros
			//o programa vai imprimir na tela a mensagem de valor total a pagar do tipo do combustivel Alccol
			//+ o valor final que o cliente vai pagar
			
			double litroComb = 3.90; 
			System.out.printf("Valor total a pagar do abastecimento de combustivel do tipo Álcool = %.2f", (litros*(litroComb - (litroComb*0.03))));
			
		} else if(combustivel == 'A' && litros > 20) { // se abastecer do tipo Alcool e maior a 20 litros
			//o programa vai imprimir na tela a mensagem de valor total a pagar do tipo do combustivel Alccol
			//+ o valor final que o cliente vai pagar
			
			double litroComb = 3.90; 
			System.out.printf("Valor total a pagar do abastecimento de combustivel do tipo Álcool = %.2f",(litros*(litroComb - (litroComb*0.05))));
			
		} else if(combustivel == 'G' && litros <= 20) { // se abastecer do tipo Gasolina e maior a 20 litros
			//o programa vai imprimir na tela a mensagem de valor total a pagar do tipo do combustivel Gasolina
			//+ o valor final que o cliente vai pagar
			
			double litroComb = 5.80; 
			System.out.printf("Valor total a pagar do abastecimento de combustivel do tipo Gasolina = %.2f", (litros*(litroComb - (litroComb*0.04))));
			
		} else if (combustivel == 'G' && litros > 20){ // se abastecer do tipo Gasolina e maior a 20 litros
			//o programa vai imprimir na tela a mensagem de valor total a pagar do tipo do combustivel Gasolina
			//+ o valor final que o cliente vai pagar
			
			double litroComb = 5.80; 
			System.out.printf("Valor total a pagar do abastecimento de combustivel do tipo Gasolina = %.2f",(litros*(litroComb - (litroComb*0.06))));
			
		} else { //Caso o usuario digita outra letra que não seja A(maisculo) ou G(maisculo), o programa imprime uma mensagem de opção invalida.
			System.out.println("Opção invalída");
		}
	
		
		
		lendo.close();

	}

	

}
