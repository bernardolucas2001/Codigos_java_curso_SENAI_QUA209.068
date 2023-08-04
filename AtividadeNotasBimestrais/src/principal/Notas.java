package principal;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		Scanner Leitura = new Scanner(System.in);
		double nota1, nota2, nota3, nota4,  media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = Leitura.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = Leitura.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = Leitura.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = Leitura.nextDouble();
		
		Leitura.close();
		
		media = (nota1 + nota2 + nota3 + nota4);
		System.out.printf("Media do Bimestre = %.2f %n",  (media/ 4));
	}

}
