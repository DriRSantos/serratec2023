package pessoas;

import java.util.HashMap;
import java.util.Map;

public class Assistente extends OperadorDeCaixa{
	
	public static Map<String, Assistente> mapaAssistente = new HashMap<>();
	
	public Assistente() {
		super();
	}

	public Assistente(String nome, String cpf, double salario, int matricula) {
		super(nome, cpf, salario, matricula);
	}

	public double getBonificacao() {
		return super.getBonificacao() + (this.getSalario() * 0.05) ;
	}

	@Override
	public String toString() {
		return "Assistente [Nome = " + getNome() 
				+ ", Cpf = " + imprimeCPF(getCpf())
				+ ", Salario = " + getSalario()
				+ ", Matricula = " + getMatricula() + "]";
	}	
}
