package pessoas;

import contas.Conta;

public class Cliente extends Conta {

	private int senha;
	
	public Cliente () {
		
	}

	public Cliente(int numero, int agencia, String titular, String tipo, int senha) {
		super(numero, agencia, titular, tipo);
		this.senha = senha;
	}

	public Cliente(int numero, int agencia, String titular, String tipo, double depositoInicial, int senha) {
		super(numero, agencia, titular, tipo, depositoInicial);
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}

	public boolean validarUsuario(String titular, int senha) {
		if(this.getTitular() == titular && this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		}
		else {
			System.out.println("Acesso negado!");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Cliente [Titular = " + getTitular() 
						+ " Agencia = " + getAgencia() 
						+ ", Numero = "	+ getNumero() 
						+ ", Saldo = " + getSaldo()
						+ ", Tipo de conta = "	+ getTipo()
						+ "]";
	}	
}
