package pessoas;

public class OperadorDeCaixa extends Funcionario {

	private double item;
	private double preco;
	private double pagamento;
	private int cpfCliente;
	
	public OperadorDeCaixa() {

	}
	
	public OperadorDeCaixa(String nome, String cpf, double salario, String matricula) {
		super(nome, cpf, salario, matricula);
	}

	public OperadorDeCaixa(double item, double preco, double pagamento, int cpfCliente) {
		this.item = item;
		this.preco = preco;
		this.pagamento = pagamento;
		this.cpfCliente = cpfCliente;
	}

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}

	public int getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public double pagamentoTotal(double item, double preco) {
		return this.item * this.preco;
	}
	
	@Override
	public String toString() {
		return "OperadorDeCaixa [getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getSalario()=" + getSalario()
				+ ", getMatricula()=" + getMatricula() + "]";
	}	
}
