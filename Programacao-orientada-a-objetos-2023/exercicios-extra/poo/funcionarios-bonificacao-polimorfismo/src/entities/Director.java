package entities;

public class Director extends Manager {
	
	private double expenses;
	private double empSalaries;
	
	public Director() {
	
	}
	
	public Director(String name, String cpf, double salary, int registration, String position) {
		super(name, cpf, salary, registration, position);
	}
		
	public double getExpenses() {
		return expenses;
	}

	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}

	public double getEmpSalaries() {
		return empSalaries;
	}

	public void setEmpSalaries(double empSalaries) {
		this.empSalaries = empSalaries;
	}

	public double getBonus() {
		System.out.print("Director > ");
		return super.getBonus() + this.getSalary() * 0.10;
	}
}
