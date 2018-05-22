package Seven;

public class Empregado extends Pessoa {
	private int matricula;

	public Empregado(String nome, int matricula) {
		super(nome);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	
}
