package com.apisys.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apisys.teste.domain.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
