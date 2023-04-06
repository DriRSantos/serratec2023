package principal;

import pessoas.Assistente;
import pessoas.Diretor;
import pessoas.Funcionario;
import pessoas.Gerente;
import pessoas.OperadorDeCaixa;
import relatorios.FolhaPagamento;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println();
		Funcionario fun = new Funcionario();
		fun.setSalario(5000.0);
		System.out.println("Bonificação: " + fun.getBonificacao());
		
		System.out.println();
		OperadorDeCaixa operador = new OperadorDeCaixa();
		operador.setSalario(5000.0);
		System.out.println("Bonificação: " + operador.getBonificacao());
		
		System.out.println();
		Assistente assistente = new Assistente();
		assistente.setSalario(5000.0);
		System.out.println("Bonificação: " + assistente.getBonificacao());
		
		System.out.println();
		Gerente gerente = new Gerente();
		gerente.setSalario(5000.0);
		System.out.println("Bonificação: " + gerente.getBonificacao());
		
		System.out.println();
		Diretor diretor = new Diretor();
		diretor.setSalario(5000.0);
		System.out.println("Bonificação: " + diretor.getBonificacao());
		
		System.out.println();
		System.out.println("============================================");
		System.out.println("POLIMORFISMO Funcionario com Bonificação do Gerente");
		Funcionario funcionario2 = gerente;
		System.out.println("Bonificação: " + funcionario2.getBonificacao());
		
		System.out.println();
		Funcionario funcionario1 = new Gerente();
		funcionario1.setSalario(5000.0);
		System.out.println("Usando autentica do gerente com casting");
		((Gerente) funcionario1).autentica(0);
		System.out.println();
		System.out.println("Bonificação: " + funcionario1.getBonificacao());
		
		
	/*  SEM POLIMORFISMO
		System.out.println();
		System.out.println("============================================");
		FolhaPagamento fp = new FolhaPagamento();
		
		Gerente gerente1 = new Gerente();
		gerente1.setSalario(5000.0);
		System.out.println("Pagamento: " + fp.calculaFolhaPagamento(gerente1));
		
		System.out.println();
		Assistente assist = new Assistente();
		assist.setSalario(4000.0);
		System.out.println("Pagamento: " + fp.calculaFolhaPagamento(assist));
		
		OperadorDeCaixa operador2 = new OperadorDeCaixa();
		operador2.setSalario(4000.0);
		System.out.println("Pagamento: " + fp.calculaFolhaPagamento(operador2));
		
		Diretor diretor2 = new Diretor();
	    diretor2.setSalario(4000.0);
		System.out.println("Pagamento: " + fp.calculaFolhaPagamento(diretor2));
	*/
		
		// COM POLIMORFISMO
		System.out.println();
		System.out.println("============================");
		System.out.println("Mostrando caminho percorrido\n");
		
		FolhaPagamento fp = new FolhaPagamento();
		
		Funcionario func3 = new OperadorDeCaixa();
		func3.setSalario(4000.0);
		System.out.println("Valor da bonificação: " + func3.getBonificacao());
		System.out.println("Pagamento final: " + fp.calculaFolhaPagamento(func3));

		System.out.println();
		Funcionario func2 = new Assistente();
		func2.setSalario(4000.0);
		System.out.println("Valor da bonificação: " + func2.getBonificacao());
		System.out.println("Pagamento final: " + fp.calculaFolhaPagamento(func2));
			
		System.out.println();
		Funcionario func1 = new Gerente();
		func1.setSalario(4000.0);
		System.out.println("Valor da bonificação: " + func1.getBonificacao());
		System.out.println("Pagamento final: " + fp.calculaFolhaPagamento(func1));
		
		System.out.println();
		Funcionario func4 = new Diretor();
		func4.setSalario(4000.0);
		System.out.println("Valor da bonificação: " + func4.getBonificacao());
		System.out.println("Pagamento final: " + fp.calculaFolhaPagamento(func4));
	}
}