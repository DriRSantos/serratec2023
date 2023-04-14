package entities;

import entities.enums.AccountEnum;

public class SavingsAccount extends Account {
	
	private Double interestRate;
		
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int accountNumber, String holder, AccountEnum accoutType, double initialDeposit,
			Double interestRate) {
		super(accountNumber, holder, accoutType, initialDeposit);
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", getNumberAccount()=" + getNumberAccount()
				+ ", getName()=" + getName() + ", getBalance()=" + getBalance() + "]";
	}	
}
