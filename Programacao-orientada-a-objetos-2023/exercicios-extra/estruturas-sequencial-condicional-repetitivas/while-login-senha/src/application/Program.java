package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("SENHA INVÁLIDA");
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
			
		sc.close();
	}

}
