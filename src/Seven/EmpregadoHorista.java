package Seven;

public class EmpregadoHorista extends Empregado {

	private double valorHora;
	
	public EmpregadoHorista(String nome, int matricula, double valorHora) {
		super(nome, matricula);
		this.valorHora = valorHora;
	}

	public double getValorHora() {
		return valorHora;
	}
}
