package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Type your name: ");
		String name = sc.nextLine();
		
		System.out.println("Type your grades: ");
		double g1 = sc.nextDouble();
		double g2 = sc.nextDouble();
		double g3 = sc.nextDouble();
		
		Student stu = new Student(name, g1, g2, g3);
		System.out.println("FINAL GRADE: " + stu.finalGrade());
		
		if (stu.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", stu.missingPoints());
		}
		else {
			System.out.println("PASS");
		}	
		sc.close();
	}
}
