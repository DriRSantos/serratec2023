package com.residencia.biblioteca.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.residencia.biblioteca.dto.EditoraResumidaDTO;
import com.residencia.biblioteca.dto.LivroResumidoDTO;
import com.residencia.biblioteca.dto.ReceitaWsDTO;
import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.repositories.EditoraRepository;

@Service
public class EditoraService {

	@Autowired
	EditoraRepository editoraRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
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
			listaLivrosResDTO.add(new LivroResumidoDTO(livro.getNomeLivro(), livro.getNomeAutor(),livro.getDataLancamento()));
		}
		
		editoraDTO.setListaLivrosResDTO(listaLivrosResDTO);
		
		return editoraDTO;
	}
	
	public Editora saveEditora(Editora editora) {
		return editoraRepository.save(editora);
	}
	
	public EditoraResumidaDTO saveEditoraDto(EditoraResumidaDTO editoraResDto) {
		
		ReceitaWsDTO recDto = consultaApiReceitaWs(editoraResDto.getCnpj());
		System.out.println("ReceitaWsDTO: " + recDto);
		
		Editora editora = modelMapper.map(editoraResDto, Editora.class);	
		return modelMapper.map(editoraRepository.save(editora), EditoraResumidaDTO.class);
	}
	
	public Editora updateEditora(Editora editora, Integer id) {
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
	
	private ReceitaWsDTO consultaApiReceitaWs(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		String uri = "https://receitaws.com.br/v1/cnpj/{cnpj}";
		
		Map<String, String> params = new HashMap<>();
		params.put("cnpj", cnpj); // "cnpj" nome dentro {} do uri
		
		ReceitaWsDTO recDto = restTemplate.getForObject(uri, ReceitaWsDTO.class, params);
		return recDto;
	}
}