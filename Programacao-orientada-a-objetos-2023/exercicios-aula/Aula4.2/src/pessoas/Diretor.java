package pessoas;

public class Diretor extends Funcionario {

	private double salarioFunc;
	private double folhaPagamento;
	
	public Diretor() {
		
	}
	
	public Diretor(String nome, String cpf, double salario, String matricula) {
		super(nome, cpf, salario, matricula);
	}

	public Diretor(String nome, String cpf, double salario, String matricula, double salarioFunc,
			double folhaPagamento) {
		super(nome, cpf, salario, matricula);
		this.salarioFunc = salarioFunc;
		this.folhaPagamento = folhaPagamento;
	}
	
	public double getSalarioFunc() {
		return salarioFunc;
	}
	
	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	
	public double getFolhaPagamento() {
		return folhaPagamento;
	}
	
	public void setFolhaPagamento(double folhaPagamento) {
		this.folhaPagamento = folhaPagamento;
	}

	@Override
	public String toString() {
		return "Diretor [salarioFunc=" + salarioFunc + ", folhaPagamento=" + folhaPagamento + ", Nome=" + getNome()
				+ ", Cpf=" + getCpf() + ", Salario=" + getSalario() + ", Matricula=" + getMatricula()
				+ "]";
	}	
}
