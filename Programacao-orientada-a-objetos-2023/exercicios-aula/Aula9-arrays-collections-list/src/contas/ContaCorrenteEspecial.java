package contas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class ContaCorrenteEspecial extends ContaCorrente {

	private int idCCorrenteEsp;
	private double cartaoCredito;
	private double investimento;
	
	public static Map<Integer, ContaCorrente> mapaCCorrenteEspecial = new HashMap<>();
	
	public ContaCorrenteEspecial() {
		super();
	}	

	public ContaCorrenteEspecial(int idConta, int numero, int agencia, String titular, String tipo, int idCCorrente,
			double tarifa, double limite, int idCCorrenteEsp, double cartaoCredito, double investimento) {
		super(idConta, numero, agencia, titular, tipo, idCCorrente, tarifa, limite);
		this.idCCorrenteEsp = idCCorrenteEsp;
		this.cartaoCredito = cartaoCredito;
		this.investimento = investimento;
	}

	public ContaCorrenteEspecial(int idConta, int numero, int agencia, String titular, String tipo,
			double depositoInicial, int idCCorrente, double tarifa, double limite, int idCCorrenteEsp,
			double cartaoCredito, double investimento) {
		super(idConta, numero, agencia, titular, tipo, depositoInicial, idCCorrente, tarifa, limite);
		this.idCCorrenteEsp = idCCorrenteEsp;
		this.cartaoCredito = cartaoCredito;
		this.investimento = investimento;
	}

	public int getIdCCorrenteEsp() {
		return idCCorrenteEsp;
	}

	public void setIdCCorrenteEsp(int idCCorrenteEsp) {
		this.idCCorrenteEsp = idCCorrenteEsp;
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
		System.out.println("Saldo: " + String.format("R$ %.2f%n", this.getSaldo()));
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
