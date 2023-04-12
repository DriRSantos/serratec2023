package relatorios;

import pessoas.Funcionario;

public class Relatorio {

	private double totalGastos = 0;
	
	public double calculaFolhaPagamento(Funcionario fun) {
		return fun.getSalario() + fun.getBonificacao();
	}
		
	public void imprimirGastos(Funcionario fun) {		
		totalGastos += fun.getSalario() + fun.getBonificacao();
		System.out.print(fun.getNome() + ", bonificacão "+  fun.getBonificacao() 
						+ ", salário: " + fun.getSalario() + ", total: " + calculaFolhaPagamento(fun));

		System.out.println("\n[Total de gastos com funcionários] " + totalGastos);	
	}
}
