package pessoas;

public class OperadorDeCaixa extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Bonificacao Operador de Caixa");
		return super.getBonificacao();
	}
}
