package contas;

public class ContaCorrente extends Conta {

	private double tarifa;
	private double limite;
	
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
		return "CCorrente [titular = " + getTitular() 
				+ ", agencia = " + getAgencia()
				+ ", numero = " + getNumero()
				+ ", tarifa = " + tarifa 
				+ ", limite = " + limite
				+ ", saldo = " + getSaldo() 
				+ ", tipo =" + getTipo() + "]";
	}
}
