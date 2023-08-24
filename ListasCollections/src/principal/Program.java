package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		/* Listas trabalham com dados do mesmo tipo
		 * Uma lista é um tipo generico de uma collection
		 * uma lista de uma colleção de dados
		 * 
		 */
		
		ArrayList<String> nomes = new ArrayList();
		
		String nome1 = "Adicionar por ultimo";
		
		nomes.add("marcelo");
		nomes.add("Julia");
		nomes.add("Maria");
		nomes.add("Jose");
		nomes.add(nome1);
		
		System.out.println(nomes);
		System.out.println(nomes.get(0));
		
		nomes.remove(1);
		
		System.out.println(nomes);
		
		System.out.println("Imprimir com forEach:");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("Imprimir com for:");
		for(int i = 0;i<nomes.size();i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println("Imprimir com expressão lambda:");
		
		//pesquisem sobre expressão lambda
		nomes.forEach(nome -> System.out.println(nome));
		
		System.out.println("Imprimindo ordenadamente:");
		Collections.sort(nomes);
		
		nomes.forEach(nome -> System.out.println(nome));
		
		

	}

}
