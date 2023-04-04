package application;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
	
		System.out.println("Sistema bancário\n");
		
		Conta minhaConta = new Conta();
		minhaConta.numero = 1;
		minhaConta.agencia = 10;
		minhaConta.titular = "Adriana";
		minhaConta.depositar(1000.0);
		minhaConta.getSaldo();
		minhaConta.tipo = "Corrente";
		
		System.out.println(minhaConta);		
		minhaConta.sacar(300.0);				
		System.out.println(minhaConta);
		System.out.println("================\n");
		
		Conta alunos = new Conta();
		alunos.numero = 1;
		alunos.agencia = 12;
		alunos.titular = "Alunos";
		alunos.depositar(10000.0);
		alunos.tipo = "Corrente";
		
		Conta professor = new Conta(12, "Professor", 100.0, "Corrente");
		System.out.println(professor); // criou Conta professor com parâmetros
	//	professor.numero = 1;  		// sem passar numero, enviando numero pelo método
	//  professor.agencia = 12;  
	//	professor.titular = "Professor";
	//	professor.depositar(100.0);
	//	professor.tipo = "Corrente";
		
		System.out.println("\nSaldo da conta dos alunos: " + alunos.getSaldo());
		System.out.println("Saldo da conta dos professor: " + professor.getSaldo());
		
		alunos.transferir(professor, 5000.0);
		System.out.println("Após trasferência para professor");
		
		System.out.println("Professor deposita 0 e saca 0");
		professor.depositar(0);
		professor.sacar(0);
		System.out.println("O saldo da conta professor é " + professor.getSaldo());				
		
		System.out.println("\n================");		
	}
}
