package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas vezes que fazer leitura de números: ");
		int N = sc.nextInt();

		int in = 0;
		int out = 0;
		for (int i=0; i<N; i++) {
			System.out.print("Digite um número X: ");
			int X = sc.nextInt();
			
			if(X >= 10 && X <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");		

		sc.close();
	}
}
