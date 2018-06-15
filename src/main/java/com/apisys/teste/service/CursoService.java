package com.apisys.teste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apisys.teste.domain.Curso;
import com.apisys.teste.repository.CursoRepository;

/**
 * 
 * @author Artur
 * 
 * @since 2018
 * @version 1.0
 * 
 * Classe responsável pelo negócio relacionado ao Curso
 */

@Service
public class CursoService {

	@Autowired
	CursoRepository repo;
	
	public List<Curso> getAll(){
		
		return repo.findAll();
	}
	
	public Optional<Curso> findById(Long id){
		
		return repo.findById(id);
	}
	
	public void salvar (Curso curso){
		
		repo.save(curso);	
		
	}
	
	public void excluir (Curso curso){
		
		repo.delete(curso);	
		
	}
}
