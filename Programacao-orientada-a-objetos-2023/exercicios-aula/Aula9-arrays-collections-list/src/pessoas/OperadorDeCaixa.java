package pessoas;

import java.util.HashMap;
import java.util.Map;

public class OperadorDeCaixa extends Funcionario {
	
	//private int idOperador;
	
	public static Map<String, OperadorDeCaixa> mapaOperadorCaixa = new HashMap<>();
	
	public OperadorDeCaixa() {
		super();
	}

	public OperadorDeCaixa(String nome, String cpf, double salario, int matricula) {
		super(nome, cpf, salario, matricula);
	}

//	public int getIdOperador() {
//		return idOperador;
//	}
//
//	public void setIdOperador(int idOperador) {
//		this.idOperador = idOperador;
//	}

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
