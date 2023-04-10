package principal;

import contas.ContaCorrente;
import contas.ContaPoupanca;
import pessoas.Assistente;
import pessoas.Diretor;
import pessoas.Gerente;
import pessoas.OperadorDeCaixa;
import relatorios.Relatorio;

public class Principal {

	public static void main(String[] args) {
		
		Relatorio relat = new Relatorio();
		
		OperadorDeCaixa operador = new OperadorDeCaixa("Claudio", "85465498745", 2000.0, 15);
		System.out.println(operador);
		System.out.println("Pagamento com bônus: " + relat.calculaFolhaPagamento(operador));
		relat.imprimir(operador);
		
		Assistente assist = new Assistente("Marcelo", "98765412365", 3800.0, 12);
		System.out.println("\n" + assist);
		System.out.println("Pagamento com bônus: " + relat.calculaFolhaPagamento(assist));
		relat.imprimir(assist);
		
		System.out.println();
		ContaPoupanca cpoup = new ContaPoupanca(278548, 12, "Adriana", 200.0, 0.005);
		System.out.println(cpoup);
		cpoup.atualizaSaldo();
		System.out.println("Saldo com rendimento no mês " + cpoup.getSaldo() + "\n");
				
		Diretor diretor = new Diretor("Jose", "56498776542", 6500.0, 1);
		System.out.println(diretor);
		System.out.print("Diretor verifica salário do funcionário: ");
		diretor.verificaSalario(assist);
		
		System.out.println();
		cpoup.imprimeExtrato(); // testando extrato da poupança anterior
		
		System.out.println();
		Gerente gerente = new Gerente("Carlos", "85696574585",5000.0, 3, 123456);
		System.out.println(gerente);
		System.out.print("Login no sistema: ");
		gerente.autentica(1564);
		
		System.out.println();
		ContaCorrente cc = new ContaCorrente(23, 2, "Eduardo", 2000.0, 5.0, 1500.0);
		System.out.println(cc);
		cc.transferir(cpoup, 1000.0);
		System.out.println("Saldo da poupança " + cpoup.getTitular() + " após transferência " + cpoup.getSaldo() + "\n");
	}	
}
