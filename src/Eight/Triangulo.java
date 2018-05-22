package Eight;

public class Triangulo extends Forma {
	private double base;
	private double altura;
	
	public Triangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	@Override
	protected void calcularArea() {
		double area = (base * altura) / 2.0;
		System.out.printf("Área do Triângulo: %.2f", area);
	}
}
