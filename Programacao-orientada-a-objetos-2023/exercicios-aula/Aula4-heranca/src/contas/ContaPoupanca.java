package contas;

public class ContaPoupanca extends Conta {

	private double rendimento;

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
