package com.residencia.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.residencia.biblioteca.entities.Usuario;
import com.residencia.biblioteca.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAllUsuarios() {
		return new ResponseEntity<>(usuarioService.findAllUsuarios(),
				HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable Integer id) {
		if(usuarioService.getUsuarioById(id) == null) {
			return new ResponseEntity<>(null,
					HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(usuarioService.getUsuarioById(id),
					HttpStatus.OK);
		}		
	}
	
	@PostMapping
	public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario) {
		return new ResponseEntity<>(usuarioService.saveUsuario(usuario), HttpStatus.CREATED);		
	}
	
	@PutMapping
	public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario, Integer id) {
		return new ResponseEntity<>(usuarioService.updateUsuario(usuario, id),
				HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delUsuario(@PathVariable Integer id) {							
		if(usuarioService.delUsuario(id) == true) {
			return new ResponseEntity<>(usuarioService.delUsuario(id), HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(null,
					HttpStatus.NOT_MODIFIED);
		}
	}			
}
