package principal;
import java.util.Scanner;
public class AtividadeCelsiusFahrenheit {

	public static void main(String[] args) {
		//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		Scanner leitura = new Scanner(System.in);
		double Celsius, Fahrenheit;
		System.out.println("Digite a temperatura em Celsius: ");
		Celsius = leitura.nextDouble();
        leitura.close();
        
		 Fahrenheit = (Celsius*(9/5)+32);
		 
		 System.out.println("A conversão para Fahrenheit é igual a " + Fahrenheit + " graus.");


	}

}
