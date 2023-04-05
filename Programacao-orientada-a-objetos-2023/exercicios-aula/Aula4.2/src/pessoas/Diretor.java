package pessoas;

public class Diretor extends Funcionario {

	private double despesas;
	private double salarioFunc;
	private double rendimento;
	
	public double getDespesas() {
		return despesas;
	}
	public void setDespesas(double despesas) {
		this.despesas = despesas;
	}
	public double getSalarioFunc() {
		return salarioFunc;
	}
	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	@Override
	public String toString() {
		return "Diretor [despesas=" + despesas + ", salarioFunc=" + salarioFunc + ", rendimento=" + rendimento + "]";
	}
}
