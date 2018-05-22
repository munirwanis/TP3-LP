package Eight;

public abstract class Forma {
	protected String cor;	
	
	protected Forma(String cor) {
		super();
		this.cor = cor;
	}

	protected void calcularArea() {
		System.out.println("Calcula Área não implementado.");
	}
}
