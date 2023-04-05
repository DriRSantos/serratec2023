package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary, tax);
		
		System.out.println();
		System.out.println("Employee" + employee);
		
		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}
}
