package Six;

public class ContaPoupanca extends ContaBancaria {

	private int taxa;
	
	public ContaPoupanca(int agencia, int conta, int saldo, Pessoa titular, int taxa) {
		super(agencia, conta, saldo, titular);
		this.taxa = taxa;
	}

	public void calcularRendimento() {
		System.out.println(this.getSaldo() - taxa);
	}
}
