package com.apisys.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.apisys.teste.domain.Aluno;
import com.apisys.teste.domain.Curso;
import com.apisys.teste.service.AlunoService;
import com.apisys.teste.service.CursoService;

/**
 * 
 * @author Artur
 *
 */

@Controller
public class AlunoController {

	@Autowired
	AlunoService alunoService;
		

	
	
	@RequestMapping(value="/alunos", method = RequestMethod.GET)	
	public ModelAndView listar(Model model) {

		List<Aluno> lstAlunos = alunoService.getAll();	
		
		ModelAndView mv = new ModelAndView("alunos");
		
		mv.addObject("alunoList",lstAlunos);		
		
		return mv;
	}
	
	@RequestMapping(value="/alunos", method=RequestMethod.POST)
	public String salvar(@ModelAttribute Aluno aluno) {	

		
		alunoService.salvar(aluno);		
		
		return "redirect:/alunos";
	}
	
	@RequestMapping(value="/alunos/{id}", method=RequestMethod.POST)
	public String remover(@PathVariable Integer id) {
			
		Aluno aluno = alunoService.findById(id.longValue());
		
		alunoService.excluir(aluno);
				
		return "redirect:/alunos";
	}
	
	

}
