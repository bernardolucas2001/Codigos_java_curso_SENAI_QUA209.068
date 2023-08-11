package principal;

import java.util.Scanner;

public class times {
	

	public static void main(String[] args) {
		// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
		//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
		
		
		//Declaração do Scanner para fazer a leitura dos dados que o usuario vai inserir
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro time: ");
		String time1 = scan.nextLine(); // usuario digita o nome do primeiro time,ou melhor, do time mandante do manto de campo ou "da casa"
		
		System.out.println("Digite o número de gols do primeiro time: ");
		int gols1 = scan.nextInt(); // usuario digita o número de gols do primeiro time
		
		System.out.println("Digite o nome do Segundo time: ");
		String time2 = scan.next(); // usuario digita o nome do segundo time ou do time visitante.
		
		
		
		System.out.println("Digite o número de gols do segundo time: ");
		int gols2 = scan.nextInt(); //o usuario digita o número de gols do time visitante
		
		if(gols1 == gols2) { // caso a quantidade de gols dos 2 times sejam iguais, é imprimido na tela a afirmação de EMPATE e em baixo o resultado do jogo.
			System.out.println("EMPATE!");
			System.out.println("Resultado: " + time1 + " " + gols1 + " X " + gols2 + " " + time2);
		} else if (gols1>gols2) { // caso a quantidade de gols do time da casa seja maior, é imprimido na tela a afirmação de Time vencedor: +nome do time da casa ou o primeiro time e em baixo o resultado do jogo.
			System.out.println("Time Vencedor: " + time1);
			System.out.println("Resultado: " + time1 + " " + gols1 + " X " + gols2 + " " + time2);
		} else { // // caso a quantidade de gols do time visitante seja maior, é imprimido na tela a afirmação de Time vencedor: +nome do time visitante ou segundo time e em baixo o resultado do jogo.
			System.out.println("Time Vencedor: " + time2);
			System.out.println("Resultado: " + time1 + " " + gols1 + " X " + gols2 + " " + time2);
		}
		
		scan.close();

	}

}
