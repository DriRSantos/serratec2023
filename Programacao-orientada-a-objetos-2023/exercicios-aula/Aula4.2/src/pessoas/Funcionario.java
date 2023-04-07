package pessoas;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private String matricula; 
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, double salario, String matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", matricula=" + matricula + "]";
	}
}
