package contas;

import extratos.Extrato;
import operacoes.Operacoes;

public abstract class Conta implements Extrato, Operacoes{
	
	private int numero;
	private int agencia;
	private String titular;
	protected double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numero, int agencia, String titular) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
	}

	public Conta(int numero, int agencia, String titular, double depositoInicial) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		depositar(depositoInicial);
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente");
		}
		else {
			this.saldo -= valor + 2.0;
		}
	}
	
	public void transferir (Conta contaDestino, double valor) {
		 if(this.saldo < valor) {
	        System.out.println("Seu saldo é insuficiente!");
	     }
	     else {
	         this.saldo -= valor;
	         contaDestino.saldo += valor;
	         System.out.println("Seu saldo após transferência é de: " + this.saldo);
	     }   
	}
	
	public abstract void imprimeExtrato();

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia 
				+ ", titular=" + titular + ", saldo=" + saldo + "]";
	}	
}