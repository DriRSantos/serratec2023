package entities;

public class ContaCorrente extends Conta {

	private double tarifa;
	private double limite;
	
	public ContaCorrente() {
	
	}
	
	public ContaCorrente(int numero, int agencia, String titular, double saldo, String tipo, double tarifa,
			double limite) {
		super(numero, agencia, titular, saldo, tipo);
		this.tarifa = tarifa;
		this.limite = limite;
	}
	
	public ContaCorrente(double tarifa, double limite) {
		super();
		this.tarifa = tarifa;
		this.limite = limite;
	}

	public double getTarifa() {
		return tarifa;
	}
	
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}	

	@Override
	public String toString() {
		return "CCORRENTE [titular = " + getTitular() 
				+ ", agencia = " + getAgencia()
				+ ", numero = " + getNumero()
				+ ", tarifa = " + tarifa 
				+ ", limite = " + limite
				+ ", saldo = " + getSaldo() 
				+ ", tipo =" + getTipo() + "]";
	}
}

