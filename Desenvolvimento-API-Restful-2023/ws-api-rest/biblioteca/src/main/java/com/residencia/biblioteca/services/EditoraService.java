package com.residencia.biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.dto.EditoraResumidaDTO;
import com.residencia.biblioteca.dto.LivroResumidoDTO;
import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.repositories.EditoraRepository;

@Service
public class EditoraService {

	@Autowired
	EditoraRepository editoraRepository;
	
	public List<Editora> getAllEditoras() {
		return editoraRepository.findAll();		
	}
	
	public Editora getEditoraById(Integer id) {
//		return alunoRepository.findById(id).get();
		return editoraRepository.findById(id).orElse(null);
	}
	
	public EditoraResumidaDTO getEditoraDtoById(Integer id) {
	 	Editora editora = editoraRepository.findById(id).orElse(null);
		EditoraResumidaDTO editoraDTO = new EditoraResumidaDTO();
		
		if(null == editora) {
			return null;
		}		
		editoraDTO.setCodigoEditora(editora.getCodigoEditora());
		editoraDTO.setNome(editora.getNome());
		
		List<LivroResumidoDTO> listaLivrosResDTO = new ArrayList<>();
		for(Livro livro : editora.getLivros()) {
//			LivroResumidoDTO livroResDTO = new LivroResumidoDTO();
//			livroResDTO.setNomeLivro(livro.getNomeLivro());
//			livroResDTO.setNomeAutor(livro.getNomeAutor());
//			livroResDTO.setDataLancamento(livro.getDataLancamento());
			listaLivrosResDTO.add(new LivroResumidoDTO(livro.getNomeLivro(), livro.getNomeAutor(),livro.getDataLancamento()));
		}
		
		editoraDTO.setListaLivrosResDTO(listaLivrosResDTO);
		
		return editoraDTO;
		
//		Editora editora = editoraRepository.findById(id).orElse(null);
//		
//		if(null == editora) {
//			return null;
//		}
//		
//		EditoraResumidaDTO editoraDTO = new EditoraResumidaDTO(editora.getCodigoEditora(), editora.getNome());
//		return editoraDTO;		
	}
	
	public Editora saveEditora(Editora editora) {
		return editoraRepository.save(editora);
	}
	
	public Editora updateEditora(Editora editora, Integer id) {
//		alunoRepository.findById(id);
		return editoraRepository.save(editora);
	}
	
	public void deleteEditora(Integer id) {
		editoraRepository.deleteById(id);
	}
	
	public Boolean delEditora(Integer id) {
		editoraRepository.deleteById(id);
		Editora editoraDeleted = editoraRepository.findById(id).orElse(null);
		if(null == editoraDeleted) {
			return true;
		}
		else {
			return false;
		}			
	}	
}