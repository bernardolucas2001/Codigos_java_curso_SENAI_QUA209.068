package entities;

public class ContaCorrente extends Conta{ //Heran�a
	
	@Override
	public void sacar(double saque) {
		saldo -= saque +2.00;
	}

}
