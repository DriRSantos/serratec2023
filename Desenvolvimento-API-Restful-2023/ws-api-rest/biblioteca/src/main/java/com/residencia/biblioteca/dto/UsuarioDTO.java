package com.residencia.biblioteca.dto;

public class UsuarioDTO {

	private Integer user_id;
	private String user_nome;
	private String user_email;

	public UsuarioDTO() {

	}

	public UsuarioDTO(Integer user_id, String user_nome, String user_email) {
		this.user_id = user_id;
		this.user_nome = user_nome;
		this.user_email = user_email;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_nome() {
		return user_nome;
	}

	public void setUser_nome(String user_nome) {
		this.user_nome = user_nome;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
}
