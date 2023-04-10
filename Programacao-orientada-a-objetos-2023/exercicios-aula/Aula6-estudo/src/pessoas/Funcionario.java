package pessoas;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private int matricula;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, double salario, int matricula) {
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

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	public static String imprimeCPF(String CPF) {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
        CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }

	@Override
	public String toString() {
		return "Funcionario [nome = " + nome 
				+ ", cpf = " + imprimeCPF(cpf) 
				+ ", salario = " + salario 
				+ ", matricula = " + matricula + "]";
	}
}
