package entities;

public class Employee {

	private String name;
	private String cpf;
	private double salary;
	private int registration;
	private String position;
	
	public Employee() {
		
	}
	
	public Employee(String name, String cpf, double salary, int registration, String position) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
		this.registration = registration;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}	

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public static String printCPF(String CPF) {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
        CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }
	
	public double getBonus() {
		System.out.print("Employee: ");
		return this.salary * 0.1;
	}	

	@Override
	public String toString() {
		return "Employee [name = " + name + ", CPF = " + printCPF(cpf) 
				+ ", salary = " + salary + ", registration = " + registration
				+ ", position = " + position + "]";
	}	
}
