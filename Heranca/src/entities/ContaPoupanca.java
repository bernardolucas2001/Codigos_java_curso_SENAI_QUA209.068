package entities;

public class ContaPoupanca extends Conta { //Heran�a
	
	
	public void sacar(double saque) {
		saldo -= saque+2.75;
	}

}
