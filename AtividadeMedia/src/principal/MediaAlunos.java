package principal;
import java.util.Scanner;
public class MediaAlunos {

	public static void main(String[] args) {
		// recebe 4 notas e faz a media, dizendo se o aluno esta aprovado com honras, aprovado ou reprovado.
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
		
		media = ((nota1 + nota2 + nota3 + nota4)/4);
		System.out.printf("Media do Bimestre = %.2f %n", media);
		
		if(media < 6) {
			System.out.println("Reprovado");
		}else if(media > 6 && media < 7) {
			System.out.println("Recuperação");
		}else if(media > 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Aprovado com honras.");
		}
		

	}

}
