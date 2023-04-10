package contas;

import operacoes.Extrato;
import operacoes.Operacoes;

public abstract class Conta implements Operacoes, Extrato {

    private int numero;
    private int agencia;
    private String titular;
    private double saldo;
    private String tipo;
    
    private static int totalDeContas;
    
    public Conta() {
    	totalDeContas++;
    	this.numero = totalDeContas;
    }
    
    public Conta(int agencia, String titular, double saldo, String tipo) {
    	totalDeContas++;
        this.numero = totalDeContas;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    
    public Conta(int numero, int agencia, String titular, double saldo, String tipo) {
    	totalDeContas++;
        this.numero = totalDeContas;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    
    public static int getTotalDeContas() {
		return totalDeContas;
	}
    
    public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
        return this.saldo;
    }
    
    public void sacar(double valor) {
        if(this.saldo < valor) {
            System.out.println("Seu saldo é insuficiente!");
        }
        else {
            this.saldo -= valor;
            System.out.println("Seu saldo é de: " + this.saldo);
        }
    }
    
    public void transferir(Conta contaDestino, double valor) {
        if(this.saldo < valor) {
            System.out.println("Seu saldo é insuficiente!");
        }
        else {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Seu saldo é de: " + this.saldo);
        }   
    }
    
    public final void depositar(double valor) {
        this.saldo += valor;
    }
    
    public abstract void imprimeExtrato();
    
    @Override
    public String toString() {
        return "Conta [numero=" + numero 
        		+ ", agencia=" + agencia 
        		+ ", titular=" + titular 
        		+ ", saldo=" + saldo
                + ", tipo=" + tipo + "]";
    }    
}