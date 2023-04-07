package entities;

public class ContaCorrenteEspecial extends ContaCorrente {

	private double cartaoCredito;
	private double investimento;
	 
	public ContaCorrenteEspecial() {
	
	}
	
	public ContaCorrenteEspecial(int numero, int agencia, String titular, double saldo, String tipo, double tarifa,
			double limite, double cartaoCredito, double investimento) {
		super(numero, agencia, titular, saldo, tipo, tarifa, limite);
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
	public String toString() {
		return "CCorrenteEspecial [Titular = " + getTitular()
				+ ", Agencia = " + getAgencia()		
				+ ", Numero = " + getNumero()
				+ ", cartaoCredito = " + cartaoCredito 
				+ ", investimento = " + investimento + "\n"
				+ ", Tarifa = " + getTarifa()
				+ ", Saldo = " + getSaldo()
				+ ", Limite = " + getLimite() 
				+ ", Tipo = " + getTipo() + "]";
	}	
}
