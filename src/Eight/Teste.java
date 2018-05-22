package Eight;

import java.util.ArrayList;
import java.util.List;

public class Teste {
		
	public static void main(String[] args) {		
		List<Forma> formas = new ArrayList<Forma>();
		formas.add(new Circulo("Azul", 4.5));
		formas.add(new Quadrado("Verde", 8.2));
		formas.add(new Triangulo("Vermelho", 4.8, 5.3));
		
		for (Forma forma : formas) {
			testaForma(forma);
		}
	}
	
	private static void testaForma(Forma forma) {
		forma.calcularArea();
	}
}
