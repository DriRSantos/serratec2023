package relatorios;

import pessoas.Funcionario;

public class Relatorio {

	private double totalGastos = 0;
	
	public void imprimir(Funcionario fun) {		
		System.out.print(fun.getInfo() + ", gastos de: R$" + fun.getGastos());
		totalGastos += fun.getGastos();

		System.out.println("\n[Total de gastos] " + totalGastos);
	}
}

//public void imprimir(Funcionario...Funcionarios) {
//for(Funcionario fun : Funcionarios) {
//	System.out.print(fun.getNome() + ", gastos de: R$" + fun.getGastos());
//	totalGastos += fun.getGastos();
//}
//System.out.println(" [Total de gastos] " + totalGastos);
//}