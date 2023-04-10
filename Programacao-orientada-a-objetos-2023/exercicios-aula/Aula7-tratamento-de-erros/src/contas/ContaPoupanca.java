package contas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

	private double rendimento;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(int agencia, String titular, double saldo, String tipo, double rendimento) {
		super(agencia, titular, saldo, tipo);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}
	
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta Poupança ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Número da conta: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Rendimento: " + this.getRendimento());
		System.out.println("Data: " + sdf.format(date));
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
