package entities;

public class Individual extends TaxPayer {

	private double healthexp;

	public Individual() {
		
	}

	public Individual(String name, Double annualIncome, double healthexp) {
		super(name, annualIncome);
		this.healthexp = healthexp;
	}
	
	
	
	
	
	
}
