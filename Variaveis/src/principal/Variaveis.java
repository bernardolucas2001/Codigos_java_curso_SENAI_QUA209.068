package principal;

public class Variaveis {

	public static void main(String[] args) {
		
		int numero = 10;
		//numero = 10; 
		double decimal = 10.50;
		//aspas duplas para strings
		String nome = "Bernardo";
		char sexo = 'M'; // quando so � um carctere, aspas simples
		//booleanos = valores verdadeiros ou falsos
		boolean verdadeiro = true;
		boolean falso = false;
		
		double peso = 82.00;
		int idade = 22;

		
		
		int testeNumero = (int) 50.25;
		double testeNovoNumero = 10;
		System.out.println(numero);
		System.out.println(decimal);
		System.out.println(testeNumero);
		System.out.println(testeNovoNumero);
		System.out.println(nome);
		System.out.println(sexo);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.print("Nome: ");
		System.out.println("Bernardo B");
		
		//para organizar o codigo usamos o
		// ctrl + shift + f 
		System.out.println("***************");
		System.out.print("Meu Nome �: " + nome);
		System.out.print(" e Minha idade � " + idade + " anos e possuo " + peso + "KG");
		System.out.print(" e meu sexo � " + sexo);
		
		
	}

}
