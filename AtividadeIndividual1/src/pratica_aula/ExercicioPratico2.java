package pratica_aula;
import java.util.Scanner;
public class ExercicioPratico2 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		String Nome, Sobrenome;
		Double Altura, Peso;
		int Idade;
		
		System.out.print("Digite o seu nome: ");
		Nome = Ler.nextLine();
		System.out.print("Digite seu sobrenome: ");
		Sobrenome = Ler.nextLine();
		System.out.print("Digite sua altura(com v�rgula): ");
		Altura = Ler.nextDouble();
		System.out.print("Digite seu peso: ");
		Peso = Ler.nextDouble();
		System.out.print("Digite sua idade: ");
		Idade = Ler.nextInt();
		
		
		System.out.println("Seu nome completo � " + Nome + " " + Sobrenome+ " sua Atura � " + Altura + " Metros" + " seu peso � equivalente a " + Peso + " KG" + " e voce possui " + Idade + " anos." );
		
		
		
		
		
		Ler.close();

	}

}
