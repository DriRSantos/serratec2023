package entities;

public class Company extends TaxPayer {

	private int numberEmployee;
	
	public Company() {
		
	}

	public Company(String name, Double annualIncome, int numberEmployee) {
		super(name, annualIncome);
		this.numberEmployee = numberEmployee;
	}

	public int getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		this.numberEmployee = numberEmployee;
	}
	
	public double tax() {
		if(numberEmployee < 10) {
			return (getAnnualIncome() * 0.16);
		}
		else {
			return (getAnnualIncome() * 0.14);
		}
	}		

	@Override
	public String toString() {
		return "Company [numberEmployee=" + numberEmployee + ", getName()=" + getName() + ", getAnnualIncome()="
				+ getAnnualIncome() + "]";
	}
	
}
