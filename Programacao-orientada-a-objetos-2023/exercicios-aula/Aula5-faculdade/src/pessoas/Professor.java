package pessoas;

public class Professor extends Funcionario {

	private double horasDeAula;
	
	public Professor() {
		
	}

	public Professor(String nome, double salario, double horasDeAula) {
		super(nome, salario);
		this.horasDeAula = horasDeAula;
	}
	
	public double getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(double horasDeAula) {
		this.horasDeAula = horasDeAula;
	}

	public double getGastos() {
		return super.getGastos() + (10.00 * horasDeAula);
	}
	
	@Override
	public String getInfo() {
		return "Professor " + getNome() + ", salário: " + getSalario() 
				+ ", horas de aula: " + horasDeAula;
	}
}
