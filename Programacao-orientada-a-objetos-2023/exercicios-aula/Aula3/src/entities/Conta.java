package entities;

public class Conta {
	
	public int numero;
	public int agencia;
	public String titular;
	private double saldo; // não deixa o método saldo com SET, para só alterar com operações
	public String tipo;
	
	public Conta() { // boa prática criar Construtor default
		System.out.println("Construí minha conta");
	}
	
	public Conta(int agencia, String titular, double saldo, String tipo) {
		this.numero = gerarNumero(); // Construtor para gerar número aleatório da conta
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.tipo = tipo;
	}
	
	public Conta(int numero, int agencia, String titular, double saldo, String tipo) {
		this.numero = numero; // Construtor com 5 parâmetros para escolher número da conta
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.tipo = tipo;
	}

	private int gerarNumero() { // pode criar um método para gerar numero da conta
		return 5;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double saque) {
		if(this.saldo < saque) {
			System.out.println("Saldo insuficiente");
		}
		else {
			this.saldo -= saque;
			System.out.println("O saldo é de: " + this.saldo);
		}
	}
	
	public void transferir(Conta contaDestino, double valor) { // vou enviar o dinheiro para alguém, só precisa do destino
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente");
		}
		else {
			this.saldo -= valor; // tirei o saldo da conta
			contaDestino.saldo += valor; // passei para a destino
			System.out.println("O saldo é de: " + this.saldo);
		}
	}
	
	//public void imprimir() {
		
	//}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", titular=" + titular + ", saldo=" + saldo
				+ ", tipo=" + tipo + "]";
	}
}
