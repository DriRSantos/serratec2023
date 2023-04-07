package principal;

import pessoas.Funcionario;
import pessoas.Professor;
import relatorios.Relatorio;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario emp = new Funcionario("Maria", 2500.0);
		Professor prof = new Professor("Jose", 2500.0, 40);
		Funcionario prof2 = new Professor("Adriana", 3000.0, 30);
		
		Relatorio relat = new Relatorio();
		relat.imprimir(emp);
		System.out.println();
		relat.imprimir(prof);
		System.out.println();
		relat.imprimir(prof2);
		
		
//		System.out.println();
//		System.out.println("Testando instanciando diferente, fazendo casting do Funcionario");
//		Empregado funcionario; // mas não usa sempre, risco de erros
//		
//		funcionario = new Empregado();
//		funcionario.setNome("Claudio");
//		funcionario.setSalario(1500.0);
//		System.out.println(funcionario.getInfo());
//		
//		funcionario = new Professor();
//		funcionario.setNome("Edu");
//		funcionario.setSalario(1900.0);
//		((Professor) funcionario).setHorasDeAula(40);
//		System.out.println(funcionario.getInfo());
	}
}
