package com.apisys.teste.controller.modal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.apisys.teste.domain.Aluno;
import com.apisys.teste.domain.Curso;
import com.apisys.teste.service.AlunoService;
import com.apisys.teste.service.CursoService;

@Controller
public class AlunoModal {

	@Autowired
	AlunoService alunoService;

	@Autowired
	CursoService cursoService;

	@GetMapping(value = "/edit-aluno/{id}")
	public String editarAlunoModal(@PathVariable("id") Integer id, Model model) {

		Aluno aluno = alunoService.findById(id.longValue());

		model.addAttribute("aluno", aluno);	
		
		List<Curso> lstCurso = new ArrayList<Curso>();

		lstCurso = cursoService.getAll();

		model.addAttribute("cursoList", lstCurso);

		return "modal/edit-aluno :: edit-aluno";
	}

	@GetMapping(value = "/add-aluno")
	public String adicionarAlunoModal(ModelMap model) {

		model.addAttribute("aluno", new Aluno());

		List<Curso> lstCurso = new ArrayList<Curso>();

		lstCurso = cursoService.getAll();

		model.addAttribute("cursoList", lstCurso);

		return "modal/add-aluno :: add-aluno";
	}

	@GetMapping(value = "/remove-aluno/{id}")
	public String removerAlunoModal(@PathVariable("id") Integer id, ModelMap model) {

		Aluno aluno = alunoService.findById(id.longValue());

		model.addAttribute("aluno", aluno);

		return "modal/remove-aluno :: remove-aluno";
	}
}
