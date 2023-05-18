package com.residencia.biblioteca.dto;

import java.util.Date;

public class EmprestimoResDTO {
	
	private Date dataEmprestimo;
	private Date dataEntrega;
	private LivroResumidoDTO livroResDTO;
	
	public EmprestimoResDTO() {
		super();
	}

	public EmprestimoResDTO(Date dataEmprestimo, Date dataEntrega, LivroResumidoDTO livroResDTO) {
		super();
		this.dataEmprestimo = dataEmprestimo;
		this.dataEntrega = dataEntrega;
		this.livroResDTO = livroResDTO;
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

	public LivroResumidoDTO getLivroResDTO() {
		return livroResDTO;
	}

	public void setLivroResDTO(LivroResumidoDTO livroResDTO) {
		this.livroResDTO = livroResDTO;
	}	
}
