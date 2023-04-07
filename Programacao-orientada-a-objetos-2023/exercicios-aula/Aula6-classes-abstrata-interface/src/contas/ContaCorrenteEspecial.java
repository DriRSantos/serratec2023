package contas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrenteEspecial extends ContaCorrente {

	private double cartaoCredito;
	private double investimento;

	public ContaCorrenteEspecial() {
		super();
	}
		
	public ContaCorrenteEspecial(int agencia, String titular, double saldo, String tipo, double tarifa, double limite,
			double cartaoCredito, double investimento) {
		super(agencia, titular, saldo, tipo, tarifa, limite);
		this.cartaoCredito = cartaoCredito;
		this.investimento = investimento;
	}

	public double getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(double cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public double getInvestimento() {
		return investimento;
	}

	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}
	
	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta Corrente Especial ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Número da conta: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Cartão crédito: " + this.cartaoCredito);
		System.out.println("Invstimento: " + this.investimento);
		System.out.println("Data: " + sdf.format(date));
	}

	@Override
	public String toString() {
		return "CCorrenteEspecial [Titular = " + getTitular()
				+ ", Agencia = " + getAgencia()		
				+ ", Numero = " + getNumero()
				+ ", cartaoCredito = " + cartaoCredito 
				+ ", investimento = " + investimento
				+ ", Tarifa = " + getTarifa()
				+ ", Saldo = " + getSaldo() + "\n"
				+ ", Limite = " + getLimite() 
				+ ", Tipo = " + getTipo() + "]";
	}	
}
