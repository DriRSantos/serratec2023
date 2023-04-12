package contas;

import java.util.HashMap;
import java.util.Map;

public class ContaPoupanca extends Conta {
	
	private int idPoupanca;
	private double rendimento;

	public static Map<Integer, ContaPoupanca> mapaContaPoupanca = new HashMap<>();
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(int idConta, int numero, int agencia, String titular, String tipo, int idPoupanca,
			double rendimento) {
		super(idConta, numero, agencia, titular, tipo);
		this.idPoupanca = idPoupanca;
		this.rendimento = rendimento;
	}

	public ContaPoupanca(int idConta, int numero, int agencia, String titular, String tipo, double depositoInicial,
			int idPoupanca, double rendimento) {
		super(idConta, numero, agencia, titular, tipo, depositoInicial);
		this.idPoupanca = idPoupanca;
		this.rendimento = rendimento;
	}



	public int getIdPoupanca() {
		return idPoupanca;
	}

	public void setIdPoupanca(int idPoupanca) {
		this.idPoupanca = idPoupanca;
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