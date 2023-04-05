package contas;

public class ContaCorrenteEspecial extends ContaCorrente {

	private double cartaoCredito;
	private double investimento;

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
				+ ", investimento = " + investimento
				+ ", Tarifa = " + getTarifa()
				+ ", Saldo = " + getSaldo() + "\n"
				+ ", Limite = " + getLimite() 
				+ ", Tipo = " + getTipo() + "]";
	}	
}
