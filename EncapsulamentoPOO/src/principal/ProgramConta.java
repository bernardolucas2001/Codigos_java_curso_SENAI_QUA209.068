package principal;

import entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta(); 
		
		conta.setTitular("Bernardo");
		//System.out.println("Nome do Titular: " + conta.getTitular());
	
	    conta.setAgencia("2561-z");;
		 
		conta.setNumeroConta(6610);
		//conta.setSaldo(200.00); não funciona
		
		conta.depositar(300.00);
		
		conta.obterDadosbancarios();
		
		conta.sacar(500.00);
		
		conta.obterDadosbancarios();

		
	}

}
