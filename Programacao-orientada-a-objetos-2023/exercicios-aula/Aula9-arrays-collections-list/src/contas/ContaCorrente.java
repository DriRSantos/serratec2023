package contas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ContaCorrente extends Conta {

	private int idCCorrente;
	private double tarifa;
	private double limite;
	
	public static Map<Integer, ContaCorrente> mapaContaCorrente = new HashMap<>();
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(int idConta, int numero, int agencia, String titular, String tipo, int idCCorrente, double tarifa, double limite) {
		super(idConta, numero, agencia, titular, tipo);
		this.idCCorrente = idCCorrente;
		this.tarifa = tarifa;
		this.limite = limite;
	}

	public ContaCorrente(int idConta, int numero, int agencia, String titular, String tipo, double depositoInicial, int idCCorrente, double tarifa,
			double limite) {
		super(idConta, numero, agencia, titular, tipo, depositoInicial);
		this.idCCorrente = idCCorrente;
		this.tarifa = tarifa;
		this.limite = limite;
	}

	public int getIdCCorrente() {
		return idCCorrente;
	}

	public void setIdCCorrente(int idCCorrente) {
		this.idCCorrente = idCCorrente;
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
	public void sacar(double valor) {
		saldo = saldo + limite; // ADICIONAR O LIMITE DISPONIVEL
		if(saldo >=  valor + tarifa) {  
			saldo -= valor - tarifa;	
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	@Override
	public void transferir (Conta contaDestino, double valor) {
		saldo = saldo + limite; 
		if(saldo < valor) {
	        System.out.println("Seu saldo é insuficiente!");
	     }
	     else {
	         saldo -= valor;
	         contaDestino.saldo += valor;
	         System.out.println("Seu saldo após transferência é de: " + saldo);
	     }
	}
	
	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta Corrente ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Número da conta: " + this.getNumero());
		System.out.println("Saldo: " + String.format("R$ %.2f%n", this.getSaldo()));
		System.out.println("Limite: " + this.limite);
		System.out.println("Data: " + sdf.format(date));
	}	
	
	@Override
	public String toString() {
		return "ContaCorrente [id =" + idCCorrente
				+ ", Agencia = " + getAgencia()
				+ ", Numero =" + getNumero()
				+ ", Titular =" + getTitular()  
				+ ", Saldo =" + getSaldo()
				+ ", Tarifa = " + tarifa 
				+ ", Limite = " + limite 
				+ "]";
	}
}
