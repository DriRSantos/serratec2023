package entities;

public class Individual extends TaxPayer {

	private Double healthexp;

	public Individual() {
		
	}

	public Individual(String name, Double annualIncome, Double healthexp) {
		super(name, annualIncome);
		this.healthexp = healthexp;
	}

	public double getHealthexp() {
		return healthexp;
	}

	public void setHealthexp(Double healthexp) {
		this.healthexp = healthexp;
	}
	
	@Override
	public double tax() {
		double taxesPaid = (getAnnualIncome() < 20000.00) ? getAnnualIncome() * 0.15 
				: getAnnualIncome() * 0.25;  // ternario
		return taxesPaid;
//		
//		if(getAnnualIncome() < 20000.00) {
//			return (getAnnualIncome() * 0.15) - (healthexp * 0.5);
//		}
//		else {
//			return (getAnnualIncome() * 0.25) - (healthexp * 0.5);
//		}
	}	

	@Override
	public String toString() {
		return "Individual [healthexp=" + healthexp + ", getName()=" + getName() + ", getAnnualIncome()="
				+ getAnnualIncome() + "]";
	}
}
