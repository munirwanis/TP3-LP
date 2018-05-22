package Eight;

public class Circulo extends Forma {
	private double raio;

	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	protected void calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		System.out.printf("Área do Círculo: %.2f\n", area);
	}
}
