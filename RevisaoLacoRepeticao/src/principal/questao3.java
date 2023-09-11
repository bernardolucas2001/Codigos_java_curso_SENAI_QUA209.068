package principal;

import java.util.Random;
import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
	Scanner leitura = new Scanner(System.in);
	Random gerador = new Random();
    
	int numeroDesconhecido = gerador.nextInt(100) + 1;
	int tentativa, contadorTentativas = 0;
	
	do {System.out.println("Adivinhe um número no intervalo entre 1 e 100! ");
	
	tentativa = leitura.nextInt();
	
	contadorTentativas++;
	
	if(tentativa > numeroDesconhecido) {
		System.out.println("Tente um número menor.");
	}
	else if(tentativa < numeroDesconhecido) {
		System.out.println("Tente um número maior.");
	}
	else {
		System.out.println("Voce acertou o número depois de " + contadorTentativas + " tentativas.");
	}
	
	}while(tentativa != numeroDesconhecido); 
		leitura.close();}
	
	

	}


