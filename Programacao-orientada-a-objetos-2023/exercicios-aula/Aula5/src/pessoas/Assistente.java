package pessoas;

public class Assistente extends Funcionario {

	public double getBonificacao() {
		System.out.println("Bonificacao Assistente");
		return super.getBonificacao() + (this.getSalario() * 0.05) ;
	}
	
}
