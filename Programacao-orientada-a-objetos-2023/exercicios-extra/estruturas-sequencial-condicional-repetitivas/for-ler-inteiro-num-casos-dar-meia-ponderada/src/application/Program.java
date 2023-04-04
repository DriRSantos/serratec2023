package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos casos de teste vai fazer? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.print("Digite o caso 1: ");
			double caso1 = sc.nextDouble();
			System.out.print("Digite o caso 2: ");
			double caso2 = sc.nextDouble();
			System.out.print("Digite o caso 3: ");
			double caso3 = sc.nextDouble();

			double mediap = (caso1 * 2 + caso2 * 3 + caso3 * 5) /(2 + 3 + 5);
			System.out.printf("Média ponderada %.1f \n\n", mediap);
		}

		sc.close();
	}
}
