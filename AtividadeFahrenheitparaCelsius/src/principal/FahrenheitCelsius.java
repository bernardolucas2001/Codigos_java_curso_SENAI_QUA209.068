package principal;
import java.util.Scanner;
public class FahrenheitCelsius {

	public static void main(String[] args) {
		// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		Scanner leitura = new Scanner(System.in);
		double Celsius, Fahrenheit;
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		Fahrenheit = leitura.nextDouble();
		leitura.close();
		
		Celsius = 5*((Fahrenheit - 32)/9);
		
		System.out.println("A conversão para Celsius é : " + Celsius + " Graus Celsius");
		
		
		
		
		
		
		

	}

}
