package application;

import java.util.Scanner;

public class NumMultiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números para verificar se são multiplos: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}	
		
		sc.close();
	}

}
