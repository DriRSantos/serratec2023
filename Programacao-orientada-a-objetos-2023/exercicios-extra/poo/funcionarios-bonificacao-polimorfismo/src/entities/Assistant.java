package entities;

public class Assistant extends CashierOperator{

	public Assistant() {

	}

	public Assistant(String name, String cpf, double salary, int registration, String position) {
		super(name, cpf, salary, registration, position);

	}

	public double getBonus() {
		System.out.print("Assistant > ");
		return super.getBonus() + this.getSalary() * 0.05;
	}
}
