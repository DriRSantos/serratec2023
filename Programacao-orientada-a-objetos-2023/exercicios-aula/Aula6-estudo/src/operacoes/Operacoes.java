package operacoes;

import contas.Conta;

public interface Operacoes {

	
	  public void sacar(double valor);
	    
	   public void transferir(Conta contaDestino, double valor); 
	   
	   public void depositar(double valor);
}
