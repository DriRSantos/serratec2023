package entities;

public class ContaPoupanca extends Conta {

	private double rendimento;
	
	public ContaPoupanca() {
		
	}	

	public ContaPoupanca(int numero, int agencia, String titular, double saldo, String tipo, double rendimento) {
		super(numero, agencia, titular, saldo, tipo);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}
	
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [titular = " + getTitular() 
				+ ", agencia =" + getAgencia()		
				+ ", numero = " + getNumero()
				+ ", rendimento = " + rendimento 
				+ ", saldo = "+ getSaldo() 
				+ ", tipo = " + getTipo() + "]";
	}
}