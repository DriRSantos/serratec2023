package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		Rent[] rooms = new Rent[10];
		
		System.out.print("How many students will rent a room? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("\nRent #" + i + ": ");
			System.out.print("Name: ");
			sc.nextLine();
			String names = sc.nextLine();
			System.out.print("Email: ");
			String emails = sc.next();
			System.out.print("Rooms available from 0 to 9: ");			
			int roomNumb = sc.nextInt();
			
			rooms[roomNumb] = new Rent(names, emails);
		}
		
		System.out.println("\nBusy rooms: ");
		for(int i=0; i<10; i++) {
			if(rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
		
		sc.close();
	}
}
