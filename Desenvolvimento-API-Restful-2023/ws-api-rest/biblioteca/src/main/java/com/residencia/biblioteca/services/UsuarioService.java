package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.dto.UsuarioDTO;
import com.residencia.biblioteca.entities.Usuario;
import com.residencia.biblioteca.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<UsuarioDTO> findAllUsuarios() {
		List<Usuario> listUsuariosDTO = usuarioRepository.findAll();
		return 
		
	}
	
	public Usuario getUsuarioById(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	public Usuario saveUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario updateUsuario(Usuario usuario, Integer id) {
//		emprestimoRepository.findById(id).orElseGet(null);
		return usuarioRepository.save(usuario);
	}
	
	public void deleteUsuario(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public Boolean delUsuario(Integer id) {
		usuarioRepository.deleteById(id);
		if(null == usuarioRepository.findById(id).orElse(null)) {
			return true;
		}
		else {
			return false;
		}
	}	
}
