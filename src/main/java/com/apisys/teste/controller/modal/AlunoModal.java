package com.apisys.teste.controller.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.apisys.teste.domain.Aluno;
import com.apisys.teste.service.AlunoService;

@Controller
public class AlunoModal {

	
	@Autowired
	AlunoService alunoService;
	
	@GetMapping(value="/edit-aluno/{id}")
	public String getAlunoModal(@PathVariable("id") int id, ModelMap model) {
		
		Aluno aluno = alunoService.findById(id);
		
		model.addAttribute("aluno", aluno);
		
		return "modal/edit-aluno :: edit-aluno";
	}
}
