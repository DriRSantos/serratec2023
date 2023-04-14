package entities;

import entities.enums.AccountEnum;
import procedures.Procedure;

public class Account implements Procedure {

	private int accountNumber;
	private String holder;
	protected double balance;
	private AccountEnum accountType;

	public Account() {

	}
	
	public Account(int accountNumber, String holder, AccountEnum accountType) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.accountType = accountType;
	}

	public Account(int accountNumber, String holder, AccountEnum accountType, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.accountType = accountType;
		deposit(initialDeposit);
	}

	public int getNumberAccount() {
		return accountNumber;
	}

	public String getName() {
		return holder;
	}

	public void setName(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public AccountEnum getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountEnum accountType) {
		this.accountType = accountType;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Funds");
		}
		else if (balance >= amount) {
			balance -= amount + 5.00;
		}		
	}

	@Override
	public String toString() {
		return "Account " + accountNumber 
				+ ", Holder: " + holder + ", Balance: " + String.format("%.2f", balance);
	}

}
