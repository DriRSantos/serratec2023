package contas;

public final class ContaPoupancaEspecial extends ContaPoupanca {

	private double cartaoDebito;

	public ContaPoupancaEspecial() {
		super();
	}

	public ContaPoupancaEspecial(int numero, int agencia, String titular, String tipo, double rendimento, double cartaoDebito) {
		super(numero, agencia, titular, tipo, rendimento);
		this.cartaoDebito = cartaoDebito;
	}

	public ContaPoupancaEspecial(int numero, int agencia, String titular, String tipo, double depositoInicial, double rendimento,
			double cartaoDebito) {
		super(numero, agencia, titular, tipo, depositoInicial, rendimento);
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
		return "ContaPoupancaEspecial [Agencia = " + getAgencia() 
		           + ", Titular = " + getTitular() 
		           + ", Numero = " + getNumero()
	    		   + ", Saldo = " + getSaldo() 
	    		   + ", CartaoDebito = " + cartaoDebito 
	    		   + ", Rendimento = " + getRendimento()
	    		   + "]";
	}
}
