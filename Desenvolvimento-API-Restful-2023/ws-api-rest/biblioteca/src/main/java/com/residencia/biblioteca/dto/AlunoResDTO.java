package com.residencia.biblioteca.dto;

public class AlunoResDTO {

	private String nome; 
	private String cpf;
	
	public AlunoResDTO() {
		super();
	}
	
	public AlunoResDTO(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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
}
