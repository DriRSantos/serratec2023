package contas;

public class ContaPoupancaEspecial extends ContaPoupanca{

	private double cartaoDebito;

	public double getCartaoDebito() {
		return cartaoDebito;
	}

	public void setCartaoDebito(double cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}
	
	public void depositar(double valor) {
		System.out.println("Depositei na conta poupança especial");
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
