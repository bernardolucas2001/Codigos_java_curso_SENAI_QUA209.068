package principal;

public class PrintfEOperadores {

	public static void main(String[] args) {
		
		String nome = "Bernardo Lucas";
		int idade = 22;
		double altura = 1.83;
		boolean verdade = true;
		boolean mentira = false;
		String diaSemana = "Segunda";
				
		
		//para o tipo char usa %c
		System.out.printf("%s, tem %d, e sua altura �: %.2f\n ", nome, idade, altura);

		
		/*Operadores de compara��o
		 * >  maior que
		 * <  menor que
		 * >= maior ou igual a
		 * <= menor ou igual a
		 * != diferente
		 * =  igual
		 * 
		 */
		
		/* operadores logicos
		 * && significa E
		 * || significa OU
		 * !  significa Nega��o
		 */ 
		
		//se == if
		if(verdade || mentira) {
			System.out.println(10);
		}else {
			System.out.println(20);
		}
		
		char opcao = 's';
		int idade2 = 18;
		
		/*um unico if � uma estrutura simples 
		 * if e else tenho uma estrutura composta
		 * if else � uma estrutura encadeada
		 * podemos ter estruturas dentro de cada if/ if else
		 */
		if(opcao == 's' && idade2 >= 18) {
			System.out.println("Pode entrar na festa");
		}else {
			System.out.println("Volta para Casa, Moleque");
		}
		
		if(diaSemana.equals("Segunda")) {
			System.out.println("Segunda feira");
		} else if(diaSemana.equals("Ter�a")) {
			System.out.println("Ter�a-feira");
		} else if(diaSemana.equals("Sexta")) {
			System.out.println("Sexta-feira");
		}
		else {
			System.out.println("N�o corresponde a um dia da semana!");
		}
		
		int diasSemana = 7;
		
		switch (diasSemana) {
		case 1:
			System.out.println("DOMINGO");
			break;
		case 2:
			System.out.println("SEGUNDA");
			break;
		case 3:
			System.out.println("TER�A");
			break;
		case 4:
			System.out.println("QUARTA");
			break;
		case 5:
			System.out.println("QUINTA");
			break;
		case 6:
			System.out.println("SEXTA");
			break;
		case 7:
			System.out.println("SABADO");
			break;

		default:
			System.out.println("N�o corresponde a um dia da semana");
			break;
		}
	}

}
