package application;

import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

import entities.RealNumbers;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("How many numbers will be typed? ");
		int n = sc.nextInt();
		
		Vector<RealNumbers> realVector = new Vector<>();

		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Type one number: ");
			double num = sc.nextDouble();

			realVector.add(new RealNumbers(num));			
		}
		RealNumbers maxNumber = Collections.max(realVector);
		int index = realVector.indexOf(maxNumber);

		System.out.println("Max Number: " + maxNumber);
		System.out.println("Index position of Max Number: " + index);
		
		sc.close();
	}
}
