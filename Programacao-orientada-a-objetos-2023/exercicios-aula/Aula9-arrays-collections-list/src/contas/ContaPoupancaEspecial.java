package contas;

import java.util.HashMap;
import java.util.Map;

public final class ContaPoupancaEspecial extends ContaPoupanca {

	private int idPoupEspecial;
	private double cartaoDebito;
	
	public static Map<Integer, ContaPoupancaEspecial> mapaCPoupEspecial = new HashMap<>();

	public ContaPoupancaEspecial() {
		super();
	}

	public ContaPoupancaEspecial(int idConta, int numero, int agencia, String titular, String tipo, int idPoupanca,
			double rendimento, int idPoupEspecial, double cartaoDebito) {
		super(idConta, numero, agencia, titular, tipo, idPoupanca, rendimento);
		this.idPoupEspecial = idPoupEspecial;
		this.cartaoDebito = cartaoDebito;
	}
	
	public ContaPoupancaEspecial(int idConta, int numero, int agencia, String titular, String tipo,
			double depositoInicial, int idPoupanca, double rendimento, int idPoupEspecial, double cartaoDebito) {
		super(idConta, numero, agencia, titular, tipo, depositoInicial, idPoupanca, rendimento);
		this.idPoupEspecial = idPoupEspecial;
		this.cartaoDebito = cartaoDebito;
	}

	public int getIdPoupEspecial() {
		return idPoupEspecial;
	}

	public void setIdPoupEspecial(int idPoupEspecial) {
		this.idPoupEspecial = idPoupEspecial;
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
