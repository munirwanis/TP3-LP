package Six;

public class ContaSalario extends ContaBancaria {

	private int taxa;
	
	public ContaSalario(int agencia, int conta, int saldo, Pessoa titular, int taxa) {
		super(agencia, conta, saldo, titular);
		this.taxa = taxa;
	}

	public void calcularTarifa() {
		System.out.println(this.getSaldo() - taxa);
	}
}
