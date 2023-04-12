package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> emp = new ArrayList<>();
		
		System.out.print("How many emplyees will be registered? ");
		int n = sc.nextInt();
				
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Employee " + (i+1) + "#: ");
			System.out.print("Id: ");
			Integer ids = sc.nextInt();
			while (hasId(emp, ids)) {
				System.out.print("Id already taken. Try again: ");
				ids = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String names = sc.nextLine();
			System.out.print("Salary: ");
			Double salaries = sc.nextDouble();
			
			emp.add(new Employee(ids, names, salaries));
		}		
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idinc = sc.nextInt();
		
		boolean found = false;
		for(Employee emp2 : emp) {
			if(emp2.getId() == idinc){
				System.out.print("Enter the percentage: ");
				double perc = sc.nextDouble();
				emp2.salaryIncrease(perc);
				found = true;
			}			
		}
		if (!found) {
			System.out.println("Employee with id " + idinc + " does not exist!");
		}
		
		System.out.println();
		System.out.println("List of Employees ");
		for(Employee emp2 : emp) {
			System.out.println(emp2);
		}
				
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}