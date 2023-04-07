package entities;

public class CashierOperator extends Employee {
	
	public CashierOperator() {
		
	}

	public CashierOperator(String name, String cpf, double salary, int registration, String position) {
		super(name, cpf, salary, registration, position);
	}

	public double getBonus() {
		System.out.print("Cashier operator > ");
		return super.getBonus();
	}
}
