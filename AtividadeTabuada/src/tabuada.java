import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vendo = new Scanner(System.in);
		int resultado;
		int contador = 1;
		
		System.out.println("Digite um número de 0 a 10: ");
		int numero = vendo.nextInt();
		System.out.println("Digite algum operador aritmetico( + , - , * ou / ) : ");
		String operador = vendo.next();
		
		if (operador.equals("+")) {
			
			while(contador <= 10) {
				resultado = numero;
				System.out.println(resultado);
				numero++;
				contador++;
			}
			
			
		} else if (operador.equals("-")) {
			while(contador <= 10) {
				resultado = numero;
				System.out.println(resultado);
				numero--;
				contador++;
				
			}
		}
		else if (operador.equals("*")) {
			while(contador <= 10) {
				resultado = numero*contador;
				System.out.println(resultado);
				contador++;
			}
		}
		else if (operador.equals("/")) {
			while(contador <= 10) {
				resultado = numero/contador;
				System.out.println(resultado);
				contador++;
			}
		} else {
			System.out.println("Valor inválido");
		}
		vendo.close();

	}

}
