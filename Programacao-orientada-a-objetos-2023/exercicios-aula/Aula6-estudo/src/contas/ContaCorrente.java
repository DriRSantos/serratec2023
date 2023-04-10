package contas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta {

	private double tarifa;
	private double limite;
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(int numero, int agencia, String titular, double tarifa, double limite) {
		super(numero, agencia, titular);
		this.tarifa = tarifa;
		this.limite = limite;
	}

	public ContaCorrente(int numero, int agencia, String titular, double depositoInicial, double tarifa,
			double limite) {
		super(numero, agencia, titular, depositoInicial);
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
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta Corrente ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Número da conta: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
	}	
	
	@Override
	public String toString() {
		return "ContaCorrente [Agencia = " + getAgencia()
				+ ", Titular =" + getTitular() 
				+ ", Numero =" + getNumero() 
				+ ", Saldo =" + getSaldo()
				+ ", Tarifa = " + tarifa 
				+ ", Limite = " + limite 
				+ "]";
	}
}
