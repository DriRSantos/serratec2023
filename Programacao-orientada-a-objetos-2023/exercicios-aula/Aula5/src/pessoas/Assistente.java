package pessoas;

public class Assistente extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Bonificacao Assistente");
		return super.getBonificacao() + (this.getSalario() * 0.05) ;
	}

	@Override
	public String toString() {
		return "Assistente [Nome = " + getNome() 
				+ ", Cpf = " + getCpf() 
				+ ", Salario = " + getSalario()
				+ ", Matricula = " + getMatricula() + "]";
	}	
}
