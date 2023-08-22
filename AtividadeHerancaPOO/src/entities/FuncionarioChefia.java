package entities;

public class FuncionarioChefia extends Funcionario {
	
	@Override
	public double salarioLiquido() {
		return salarioBruto + (salarioBruto*0.05);
	}

}
