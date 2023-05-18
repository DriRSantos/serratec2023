package com.residencia.biblioteca.dto;

import java.util.List;

public class AlunoResDTO {

	private String nome; 
	private String cpf;
	
	private List<EmprestimoResDTO> listaEmpResDTO;
	
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

	public List<EmprestimoResDTO> getListaEmpResDTO() {
		return listaEmpResDTO;
	}

	public void setListaEmpResDTO(List<EmprestimoResDTO> listaEmpResDTO) {
		this.listaEmpResDTO = listaEmpResDTO;
	}		
}
