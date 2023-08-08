package principal;
import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;
// arquivo utilizado para explicar as bibliotecas Math e Locale
public class MathELocale {

	public static void main(String[] args) {
		//atalho para importar ctrl+shift+o
		final Locale ponto = new Locale("en", "us");
		Scanner leitura = new Scanner(System.in);
		
		double altura = 0;
		double decimal = 10.33333333;
		int numero = (int) decimal;
		
		//potencia
		System.out.println(Math.pow(2, 5));
		
		//maior número entre 2 números ou variaveis
		System.out.println(Math.max(2, 10));
		
		//menor numero entre 2 números ou variaveis
		System.out.println(Math.min(2, 10));
		
		//obter raiz quadrada
		System.out.println(Math.sqrt(16));
		
		//arredondar número
		System.out.println(Math.round(decimal));
		
		//número PI arredondado
		System.out.println(Math.PI);
		
		System.out.printf("Resultado: %.2f", decimal);
		
		System.out.println("Digite sua altura: ");
		altura = leitura.useLocale(ponto).nextDouble();
		
		System.out.println("A altura digitada foi: " + altura); 
		
		
		leitura.close();

	}

}
