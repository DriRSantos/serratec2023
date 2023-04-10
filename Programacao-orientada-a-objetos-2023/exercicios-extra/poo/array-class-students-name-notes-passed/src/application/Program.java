package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("How many people will be typed? ");
		int n = sc.nextInt();

		List<Student> students = new ArrayList<>();		
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Type the name, first and second grade ");
			String name = sc.nextLine();
			double grades1 = sc.nextDouble();
			double grades2 = sc.nextDouble();
			
			students.add(new Student(name, grades1, grades2));
		}
		System.out.println();		
		
		for(Student st : students) {
			double media = (st.getGrade1() + st.getGrade2()) / 2.0;
			if(media >= 6.0) {
				System.out.println("Aprovados: " + st);
			}
			else {
				System.out.println("Reprovado: " + st);
			}
		}
		
		sc.close();
	}
}
