package com.apisys.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.apisys.teste.domain.Aluno;
import com.apisys.teste.domain.Curso;
import com.apisys.teste.service.AlunoService;


@Controller

public class AlunoController {

	@Autowired
	AlunoService alunoService;
	
	
	@RequestMapping(value="/alunos", method = RequestMethod.GET)	
	public ModelAndView listar(Model model) {

		List<Aluno> lstAlunos = alunoService.getAll();
		
		//model.addAttribute("aluno", new Aluno());
		
		//model.addAttribute("curso", new Curso());	
		

		ModelAndView mv = new ModelAndView("alunos");
		
		mv.addObject("alunoList",lstAlunos);		
		
		return mv;
	}
	
	@RequestMapping(value="/alunos", method=RequestMethod.POST)
	public String salvar(@ModelAttribute Aluno aluno) {
			
		alunoService.save(aluno);		
		
		return "redirect:/alunos";
	}
	
	@RequestMapping(value="/alunos/{id}", method=RequestMethod.POST)
	public String remover(@PathVariable int id) {
			
		Aluno aluno = alunoService.findById(id);
		
		alunoService.excluir(aluno);
				
		return "redirect:/alunos";
	}
	
	

}
