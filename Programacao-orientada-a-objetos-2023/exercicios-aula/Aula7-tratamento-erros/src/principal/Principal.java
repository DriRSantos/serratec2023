package principal;

import pessoas.Assistente;
import pessoas.Diretor;
import pessoas.Funcionario;
import pessoas.Gerente;
import pessoas.OperadorDeCaixa;
import relatorios.Relatorio;

public class Principal {

	public static void main(String[] args) {
		
		calculaExcecao();
		
		Relatorio relat = new Relatorio();
		
		try {
			Gerente gerente = null;
						
			Assistente assist = new Assistente("Marcelo", "98765412365", 3800.0, 12);
			System.out.println("\n" + assist);
			System.out.println("Pagamento com bônus: " + relat.calculaFolhaPagamento(assist));
			relat.imprimir(gerente);
		}
		catch(Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
			e.printStackTrace();
			System.out.println("Ocorreu um erro: " + e.getCause());
		}
		finally {
			System.out.println();
			OperadorDeCaixa operador = new OperadorDeCaixa("Claudio", "85465498745", 2000.0, 15);
			System.out.println(operador);
			System.out.println("Pagamento com bônus: " + relat.calculaFolhaPagamento(operador));
			relat.imprimir(operador);
		}
					
	}
	
	public static void calculaExcecao() {  // criou função para verificar exceção
		Relatorio dpr = new Relatorio();
		try {
			Funcionario funcionario = null; // adicionou o funcionário nulo para dar erro ponteiro nulo
			
			Diretor diretor1 = new Diretor();
			diretor1.setNome("Marcelo");
			diretor1.setCpf("123.456.798.-10");
			diretor1.setSalario(2000.00);
			System.out.println(dpr.calculaFolhaPagamento(funcionario)); 
		}						// esqueceu de passar o diretor aqui de proposito, ou poderia ter feito funcionario = diretor;
		catch (Exception e) {
			System.out.println("Houve um erro ao calcular a folha de pagamento "
					+ e.getMessage() + " " + e.getCause());
			   e.printStackTrace(); // mostra o caminho, stacktrace mostra em ordem crescente como a função chamou outra
		}
		finally { // bloco de código que vai declarar como obrigatório, faz mesmo dando erro ou não
			System.out.println("Entrei no bloco finally");
			
			Diretor diretor1 = new Diretor();
			diretor1.setNome("Marcelo");
			diretor1.setCpf("123.456.798.-10");
			//diretor1.setSalario(2000.00);
			System.out.println("Não foi feita transferência"); 
			System.out.println(dpr.calculaFolhaPagamento(diretor1)); 
		}
	}	
}
