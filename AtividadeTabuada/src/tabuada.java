import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		// O Programa recebe um n�mero e um operador e imprime na tela a tabuada daquele n�mero conforme o operador aritmetico escolhido.
		Scanner vendo = new Scanner(System.in);
		int resultado;
		int contador = 1;
		
		System.out.println("Digite um n�mero de 0 a 10: ");
		int numero = vendo.nextInt();
		System.out.println("Digite algum operador aritmetico( + , - , * ou / ) : ");
		String operador = vendo.next();
		
		if (operador.equals("+")) {
			
			while(contador <= 10) {
				resultado = contador+numero;
				System.out.println("numero " + numero + " + " + contador + " = " + (resultado));
				contador++;
			}
			
			
		} else if (operador.equals("-")) {
			while(contador <= 10) {
				resultado= (numero+contador) - numero;
				System.out.println("N�mero " + (numero+contador) + " - " + "N�mero " + numero + " = " + resultado);
				contador++;
				
			}
		}
		else if (operador.equals("*")) {
			while(contador <= 10) {
				resultado = numero*contador;
				System.out.println("N�mero " + numero + " * " + "N�mero " + contador + " = " + resultado);
				contador++;
	
			}
		}
		else if (operador.equals("/")) {
			while(contador <= 10) {
				resultado = (numero*contador)/numero;
				System.out.println("N�mero " + (numero*contador) + " / " + "N�mero " + numero+ " = " + resultado);
				contador++;
			}
		} else {
			System.out.println("Valor inv�lido");
		}
		vendo.close();

	}

}
