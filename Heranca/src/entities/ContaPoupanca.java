package entities;

public class ContaPoupanca extends Conta { //Herança
	
	
	public void sacar(double saque) {
		saldo -= saque+2.75;
	}

}
