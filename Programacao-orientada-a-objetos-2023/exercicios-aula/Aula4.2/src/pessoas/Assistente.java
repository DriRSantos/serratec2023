package pessoas;

public class Assistente extends Funcionario {
	
	public Assistente(String nome, String cpf, double salario, String matricula) {
		super(nome, cpf, salario, matricula);
	}

	@Override
	public String toString() {
		return "Assistente [Nome=" + getNome() + ", Cpf=" + getCpf() + ", Salario=" + getSalario()
				+ ", Matricula=" + getMatricula() + "]";
	}	
}
