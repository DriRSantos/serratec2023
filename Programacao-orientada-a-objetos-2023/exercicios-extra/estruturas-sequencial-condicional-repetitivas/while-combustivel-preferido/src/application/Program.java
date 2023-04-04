package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		opcoes();
		int codigo = sc.nextInt();

		int alcool=0;
		int gasolina=0;
		int diesel=0;
		while(codigo != 4) {
			if(codigo == 1) {
				alcool++;
			}
			else if(codigo == 2) {
				gasolina++;
			}
			else if(codigo == 3) {
				diesel++;
			}
			else {
				System.out.println("Opção inválida");
			}	
			opcoes();
			codigo = sc.nextInt();
		}
		System.out.println("Alcool: " + alcool);
		System.out.println("Alcool: " + gasolina);
		System.out.println("Alcool: " + diesel);
		System.out.print("MUITO OBRIGADO");
		
		sc.close();
	}
	
	public static void opcoes() {
		System.out.println("\nDigite o combustível que você prefere: ");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolinal");
		System.out.println("3 - Diesel");
		System.out.println("4 - Fim");
	}
}
