package entities;

public class ContaCorrente extends Conta{ //Herança
	
	@Override
	public void sacar(double saque) {
		saldo -= saque +2.00;
	}

}
