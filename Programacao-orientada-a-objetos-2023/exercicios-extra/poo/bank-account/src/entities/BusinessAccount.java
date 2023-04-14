package entities;

import entities.enums.AccountEnum;

public class BusinessAccount extends Account {

	private Double loanlimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(int accountNumber, String holder, AccountEnum accoutType, double initialDeposit,
			Double loanlimit) {
		super(accountNumber, holder, accoutType, initialDeposit);
		this.loanlimit = loanlimit;
	}

	public Double getLoanlimit() {
		return loanlimit;
	}

	public void setLoanlimit(Double loanlimit) {
		this.loanlimit = loanlimit;
	}

	@Override
	public String toString() {
		return "BusinessAccount [loanlimit=" + loanlimit + ", getNumberAccount()=" + getNumberAccount() + ", getName()="
				+ getName() + ", getBalance()=" + getBalance() + "]";
	}
	
}
