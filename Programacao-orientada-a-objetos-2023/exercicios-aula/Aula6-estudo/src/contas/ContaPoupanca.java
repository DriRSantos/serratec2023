package contas;

public class ContaPoupanca extends Conta {
	
	private double rendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numero, int agencia, String titular, String tipo, double rendimento) {
		super(numero, agencia, titular, tipo);
		this.rendimento = rendimento;
	}

	public ContaPoupanca(int numero, int agencia, String titular, String tipo, double depositoInicial, double rendimento) {
		super(numero, agencia, titular, tipo, depositoInicial);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public void atualizaSaldo() {
		saldo += saldo * rendimento;
	}	

	@Override
	public String toString() {
		return "ContaPoupanca [Agencia =" + getAgencia() 
				+ ", Titular = "	+ getTitular()
				+ ", Numero = " + getNumero() 
				+ ", Saldo = " + getSaldo() 
				+ ", rendimento = " + rendimento + "]";
	}
}