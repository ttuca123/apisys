package com.apisys.teste.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.apisys.teste.enu.EnuSituacaoMatricula;

/**
 * 
 * @author Artur
 * 
 * @since 2018
 * @version 1.0
 */

@Entity
@Table(name="alunos")
public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",  columnDefinition = "serial not null")
	private Long id;
	
	@Column(name="nome", nullable= false)
	private String nome;	
	
	@Column(name="matricula", unique=true)
	private int matricula;
	
	@Column(name="semestre")
	private int semestre;	
	
	@Column(name="situacao_matricula")
	private int situacaoMatricula;
	
	
	@OneToOne
	@JoinColumn(name="curso_aluno")
	private Curso curso;
	
	@Transient
	private  String descSituacaoMatricula;


	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	


	public int getSemestre() {
		return semestre;
	}


	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}


	

	public Curso getCurso() {
		if(curso ==null) {
			
			curso = new Curso();
		}
		
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String getDescSituacaoMatricula() {
		
		descSituacaoMatricula = EnuSituacaoMatricula.getDescricao(situacaoMatricula);
		
		return descSituacaoMatricula;
	}

	
	public int getSituacaoMatricula() {
		return situacaoMatricula;
	}


	public void setSituacaoMatricula(int situacaoMatricula) {
		this.situacaoMatricula = situacaoMatricula;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public void setDescSituacaoMatricula(String descSituacaoMatricula) {
		this.descSituacaoMatricula = descSituacaoMatricula;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	

	


	


	


	



	
	
	
	
	
}
