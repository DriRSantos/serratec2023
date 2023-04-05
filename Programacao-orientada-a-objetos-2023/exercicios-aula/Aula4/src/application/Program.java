package application;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
	
		System.out.println("Sistema bancário\n");
		
    	System.out.println("Total de contas: " + Conta.getTotalDeContas());
		Conta alunos1 = new Conta();
		System.out.println("O número é: " + alunos1.getNumero());
		System.out.println("Total de contas: " + Conta.getTotalDeContas()); // referência ao método estático, pega o valor direto da classe sem precisar instanciar
		
		Conta alunos2 = new Conta();
		System.out.println("O número é: " + alunos2.getNumero());
		System.out.println("Total de contas: " + Conta.getTotalDeContas());
		
		Conta alunos3 = new Conta();
		System.out.println("O número é: " + alunos3.getNumero());
		System.out.println("Total de contas: " + Conta.getTotalDeContas());
		
		Conta alunos4 = new Conta();
		System.out.println("O número é: " + alunos4.getNumero());
		System.out.println("Total de contas: " + Conta.getTotalDeContas());
		
		Conta alunos5 = new Conta();
		System.out.println("O número é: " + alunos5.getNumero());
		System.out.println("Total de contas: " + Conta.getTotalDeContas());
		
		System.out.println();
		System.out.println("O número da conta do Aluno 1 é: " + alunos1.getNumero());		
	}
}
