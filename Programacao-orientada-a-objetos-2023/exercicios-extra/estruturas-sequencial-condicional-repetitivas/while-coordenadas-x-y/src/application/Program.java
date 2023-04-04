package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a coordenada X: ");
		int X = sc.nextInt();
		System.out.print("Digite a coordenada Y: ");
		int Y = sc.nextInt();
		
		while(X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("primeiro");
			}
			else if (X < 0 && Y > 0) {
				System.out.println("segundo");
			}
			else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}			
			System.out.print("Digite a coordenada X: ");
			X = sc.nextInt();
			System.out.print("Digite a coordenada Y: ");
			Y = sc.nextInt();
		}

		sc.close();
	}
}
