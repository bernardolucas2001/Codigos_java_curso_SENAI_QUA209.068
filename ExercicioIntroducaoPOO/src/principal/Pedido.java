package principal;

import java.util.Scanner;

import entities.Pagamento;

public class Pedido {

	public static void main(String[] args) {
		// Fa�a um programa que simule uma venda (nome, pre�o, quantidade) e ao final pergunte se � pix, dinheiro, debito, credito
		//(para pix tem desconto de 6%, dinheiro desconto de 8%, para debito 5 % e credito n�o possui desconto);
		Scanner lendo = new Scanner(System.in);
		Pagamento pagar = new Pagamento();
		
		System.out.println("Digite o nome do produto: ");
		pagar.nome = lendo.nextLine();
		
		System.out.println("Digite o pre�o do produto: ");
		pagar.preco = lendo.nextDouble();
		
		System.out.println("Digite a quantidade do produto na compra: ");
		pagar.quantidade = lendo.nextDouble();
		
		System.out.println("Digite a forma de pagamento(pix, dinheiro, debito, credito): ");
		pagar.pagamento = lendo.next();
		
		System.out.println("**********************************************************************");
		System.out.println("Produto: " + pagar.nome);
		System.out.println("Pre�o unitario: " + pagar.preco);
		System.out.println("Quantidade: " + pagar.quantidade);
		System.out.println("Pre�o total: " + pagar.calcularPreco());
		System.out.println();
		System.out.printf("Descontos: %.2f " , (pagar.calcularPreco() - pagar.metodoPag()));
		System.out.println();
		System.out.println("Total a pagar: " + pagar.metodoPag());

		System.out.println("**********************************************************************");
		
		lendo.close();

	}

}
