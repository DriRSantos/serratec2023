package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
//		return alunoRepository.findById(id).get();
		return alunoRepository.findById(id).orElse(null);
	}
	
	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public Aluno updateAluno(Aluno aluno, Integer id) {
//		alunoRepository.findById(id);
		if(id == aluno.getNumeroMatriculaAluno()) {
			return alunoRepository.save(aluno);
		}
		else {
			return null;
		}
	}
	
	public void deleteAluno(Integer id) {
		alunoRepository.deleteById(id);
//		Aluno alunoDeleted = alunoRepository.findById(id).orElse(null);		
//		System.out.println("Deleted! " + alunoDeleted.getNome());
	}
	
	public Boolean delAluno(Integer id) {
		alunoRepository.deleteById(id);
		Aluno alunoDeleted = alunoRepository.findById(id).orElse(null);
		if(null == alunoDeleted) {
			return true;
		}
		else {
			return false;
		}			
	}
}
