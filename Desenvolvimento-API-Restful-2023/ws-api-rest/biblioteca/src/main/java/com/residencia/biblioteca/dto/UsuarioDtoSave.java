package com.residencia.biblioteca.dto;

import java.util.Objects;

public class UsuarioDtoSave {

	private Integer user_id;
	private String user_nome;
	private String user_email;
	private String user_password;

	public UsuarioDtoSave() {
		super();
	}

	public UsuarioDtoSave(Integer user_id, String user_nome, String user_email, String user_password) {
		super();
		this.user_id = user_id;
		this.user_nome = user_nome;
		this.user_email = user_email;
		this.user_password = user_password;
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

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioDtoSave other = (UsuarioDtoSave) obj;
		return Objects.equals(user_id, other.user_id);
	}

}
