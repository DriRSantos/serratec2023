package com.residencia.biblioteca.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.dto.UsuarioDTO;
import com.residencia.biblioteca.dto.UsuarioDtoSave;
import com.residencia.biblioteca.entities.Usuario;
import com.residencia.biblioteca.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<UsuarioDTO> findAllUsuarios() {
		List<Usuario> listUsuarios = usuarioRepository.findAll();
		List<UsuarioDTO> listUsuDTO = modelMapper.map(listUsuarios, new TypeToken<List<UsuarioDTO>>(){}.getType());		
//		List<UsuarioDTO> listUsuDTO = Arrays.asList(modelMapper.map(listUsuarios, UsuarioDTO[].class));
		return listUsuDTO;
	}
	
	public UsuarioDTO getUsuarioById(Integer id) {
		Usuario uEntity = usuarioRepository.findById(id).orElse(null);
		UsuarioDTO uDto = modelMapper.map(uEntity, UsuarioDTO.class);
		return uDto;
		 
	}
	
	public UsuarioDtoSave saveUsuario(UsuarioDtoSave usuarioDtoSave) {
		Usuario usuario = modelMapper.map(usuarioDtoSave, Usuario.class);				
		Usuario novoUsuario = usuarioRepository.save(usuario);
		return modelMapper.map(novoUsuario, UsuarioDtoSave.class);
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
