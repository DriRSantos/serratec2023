package pessoas;

import java.util.HashMap;
import java.util.Map;

import contas.Conta;

public class Cliente extends Conta {

	private String cpf;
	private int senha;
	
	public static Map<String, Cliente> mapaClientes = new HashMap<>();
	
	public Cliente () {
		
	}	

	public Cliente(int idConta, int numero, int agencia, String titular, String tipo, String cpf, int senha) {
		super(idConta, numero, agencia, titular, tipo);
		this.cpf = cpf;
		this.senha = senha;
	}	

	public Cliente(int idConta, int numero, int agencia, String titular, String tipo, double depositoInicial,
			String cpf, int senha) {
		super(idConta, numero, agencia, titular, tipo, depositoInicial);
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
