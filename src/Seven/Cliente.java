package Seven;

public class Cliente extends Pessoa {
	private String endereco;

	public Cliente(String nome, String endereco) {
		super(nome);
		this.endereco= endereco;
	}

	protected String getEndereco() {
		return endereco;
	}
	
	
}
