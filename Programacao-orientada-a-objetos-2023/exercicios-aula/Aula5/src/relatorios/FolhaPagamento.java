package relatorios;

import pessoas.Funcionario;

public class FolhaPagamento {
	
   /* SEM POLIMORFISMO
	public double calculaFolhaPagamento(Gerente gerente) {
		return gerente.getSalario() + gerente.getBonificacao(); 
	}
	
	public double calculaFolhaPagamento(Assistente assistente) {
		return assistente.getSalario() + assistente.getBonificacao(); 
	}
	
	public double calculaFolhaPagamento(Diretor diretor) {
		return diretor.getSalario() + diretor.getBonificacao(); 
	}
	
	public double calculaFolhaPagamento(OperadorDeCaixa operador) {
		return operador.getSalario() + operador.getBonificacao(); 
	} */
	
	// COM POLIMORFISMO
	public double calculaFolhaPagamento(Funcionario funcionario) {
		return funcionario.getSalario() + funcionario.getBonificacao();  
	}   	
}
