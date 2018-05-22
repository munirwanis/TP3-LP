package Eight;

public class Quadrado extends Forma {
	private double lado;

	public Quadrado(String cor, double lado) {
		super(cor);
		this.lado = lado;
	}

	@Override
	protected void calcularArea() {
		System.out.printf("Área do Quadrado: %.2f\n", Math.pow(lado, 2));
	}
}
