package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println(i+1 + "st person data: ");
			System.out.print("Name: ");
			String names = sc.nextLine();
			System.out.print("Age: ");
			int ages = sc.nextInt();
			System.out.print("Height: ");
			double heights = sc.nextDouble();
			
			vect[i] = new Person(names, ages, heights);
		}
		
		double sum = 0.0;
		int minor = 0;
		for (int i=0; i<vect.length; i++) {
			if(vect[i].getAge() < 16){
				minor++;				
			}
			sum += vect[i].getHeight(); 
		}
		double avg = sum / vect.length;
		System.out.printf("Average height: %.2f m \n", avg);
		
		double totalMinor = (minor * 100.0) / vect.length;
		System.out.printf("People under 16: %.1f%%\n", totalMinor);
		
		for (int i=0; i<vect.length; i++) {
			if(vect[i].getAge() < 16){
				System.out.println(vect[i].getName());			
			}
		}
	
		sc.close();		
	}
}
