package entities.enums;

public enum AccountEnum {

	BUSINESS ("Business", 1),
	SAVINGSA("Savings", 2);

	private final String accountType;
	private final Integer accountId;
	
	AccountEnum(String accountType, Integer accountId) {
		this.accountType = accountType;
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public Integer getAccountId() {
		return accountId;
	}	
}
