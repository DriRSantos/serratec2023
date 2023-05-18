package com.residencia.biblioteca.dto;

import java.util.Date;

public class EmprestimoResDTO {

	private Date dataEmprestimo;
	private Date dataEntrega;
	private String nomeLivro;

	public EmprestimoResDTO() {
		super();
	}

	public EmprestimoResDTO(Date dataEmprestimo, Date dataEntrega, String nomeLivro) {
		super();
		this.dataEmprestimo = dataEmprestimo;
		this.dataEntrega = dataEntrega;
		this.nomeLivro = nomeLivro;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
}
