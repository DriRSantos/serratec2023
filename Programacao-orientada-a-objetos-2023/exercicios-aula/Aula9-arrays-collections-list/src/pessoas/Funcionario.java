package pessoas;

import java.util.HashMap;
import java.util.Map;

public class Funcionario implements Comparable<Funcionario> {

	private String nome;
	private String cpf;
	private double salario;
	private int matricula;
	
	public static Map<String, Funcionario> mapaFuncionarios = new HashMap<>();
	
	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, double salario, int matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getBonificacao() {
		return this.salario * 0.1;
	}

	public static String imprimeCPF(String CPF) {
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}

	@Override
	public String toString() {
		return "Funcionario [nome = " + nome + ", cpf = " + imprimeCPF(cpf) + ", salario = " + salario
				+ ", matricula = " + matricula + "]";
	}

	@Override
	public int compareTo(Funcionario f) {
		if (this.getNome().compareTo(f.getNome()) > 0) { // comparou pelo nome e depois salário
			return -1; 
		}
		if (this.getNome().compareTo(f.getNome()) < 0) {
			return 1;
		} 
		else {  // quando nome é igual o return era zero, aí entra aqui na comparação do salário
			if (this.getSalario() < f.getSalario()) {
				return 1;
			} 
			else if (this.getSalario() > f.getSalario()) {
				return -1;
			} 
			else {
				return 0;  // se tiver mais uma comparação adiciona no return 0, depois que deu verdadeiro para salario
			}
		}
	}
}
