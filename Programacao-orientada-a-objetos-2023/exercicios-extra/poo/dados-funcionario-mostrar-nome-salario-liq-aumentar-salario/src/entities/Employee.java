package entities;

public class Employee {

	private String name;
	private double grossSalary;
	private double tax;
	
	public Employee() {
		
	}
	
	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100; 
	}

	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
