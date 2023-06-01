package com.grupoone.instrutor.dto;

import java.util.HashSet;
import java.util.Set;

import com.grupoone.instrutor.entities.Role;

public class UserDTO {

    private Integer id;
    private String username;
    private String email;
    private Set<String> roles = new HashSet<>();

    public UserDTO() {
        super();
    }

    public UserDTO(Integer id, String username, String email) {
        super();
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}    
}
