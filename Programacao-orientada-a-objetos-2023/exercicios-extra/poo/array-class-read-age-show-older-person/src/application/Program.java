package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("How many people will be typed? ");
		int n = sc.nextInt();
		
		List<Person> person = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.println(i+1 + "st person data: ");
			System.out.print("Name ");
			String names = sc.nextLine();
			System.out.print("Age ");
			int ages = sc.nextInt();
			
			person.add(new Person(names, ages));
		}	
		
		Person olderPerson = Collections.max(person);
		System.out.println("Older person: " + olderPerson);		

		sc.close();
	}
}
