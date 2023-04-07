package contas;

public class ContaPoupanca extends Conta {

	private double rendimento;
	
	

	public double getRendimento() {
		return rendimento;
	}
	
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public void depositar(double valor) {
		System.out.println("Depositei na conta poupança");
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
