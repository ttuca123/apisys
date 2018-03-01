package com.apisys.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apisys.teste.domain.Aluno;
import com.apisys.teste.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository repo;
	
	public List<Aluno> getAll(){
		
		return repo.findAll();
	}
	
	public Aluno findById(Long id){
		
		return repo.findOne(id);
	}
	
	public void salvar (Aluno aluno){
		
		
			repo.save(aluno);	
		
		
		
	}
	
	
	
	public void excluir (Aluno aluno){
		
		repo.delete(aluno);	
		
	}
}
