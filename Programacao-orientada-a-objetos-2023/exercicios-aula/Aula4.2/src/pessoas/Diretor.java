package pessoas;

public class Diretor extends Funcionario {

	private double salarioFunc;
		
	public double getSalarioFunc() {
		return salarioFunc;
	}
	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	
	
	@Override
	public String toString() {
		return "Diretor [despesas=" + despesas + ", salarioFunc=" + salarioFunc + ", rendimento=" + rendimento + "]";
	}
}
