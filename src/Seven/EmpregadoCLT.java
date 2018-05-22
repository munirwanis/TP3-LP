package Seven;

public class EmpregadoCLT extends Empregado {

	private double salario;
	
	public EmpregadoCLT(String nome, int matricula, double salario) {
		super(nome, matricula);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
}
