package pessoas;

public class OperadorDeCaixa extends Funcionario{

	private int item;
	private double preco;
	
	public OperadorDeCaixa() {
		super();
	}

	public OperadorDeCaixa(String nome, String cpf, double salario, int matricula) {
		super(nome, cpf, salario, matricula);
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getBonificacao() {
		return super.getBonificacao();
	}

	@Override
	public String toString() {
		return "OperadorDeCaixa [Nome = " + getNome() 
				+ ", Cpf = "  + imprimeCPF(getCpf())
				+ ", Salario = " + getSalario() 
				+ ", Matricula = " + getMatricula() + "]";
	}	
}
