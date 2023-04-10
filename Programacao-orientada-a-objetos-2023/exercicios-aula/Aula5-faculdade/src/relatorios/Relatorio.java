package relatorios;

import pessoas.Funcionario;

public class Relatorio {

	private double totalGastos = 0;
	
	public void imprimir(Funcionario fun) {		
		System.out.print(fun.getInfo() + ", total: " + fun.getGastos());
		totalGastos += fun.getGastos();

		System.out.println("\n[Total de gastos com funcionários] " + totalGastos);
	}
}

