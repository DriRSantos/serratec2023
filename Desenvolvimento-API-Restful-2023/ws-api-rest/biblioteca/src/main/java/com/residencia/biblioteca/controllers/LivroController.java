package com.residencia.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	LivroService livroService;
	
	public List<Livro> findAllLivros() {
		return livroService.findAllLivros();
	}
	
	public Livro getLivroById(Integer id) {
		return livroService.getLivroById(id);
	}
	
	public Livro saveLivro(Livro livro) {
		return livroService.saveLivro(livro);
	}
	
	public Livro updateLivro(Livro livro, Integer id) {
		return livroService.updateLivro(livro, id);
	}
	
//	public void deleteLivro(Integer id) {
//		livroService.deleteLivro(id);
//	}
	
	public Boolean delLivro(Integer id) {
		return livroService.delLivro(id);
	}	
}
