package entities;

public class Manager extends Assistant {

	private int password;
	private int employeeNumber;

	public Manager() {

	}

	public Manager(String name, String cpf, double salary, int registration, String position) {
		super(name, cpf, salary, registration, position);
	}

	public Manager(String name, String cpf, double salary, int registration, String position, int password,
			int employeeNumber) {
		super(name, cpf, salary, registration, position);
		this.password = password;
		this.employeeNumber = employeeNumber;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public double getBonus() {
		System.out.print("Manager > ");
		return super.getBonus() + this.getSalary() * 0.15;
	}
}
