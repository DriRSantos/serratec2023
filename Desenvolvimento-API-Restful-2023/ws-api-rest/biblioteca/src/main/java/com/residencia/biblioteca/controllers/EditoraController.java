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

import com.residencia.biblioteca.dto.EditoraResumidaDTO;
import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.services.EditoraService;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

	@Autowired
	EditoraService editoraService;
	
	@GetMapping
	public ResponseEntity<List<Editora>> getAllEditoras() {
		return new ResponseEntity<>(editoraService.getAllEditoras(),
				HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Editora> getEditoraById(@PathVariable Integer id) {
		if(editoraService.getEditoraById(id) == null) {
			return new ResponseEntity<>(null,
					HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(editoraService.getEditoraById(id),
					HttpStatus.OK);
		}		
	}
	
	@GetMapping("/dto/{id}")
	public ResponseEntity<EditoraResumidaDTO> getEditoraDtoById(@PathVariable Integer id) {
		EditoraResumidaDTO editoraDtoResponse = editoraService.getEditoraDtoById(id);
		if(editoraDtoResponse == null) {
			return new ResponseEntity<>(null,
					HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(editoraDtoResponse,
					HttpStatus.OK);
		}	
	}
	
	
	@PostMapping
	public ResponseEntity<Editora> saveEditora(@RequestBody Editora editora) {
		return new ResponseEntity<>(editoraService.saveEditora(editora), HttpStatus.CREATED);		
	}
	
//	@PutMapping("/{id}")
	@PutMapping
	public ResponseEntity<Editora> updateEditora(@RequestBody Editora editora, Integer id) {
		return new ResponseEntity<>(editoraService.updateEditora(editora, id),
				HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delEditora(@PathVariable Integer id) {							
		if(editoraService.delEditora(id) == true) {
			return new ResponseEntity<>(editoraService.delEditora(id), HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(null,
					HttpStatus.NOT_MODIFIED);
		}
	}		
}
