package reports;

import entities.Employee;

public class Payroll {
	
	public double calculatePayroll(Employee emp) {
		return emp.getBonus() + emp.getSalary();
	}
}
