package entities;

public class Company extends TaxPayer {

	private int numberEmployee;
	
	public Company() {
		
	}

	public Company(String name, Double annualIncome, int numberEmployee) {
		super(name, annualIncome);
		this.numberEmployee = numberEmployee;
	}
	
	
	
}
