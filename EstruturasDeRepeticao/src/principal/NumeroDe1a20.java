package principal;

public class NumeroDe1a20 {
// o programa imprime os numeros de 1 a 20.
	//No primeiro bloco de repetição, imprime um numero encima do outro. 
	//No segundo bloco, imprime os numeros lado a lado.
	public static void main(String[] args) {
		int numero1 = 1;
		int numero2= 1;
		
		for(int contador = 1; contador <=20; contador++ ) {
		System.out.println(numero1);
			numero1++;
		
		
			
		}
		 
		
		for(int contador = 1; contador <=20; contador++ ) {
			System.out.print(" - " + numero2);
				numero2++;
				
			
				
			}
		

	}

}
