package com.residencia.biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
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

	public List<Aluno> getAllAlunos() {
		return alunoRepository.findAll();
	}
	
	public Aluno getAlunoById(Integer id) {
		return alunoRepository.findById(id).orElse(null);
	}

//	minha solução
//	public AlunoResDTO getAlunoResById(Integer id) {
//		Aluno aluno = alunoRepository.findById(id).orElse(null);
//		
//		if(aluno == null) {
//			return null;
//		}
//	
//		AlunoResDTO alunoResDTO = new AlunoResDTO(aluno.getNome(), aluno.getCpf());
//	
//		List<EmprestimoResDTO> listaEmpResDTO = new ArrayList<>();
//		for(Emprestimo emprestimo : aluno.getEmprestimos()) {
//			// tratar emprestimo.getLivro().getNomeLivro() == null			
//			listaEmpResDTO.add(new EmprestimoResDTO(emprestimo.getDataEmprestimo(), emprestimo.getDataEntrega(), emprestimo.getLivro().getNomeLivro()));
//		}
//		
//		alunoResDTO.setListaEmpResDTO(listaEmpResDTO);
//		return alunoResDTO;
//	}

	// professor em sala
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
			
//			forma resumida com construtor próprio em LivroResumidoDTO
//			listaEmpResDTO.add(new EmprestimoResDTO(emprestimo.getDataEmprestimo(), 
//					emprestimo.getDataEntrega(), new LivroResumidoDTO(emprestimo.getLivro().getNomeLivro())));
		}

		alunoResDto.setListaEmpResDTO(listaEmpResDTO);
		return alunoResDto;
	}

	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	
	public AlunoDtoSave saveAlunoDto(AlunoDtoSave alunoDtoSave) {
//		Aluno aluno = new Aluno();
//		aluno.setNome(alunoDtoSave.getNome());
//		aluno.setDataNascimento(alunoDtoSave.getDataNascimento());
//		aluno.setCpf(alunoDtoSave.getCpf());
//		aluno.setLogradouro(alunoDtoSave.getLogradouro());
//		aluno.setNumeroLogradouro(alunoDtoSave.getNumeroLogradouro());
//		aluno.setComplemento(alunoDtoSave.getComplemento());
//		aluno.setBairro(alunoDtoSave.getBairro());
//		aluno.setCidade(alunoDtoSave.getCidade());
//	
//		Aluno novoAluno = alunoRepository.save(aluno);
//		
//		AlunoDtoSave novoAlunoDto = new AlunoDtoSave(); 
//		novoAlunoDto.setNome(novoAluno.getNome());
//		novoAlunoDto.setDataNascimento(novoAluno.getDataNascimento());
//		novoAlunoDto.setCpf(novoAluno.getCpf());
//		novoAlunoDto.setLogradouro(novoAluno.getLogradouro());
//		novoAlunoDto.setNumeroLogradouro(novoAluno.getNumeroLogradouro());
//		novoAlunoDto.setComplemento(novoAluno.getComplemento());
//		novoAlunoDto.setBairro(novoAluno.getBairro());
//		novoAlunoDto.setCidade(novoAluno.getCidade());
//		novoAlunoDto.setNumeroMatriculaAluno(novoAluno.getNumeroMatriculaAluno());
		
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
