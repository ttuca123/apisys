package com.apisys.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apisys.teste.domain.Curso;
import com.apisys.teste.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	CursoRepository repo;
	
	public List<Curso> getAll(){
		
		return repo.findAll();
	}
	
	public Curso findById(Long id){
		
		return repo.findOne(id);
	}
	
	public void salvar (Curso curso){
		
		repo.save(curso);	
		
	}
	
	public void excluir (Curso curso){
		
		repo.delete(curso);	
		
	}
}
