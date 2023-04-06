package entities;

public class ContaPoupancaEspecial extends ContaPoupanca{

	private double cartaoDebito;

	public ContaPoupancaEspecial() {
	
	}
	
	public ContaPoupancaEspecial(int numero, int agencia, String titular, double saldo, String tipo, double rendimento,
			double cartaoDebito) {
		super(numero, agencia, titular, saldo, tipo, rendimento);
		this.cartaoDebito = cartaoDebito;
	}

	public double getCartaoDebito() {
		return cartaoDebito;
	}

	public void setCartaoDebito(double cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
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
