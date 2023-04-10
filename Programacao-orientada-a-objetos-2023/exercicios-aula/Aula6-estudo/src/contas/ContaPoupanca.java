package contas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
	
	private double rendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numero, int agencia, String titular, double rendimento) {
		super(numero, agencia, titular);
		this.rendimento = rendimento;
	}

	public ContaPoupanca(int numero, int agencia, String titular, double depositoInicial, double rendimento) {
		super(numero, agencia, titular, depositoInicial);
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

	@Override  // não tem cobrança de taxa
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta Poupança ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Número da conta: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
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