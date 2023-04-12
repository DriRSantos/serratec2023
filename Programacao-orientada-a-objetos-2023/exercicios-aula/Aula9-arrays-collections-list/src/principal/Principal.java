package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import contas.Conta;
import contas.ContaCorrente;
import pessoas.Assistente;
import pessoas.Funcionario;
import pessoas.Gerente;
import pessoas.OperadorDeCaixa;
import relatorios.Relatorio;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("====== LISTA ANTIGA ========");
		List lista = new ArrayList();
		Gerente g = new Gerente();
		g.setNome("Marcelo colares");
		
		lista.add("g");
		lista.add("Joaquim");
		lista.add("Maria");
		//lista.remove(1);
//		for(int i=0; i<lista.size(); i++) {
//			if(i==0) {
//				System.out.println(((Gerente)lista.get(i)).getNome()); // nao fazer isso, errado
//			}			
//		System.out.println(lista.get(i));
//		}		
		System.out.println("Tamanho da lista " + lista.size());
		
		
		OperadorDeCaixa func = new OperadorDeCaixa();
		ContaCorrente cc = new ContaCorrente();
		
		List lista1 = new ArrayList();
		lista.add("Manoel");
		lista.add("Joaquim");
		lista.add(func);
		lista.add(cc);
//		Funcionario func2 = (Funcionario) lista.get(3);  // POSIÇÃO 3 é OPERADOR DE CAIXA, não é FUNCIONARIO
		System.out.println("Tamanho da lista " + lista1.size()); // classexception
		
		System.out.println("====== GENERICS ========");
		
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c3 = new ContaCorrente();
	    ContaCorrente c2 = new ContaCorrente();
		contas.add(c1);
	    contas.add(c3);
		contas.add(c2);
		// contas.add("uma string qualquer"); // isso não compila mais!!
		
		c1.getTitular();
		
		System.out.println("====== COLLECTIONS ========");
		System.out.println();
		List<String> lista3 = new ArrayList<>();
		lista3.add("Sérgio");
		lista3.add("Paulo");
		lista3.add("Guilherme");
		// repare que o toString de ArrayList foi sobrescrito:
		System.out.println(lista3);
		Collections.sort(lista3);
		System.out.println(lista3);
		System.out.println();
		
		System.out.println("====ORDENAR COLLECTIONS CRIA INTERFACE ========");
		System.out.println();
		Funcionario f1 = new Funcionario("Adriana", "34949494949", 2000.0, 34);
		f1.setSalario(5000);
		Funcionario f2= new Funcionario("Adriana", "34949494949", 8000.0, 34);
		f2.setSalario(1500);
		Funcionario f3 = new Funcionario("Cara", "34949494949", 5000.0, 34);
		f3.setSalario(2000);
		List<Funcionario> listaOp = new ArrayList<>();
		listaOp.add(f1);
		listaOp.add(f3);
		listaOp.add(f2);
		System.out.println(listaOp);
		Collections.sort(listaOp); // qual seria o critério para esta ordenação?
		System.out.println(listaOp);
		System.out.println();
		
		System.out.println("==== COLLECTIONS SET ========");
		System.out.println();
		
		System.out.println("==== MAP ========");
		ContaCorrente c4 = new ContaCorrente();
		c4.depositar(10000);
		ContaCorrente c5 = new ContaCorrente();
		c5.depositar(3000);
		// cria o mapa
		Map<String, ContaCorrente> mapaDeContas = new HashMap<>();
		// adiciona duas chaves e seus respectivos valores
		mapaDeContas.put("diretor", c4);
		mapaDeContas.put("gerente", c5);
		// qual a conta do diretor? (sem casting!)
		ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		System.out.println("==== AULA 👆 ==============");
		System.out.println();
		System.out.println();
		
		
		System.out.println("==== MAP OPERADOR ========");
		
		List<OperadorDeCaixa> operadores = new ArrayList<>();
		operadores.add(new OperadorDeCaixa("Claudio", "02365487965", 1000.0, 15));
		operadores.add(new OperadorDeCaixa("Adriana", "35648498745", 1000.0, 16));
		operadores.add(new OperadorDeCaixa("Edu", "23652365896", 1000.0, 17));
		operadores.add(new OperadorDeCaixa("Maria", "05469874563", 1000.0, 18));
		operadores.add(new OperadorDeCaixa("Jose", "56235874123", 1000.0, 19));
		
		for(OperadorDeCaixa op : operadores) {
			OperadorDeCaixa.mapaOperadorCaixa.put(op.getCpf(), op);
			System.out.println(op);
		}
		
		System.out.println("\nUSando get para buscar no map");
		System.out.println(OperadorDeCaixa.mapaOperadorCaixa.get("02365487965"));
		System.out.println(OperadorDeCaixa.mapaOperadorCaixa.get("05469874563"));	
	
		
		System.out.println("\n==== MAP CONTA CORRENTE ========");
		List<ContaCorrente> contaCorrente = new ArrayList<>();
		contaCorrente.add(new ContaCorrente(1, 21, 3, "Clara", "Corrente", 1500.0, 1, 5.0, 1500.0));
		contaCorrente.add(new ContaCorrente(2, 22, 1, "Eduardo", "Corrente", 2000.0, 2, 5.0, 1500.0));
		contaCorrente.add(new ContaCorrente(3, 23, 2, "Fernanda", "Corrente", 2000.0, 3, 5.0, 1500.0));
		
		for(ContaCorrente cc1 : contaCorrente) {
			ContaCorrente.mapaContaCorrente.put(cc1.getNumero(), cc1);
			System.out.println(cc1);	
		}
		
		System.out.println("\nUSando get para buscar no map");
		System.out.println(ContaCorrente.mapaContaCorrente.get(21));
		
		System.out.println("\n==== MAP CLIENTE >< CONTA ========");
		
		System.out.println(Conta.mapaDeContas.get(21));
		
		
	}	
}
