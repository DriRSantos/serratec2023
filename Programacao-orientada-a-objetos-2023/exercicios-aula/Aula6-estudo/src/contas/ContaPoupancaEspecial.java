package contas;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ContaPoupancaEspecial extends ContaPoupanca {

	private double cartaoDebito;

	public ContaPoupancaEspecial() {
		super();
	}

	public ContaPoupancaEspecial(int numero, int agencia, String titular, double rendimento, double cartaoDebito) {
		super(numero, agencia, titular, rendimento);
		this.cartaoDebito = cartaoDebito;
	}

	public ContaPoupancaEspecial(int numero, int agencia, String titular, double depositoInicial, double rendimento,
			double cartaoDebito) {
		super(numero, agencia, titular, depositoInicial, rendimento);
		this.cartaoDebito = cartaoDebito;
	}

	public double getCartaoDebito() {
		return cartaoDebito;
	}

	public void setCartaoDebito(double cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}
	
	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta Poupança Especial ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Número da conta: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Cartão de Débito: " + cartaoDebito);
		System.out.println("Data: " + sdf.format(date));
	}

	@Override
	public String toString() {
		return "ContaPoupancaEspecial [Agencia = " + getAgencia() 
		           + ", Titular = " + getTitular() 
		           + ", Numero = " + getNumero()
	    		   + ", Saldo = " + getSaldo() 
	    		   + ", CartaoDebito = " + cartaoDebito 
	    		   + ", Rendimento = " + getRendimento()
	    		   + "]";
	}
}
