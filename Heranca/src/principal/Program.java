package principal;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		//ContaCorrente cc = new ContaCorrente 
		Conta cc = new ContaCorrente();//Polimorfismo
		//ContaPoupanca contaP = new ContaPoupanca();
		Conta contaP = new ContaPoupanca();
		
		System.out.println("Conta normal: ");
		conta.setTitular("Bernardo");
		conta.setAgencia(123456);
		conta.setNumeroConta(5522);
		conta.depositar(150.25);
		conta.sacar(50.00);
		
		conta.obterDadosBancarios();
		System.out.println();
		
		System.out.println("Conta Corrente: ");
		
		cc.setTitular("Bernardo");
		cc.setAgencia(123456);
		cc.setNumeroConta(5522);
		cc.depositar(550.95);
		cc.sacar(250.00);
		
		cc.obterDadosBancarios();
		System.out.println();
		
		System.out.println("Conta Poupança: ");
		
		contaP.setTitular("Bernardo");
		contaP.setAgencia(123456);
		contaP.setNumeroConta(5522);
		contaP.depositar(1000.00);		
		contaP.sacar(500.00);
		
		contaP.obterDadosBancarios();
		System.out.println();

	}

}
