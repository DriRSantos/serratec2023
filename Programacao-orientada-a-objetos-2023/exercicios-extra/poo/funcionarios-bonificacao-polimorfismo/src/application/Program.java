package application;

import entities.Assistant;
import entities.CashierOperator;
import entities.Director;
import entities.Employee;
import entities.Manager;
import reports.Payroll;

public class Program {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Maria", "54689723156", 2000.0, 87, "Employee");
		System.out.println(emp);
		
		CashierOperator cashop = new CashierOperator("Adriana", "32165498796", 2000.0, 75, "Cashier");
		System.out.println(cashop);
		
		Assistant assist = new Assistant("Carlos", "98765432154", 2000.0, 68, "Assistant");
		System.out.println(assist);
		
		Manager manager = new Manager("Antonia", "12365478952", 2000.0, 50, "Manager");
		System.out.println(manager);
		
		Director director = new Director("Clara", "564987231254", 2000.0, 40, "Director");
		System.out.println(director);
		
		System.out.println();
		System.out.println("Bonus according position ");
		System.out.println(emp.getBonus());
		System.out.println(cashop.getBonus());
		System.out.println(assist.getBonus());
		System.out.println(manager.getBonus());
		System.out.println(director.getBonus());
		
		System.out.println();
		Payroll pr = new Payroll();
		System.out.println("Payroll according position [Bonus + Salary]");
		System.out.println(pr.calculatePayroll(emp));
		System.out.println(pr.calculatePayroll(cashop));
		System.out.println(pr.calculatePayroll(assist));
		System.out.println(pr.calculatePayroll(manager));
		System.out.println(pr.calculatePayroll(director));
		
		System.out.println();
		Employee emp1 = new CashierOperator("Carolina", "65496385214", 3500.0, 35, "Employee");
		System.out.println("Cashier operator payment " + pr.calculatePayroll(emp1));
		Employee emp2 = new Assistant("Regina", "74185296325", 3500.0, 30, "Assitant");
		System.out.println("Assistant bonus " + emp2.getBonus());
	}
}
