package pessoas;

public class Diretor extends Gerente {

	public Diretor() {
		super();
	}
	
	public Diretor(String nome, String cpf, double salario, int matricula) {
		super(nome, cpf, salario, matricula);
	}	

	public void verificaSalario(Funcionario fun) {
		System.out.println(fun.getNome() + ", salário: " + fun.getSalario());;
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + getSalario() * 0.10;
	}

	@Override
	public String toString() {
		return "Diretor [Nome = " + getNome() 
				+ ", Cpf = " + imprimeCPF(getCpf())
				+ ", Salario = " + getSalario()
				+ ", Matricula = " + getMatricula() + "]";
	}
}
