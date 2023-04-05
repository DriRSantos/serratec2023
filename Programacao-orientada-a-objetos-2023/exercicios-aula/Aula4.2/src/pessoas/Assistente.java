package pessoas;

public class Assistente extends Funcionario {

	private double salarioFunc;

	public double getSalarioFunc() {
		return salarioFunc;
	}

	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}

	@Override
	public String toString() {
		return "Assistente [salarioFunc=" + salarioFunc + ", getNome()=" + getNome() + ", getCpf()=" + getCpf()
				+ ", getSalario()=" + getSalario() + ", getMatricula()=" + getMatricula() + "]";
	}	
}
