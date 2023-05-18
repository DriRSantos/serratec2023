package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.dto.AlunoResDTO;
import com.residencia.biblioteca.entities.Aluno;
import com.residencia.biblioteca.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	public List<Aluno> getAllAlunos() {
		return alunoRepository.findAll();		
	}
	
	public Aluno getAlunoById(Integer id) {
		return alunoRepository.findById(id).orElse(null);
	}
	
	public AlunoResDTO getAlunoResById(Integer id) {
		Aluno aluno = alunoRepository.findById(id).orElse(null);
		return new AlunoResDTO(aluno.getNome(), aluno.getCpf());		
	}
	
	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
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
			} 
			else {
				return true;
			}

		} 
		else {
			return false;
		}
//		
//		Aluno alunoDeleted = alunoRepository.findById(id).orElse(null);
//		if (alunoDeleted != null) {
//			alunoRepository.deleteById(id);
//			return true;
//		}
//		else {
//			return false;
//		}
		
	}
}
