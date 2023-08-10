package principal;

public class ArrayDe100 {

	public static void main(String[] args) {
		// O Programa mostra o indice de um array de 100 posições.
		
		int[] array = new int[100];
		
		for(int contador = 0; contador < array.length; contador++) {
			System.out.println("Dentro do for: " + array[contador]);
			System.out.println(contador);
		}

	}

}
