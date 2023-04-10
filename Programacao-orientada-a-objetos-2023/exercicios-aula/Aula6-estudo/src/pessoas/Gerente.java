package pessoas;

public class Gerente extends Assistente {

	private int senha;
	private int numFuncionarios;
	
	public Gerente() {
		super();
	}
	
	public Gerente(String nome, String cpf, double salario, int matricula) {
		super(nome, cpf, salario, matricula);
	}
	
	public Gerente(String nome, String cpf, double salario, int matricula, int senha) {
		super(nome, cpf, salario, matricula);
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		}
		else {
			System.out.println("Acesso negado!");
			return false;
		}
	}

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + getSalario() * 0.15;
	}

	@Override
	public String toString() {
		return "Gerente [Nome = " + getNome() 
				+ ", Cpf = " + imprimeCPF(getCpf())
				+ ", Salario = " + getSalario()
				+ ", Matricula = " + getMatricula() + "]";
	}	
}
