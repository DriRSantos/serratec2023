package contas;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ContaCorrenteEspecial extends ContaCorrente {

	private double cartaoCredito;
	private double investimento;
	
	public ContaCorrenteEspecial() {
		super();
	}

	public ContaCorrenteEspecial(int numero, int agencia, String titular, double tarifa, double limite,
			double cartaoCredito, double investimento) {
		super(numero, agencia, titular, tarifa, limite);
		this.cartaoCredito = cartaoCredito;
		this.investimento = investimento;
	}

	public ContaCorrenteEspecial(int numero, int agencia, String titular, double depositoInicial, double tarifa,
			double limite, double cartaoCredito, double investimento) {
		super(numero, agencia, titular, depositoInicial, tarifa, limite);
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
		System.out.println("Cartão de Crédito: " + cartaoCredito);
		System.out.println("Investimento: " + investimento);
		System.out.println("Data: " + sdf.format(date));
	}
	
	@Override
	public String toString() {
		return "ContaCorrenteEspecial [Agencia = " + getAgencia()
				+ ", Titular = " + getTitular() 
				+ ", Numero = " + getNumero() 
				+ ", Saldo = " + getSaldo()
				+ ", CartaodeCredito = " + cartaoCredito 
				+ ", Investimento = " + investimento
				+ ", Tarifa = " + getTarifa()
				+ ", Limite = " + getLimite()
				+ "]";
	}
}
