package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine(); // ATENÇÃO à quebra de linha anterior! 
		String holderName = sc.nextLine();
		System.out.print("Is there an initial deposit value? y/n: ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit");
			double initialDeposit = sc.nextDouble();
			acc = new Account(accountNumber, holderName, initialDeposit);
		}
		else {
			acc = new Account(accountNumber, holderName);
		}
		System.out.println("Account data " + acc);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		acc.deposit(sc.nextDouble());
		System.out.println("Updated account data: " + acc);		
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		acc.withdraw(sc.nextDouble());
		System.out.println("Updated account data: " + acc);
		
		sc.close();
	}
}
