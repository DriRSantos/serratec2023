package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos pares de números que digitar? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			System.out.print("\nDigite o primeiro número: ");
			int num1 = sc.nextInt();
			System.out.print("Digite o segundo número: ");
			int num2 = sc.nextInt();
			
			if(num2 == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double divisao = (double) num1 / num2; 
				System.out.println(divisao);
			}			
		}
		
		sc.close();
	}
}
