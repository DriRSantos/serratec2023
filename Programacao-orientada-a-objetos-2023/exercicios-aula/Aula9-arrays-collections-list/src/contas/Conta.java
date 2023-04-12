package contas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import extratos.Extrato;
import operacoes.Operacoes;

public abstract class Conta implements Extrato, Operacoes{
	
	private int idConta;
	private int numero;	
	private int agencia;
	private String titular;
	protected double saldo;
	private String tipo; 
	//private static final totalDeContas;
	
	public static Map<Integer, Conta> mapaDeContas = new HashMap<>();

	public Conta() {
		// totalDeContas++	
	}
	
	public Conta(int idConta, int numero, int agencia, String titular, String tipo) {
		// totalDeContas++
		// this.numero = totalDeContas;
		this.idConta = idConta;
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.tipo = tipo;
	}

	public Conta(int idConta, int numero, int agencia, String titular, String tipo, double depositoInicial) {
		// totalDeContas++
		// this.numero = totalDeContas;
		this.idConta = idConta;
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.tipo = tipo;
		depositar(depositoInicial);
	}
	

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
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
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente");
		}
		else {
			this.saldo -= valor;
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
	
	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta " + tipo + " ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Número da conta: " + this.getNumero());
		System.out.println("Saldo: " + String.format("R$ %.2f%n", this.saldo));
		System.out.println("Data: " + sdf.format(date));
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero 
					+ ", agencia=" + agencia 
					+ ", titular=" + titular 
					+ ", saldo=" + saldo + "]";
	}	
}