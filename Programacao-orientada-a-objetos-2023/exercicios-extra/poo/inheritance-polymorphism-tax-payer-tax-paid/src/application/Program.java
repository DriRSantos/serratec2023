package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxpay = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
				
		for (int i = 0; i < n; i++) {
			System.out.println("Individual or company (i/c)? ");
			System.out.println("Tax payer #" + (i+1) + " data: ");
			char option = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annal income: ");
			Double income = sc.nextDouble();
				if(option == 'i') {
					System.out.print("Health expenditures: ");
					Double health = sc.nextDouble();
					
					taxpay.add(new Individual(name, income, health));
				}
				else if (option == 'c') {
					System.out.println("Number of employees: ");
					Integer emp = sc.nextInt();
					
					taxpay.add(new Company(name, income, emp));
				}			
		}
		

		double sum = 0.0;
		System.out.println("TAXES PAID:");
		for(TaxPayer tp : taxpay) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}
}
