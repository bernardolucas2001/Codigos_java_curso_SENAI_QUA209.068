package principal;
import java.util.Scanner;
public class AtividadeCelsiusFahrenheit {

	public static void main(String[] args) {
		//Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		Scanner leitura = new Scanner(System.in);
		double Celsius, Fahrenheit;
		System.out.println("Digite a temperatura em Celsius: ");
		Celsius = leitura.nextDouble();
        leitura.close();
        
		 Fahrenheit = (Celsius*(9/5)+32);
		 
		 System.out.println("A convers�o para Fahrenheit � igual a " + Fahrenheit + " graus.");


	}

}
