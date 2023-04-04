package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário da pessoa: ");
		double salario = sc.nextDouble();
		
		double imposto;
		if(salario <= 2000.0) {
			imposto = 0.0; // não tem imposto até 2 mil
		}
		else if(salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08; // imposto apenas sobre além dos 2 mil
		}
		else if(salario <= 4500.00) {
			imposto = (salario - 2000.0) * 0.18 + 1000.0 * 0.08; // imp sobre além 2 mil + alem 3 mil
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}		
		
		sc.close();
	}

}
