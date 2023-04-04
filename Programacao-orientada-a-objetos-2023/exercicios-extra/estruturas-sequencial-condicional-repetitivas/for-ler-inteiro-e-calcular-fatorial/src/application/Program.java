package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual número quer descobrir o fatorial? ");
		int N = sc.nextInt();
		
		int fatorial = 1;
		if(N == 0){
			System.out.println("O fatorial de 0 é 1");
		}
		else {
			for (int i = 1; i <= N; i++) {
				fatorial = fatorial * i;
			}
			System.out.println("O fatorial de " + N + " é " + fatorial);
		}
		sc.close();
	}
}
