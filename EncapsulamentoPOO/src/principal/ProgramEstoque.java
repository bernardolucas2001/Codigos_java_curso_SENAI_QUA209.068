package principal;

import java.util.Scanner;

import entities.Estoque;

public class ProgramEstoque {
	
	public static void main(String[] args) {
		//crie um programa de estoque, onde voc� poder� inserir um produto e a quantidade e mostrar o valor total do estoque da loja; use scanner
		
		
		
		Scanner leu = new Scanner(System.in);
		Estoque estoque = new Estoque();
		
		System.out.print("Digite o nome do Produto: ");
		estoque.setProduto(leu.next());
		
		System.out.print("Digite a quantidade do produto no estoque : ");
		estoque.setQuantidade(leu.nextDouble());
		
		System.out.print("Digite o pre�o unit�rio do produto: ");
		estoque.setPreco(leu.nextDouble());

		leu.close();
		
		estoque.imprimirDados();
	}
	
	
	

}