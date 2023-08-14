package principal;

public class AtividadeMatriz1 {

	public static void main(String[] args) {
		// fazer uma matriz 3x3 ou 4x4, imprimir os números da diagonal dessa matriz;
		
		int[][] numero = new int [3][3];
		int contador = 10;
		
		
	for( int i = 0; i<numero.length; i++) {
		for( int j =0;  j<numero.length; j++) {
			numero[i][j] = contador;
			contador++;
			if(i == j) {
				System.out.print(contador);
			} else {
				System.out.printf("\t");
			} 
			
		
			contador++;
		
			
		
				
		
	} 
		System.out.println();

	}
   } 
}
