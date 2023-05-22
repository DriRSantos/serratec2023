package com.residencia.biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.dto.AlunoDtoSave;
import com.residencia.biblioteca.dto.AlunoResDTO;
import com.residencia.biblioteca.dto.EmprestimoResDTO;
import com.residencia.biblioteca.dto.LivroResumidoDTO;
import com.residencia.biblioteca.entities.Aluno;
import com.residencia.biblioteca.entities.Emprestimo;
import com.residencia.biblioteca.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository alunoRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	public List<AlunoDtoSave> getAllAlunos() {
		List<Aluno> listAlunos = alunoRepository.findAll();
		List<AlunoDtoSave> alunoDTO = modelMapper.map(listAlunos, new TypeToken<List<AlunoDtoSave>>() {}.getType());
//		List<AlunoDtoSave> listUsuDTO = Arrays.asList(modelMapper.map(listAlunos, AlunoDtoSave[].class));		
		return alunoDTO;
	}
	
	public AlunoDtoSave getAlunoById(Integer id) {
		Aluno alunoEntity = alunoRepository.findById(id).orElse(null);
		AlunoDtoSave alunoDTO = modelMapper.map(alunoEntity, AlunoDtoSave.class);
		return alunoDTO;
	}

	public AlunoResDTO getAlunoResEmpDto(Integer id) {
		Aluno aluno = alunoRepository.findById(id).orElse(null);
		if (aluno == null) {
			return null;
		}

		AlunoResDTO alunoResDto = new AlunoResDTO(aluno.getNome(), aluno.getCpf());

		List<EmprestimoResDTO> listaEmpResDTO = new ArrayList<>();
		for (Emprestimo emprestimo : aluno.getEmprestimos()) {
			EmprestimoResDTO empResDto = new EmprestimoResDTO();
			empResDto.setDataEmprestimo(emprestimo.getDataEmprestimo());
			empResDto.setDataEntrega(emprestimo.getDataEntrega());

			LivroResumidoDTO livroResDto = new LivroResumidoDTO();
			if (emprestimo.getLivro() == null) {
				livroResDto.setNomeLivro(null);
			} 
			else {
				livroResDto.setNomeLivro(emprestimo.getLivro().getNomeLivro());
			}
			
			empResDto.setLivroResumidoDTO(livroResDto);
			listaEmpResDTO.add(empResDto);
		}

		alunoResDto.setListaEmpResDTO(listaEmpResDTO);
		return alunoResDto;
	}

	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	
	public AlunoDtoSave saveAlunoDto(AlunoDtoSave alunoDtoSave) {
		Aluno aluno = modelMapper.map(alunoDtoSave, Aluno.class);				
		Aluno novoAluno = alunoRepository.save(aluno);	
		return modelMapper.map(novoAluno, AlunoDtoSave.class);
	}
	
	public Aluno updateAluno(Aluno aluno, Integer id) {
//		alunoRepository.findById(id);
		return alunoRepository.save(aluno);
	}

	public Boolean deleteAluno(Integer id) {
		Aluno alunoDeleted = alunoRepository.findById(id).orElse(null);
		if (alunoDeleted != null) {
			alunoRepository.deleteById(id);
			alunoDeleted = alunoRepository.findById(id).orElse(null);
			if (alunoDeleted != null) {
				return false;
			} else {
				return true;
			}

		} else {
			return false;
		}
	}
}
