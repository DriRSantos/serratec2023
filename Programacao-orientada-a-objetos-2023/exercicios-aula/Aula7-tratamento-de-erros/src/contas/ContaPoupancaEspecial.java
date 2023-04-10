package contas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupancaEspecial extends ContaPoupanca {

	private double cartaoDebito;
	
	public ContaPoupancaEspecial() {
		super();
	}
	
	public ContaPoupancaEspecial(int agencia, String titular, double saldo, String tipo, double rendimento,
			double cartaoDebito) {
		super(agencia, titular, saldo, tipo, rendimento);
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
		System.out.println("Rendimento: " + this.getRendimento());
		System.out.println("Cartão débito: " + this.cartaoDebito);
		System.out.println("Data: " + sdf.format(date));
	}
	
	@Override
	public String toString() {
		return "CPoupancaEspecial [Titular = " + getTitular()
				+ ", Agencia = " + getAgencia()
				+ ", Numero = " + getNumero()
				+ ", Saldo = " + getSaldo()
				+ ", cartaoDebito = " + cartaoDebito 
				+ ", Rendimento = " + getRendimento()  
				+ ", Tipo = " + getTipo() + "]";
	}
}
