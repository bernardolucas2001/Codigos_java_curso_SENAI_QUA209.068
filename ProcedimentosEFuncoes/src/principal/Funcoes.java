package principal;

public class Funcoes {

	public static void main(String[] args) {
		/*
		 * Fun��es representam um processamento
		 * ou processo;
		 * o que indentifica uma fun��o s�o os parenteses
		 * System.out.println() � um exemplo de fun��o/procedimento
		 */ 
		mostrarMensagem();
		mostrarMensagemComParametro(22);
		System.out.println(calcular());
		int receberCalcular = calcular();
		System.out.println("Recebeu: " + receberCalcular);
		
		System.out.println("Resultado da soma: "+ somar(10,20));
		
		int x =10;
		int y = 100;
		
		System.out.println("Uma nova soma: " + somar(x, y));
		
		int a =50;
		int b = 50;
		
		System.out.println("Uma nova soma: " + somar(b, a));
		
		

	}
	
	static void mostrarMensagem() {
		System.out.println("Minha Primeira Fun��o");
	}
	static void mostrarMensagemComParametro(int idade) {
		System.out.println("Minha idade �: " + idade);
	} 
	static int calcular() {
		int x = 10;
		int y = 5;
		return x + y;
	}
	static int somar(int x, int y) {
		return x+y;	
	}
	
	

}
