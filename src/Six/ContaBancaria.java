package Six;

public class ContaBancaria {
	private int agencia;
	private int conta;
	private int saldo;
	private Pessoa titular;
	public ContaBancaria(int agencia, int conta, int saldo, Pessoa titular) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public void depositar(int valor) {
		saldo += valor;
	}
	
	public void sacar(int valor) {
		saldo -= valor;
	}
	
	public void verSaldo() {
		System.out.println(this.saldo);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	int getSaldo() {
		return saldo;
	}
	
	public Pessoa getTitular() {
		return titular;
	}
	
	
}
