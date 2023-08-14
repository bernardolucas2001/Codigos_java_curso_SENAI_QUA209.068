package principal;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// fazer uma matriz para inserir nome e as notas do aluno, não precisa mostrar a média. imprima o nome e as notas
		Scanner scan = new Scanner(System.in);
		
		String[][] alunos = new String[5][5];
		
		for(int i = 0; i<alunos.length; i++) {
			for(int j = 0; j<alunos.length; j++) {
				if(j == 0) {
					System.out.println("Entre com o nome dos alunos: ");
					alunos[i][j] = scan.nextLine(); 
					
				} else {
					System.out.printf("Entre com a %d nota:" ,(j));
					alunos[i][j] = scan.nextLine();
				}
			}
			System.out.println();
		} 
		
		for(int i = 0; i<alunos.length; i++) {
			for(int j = 0; j<alunos.length; j++) {
				System.out.println(alunos[i][j] + "\t");
			}
		
				} 
		System.out.println();
		
		
		scan.close();
		
		
		
		
		
	} 
	
}