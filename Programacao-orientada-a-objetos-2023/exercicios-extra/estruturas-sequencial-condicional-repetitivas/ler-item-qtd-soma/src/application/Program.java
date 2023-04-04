package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do item: ");
		int cod = sc.nextInt();
		System.out.print("Digite a quantidade comprada: ");
		int qtd = sc.nextInt();
		
		double total;
		if(cod == 1) {
			total = qtd * 4.0;
			System.out.println("Total: R$ " + total);
		}
		else if (cod == 2) {
			total = qtd * 4.5;
			System.out.println("Total: R$ " + total);			
		}
		else if(cod == 3) {
			total = qtd * 5.0;
			System.out.println("Total: R$ " + total);
		}
		else if(cod == 4) {
			total = qtd * 2.0;
			System.out.println("Total: R$ " + total);
		}
		else if(cod == 5) {
			total = qtd * 1.5;
			System.out.println("Total: R$ " + total);
		}		
		
		sc.close();
	}
}
