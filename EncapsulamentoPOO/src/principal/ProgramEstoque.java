package principal;

import java.util.Scanner;

import entities.Estoque;

public class ProgramEstoque {
	
	public static void main(String[] args) {
		//crie um programa de estoque, onde você poderá inserir um produto e a quantidade e mostrar o valor total do estoque da loja; use scanner
		
		
		
		Scanner leu = new Scanner(System.in);
		Estoque estoque = new Estoque();
		
		System.out.print("Digite o nome do Produto: ");
		estoque.setProduto(leu.next());
		
		System.out.print("Digite a quantidade do produto no estoque : ");
		estoque.setQuantidade(leu.nextDouble());
		
		System.out.print("Digite o preço unitário do produto: ");
		estoque.setPreco(leu.nextDouble());

		leu.close();
		
		estoque.imprimirDados();
		
		//estoque.adicionarQuantidade(10);Exemplo de Adição da quantidade de estoque
		//estoque.removendoQuantidade(5); Exemplo de Remoção da quantidade de estoque
		
		estoque.imprimirDados();
	}
	
	
	

}
