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

import com.apisys.teste.domain.Curso;
import com.apisys.teste.service.CursoService;

@Controller
public class CursoController {
	
	@Autowired
	CursoService cursoService;
		
	
	@RequestMapping(value="/cursos", method = RequestMethod.GET)	
	public ModelAndView listar(Model model) {

		List<Curso> lstCursos = cursoService.getAll();	
		
		ModelAndView mv = new ModelAndView("cursos");
		
		mv.addObject("cursoList", lstCursos);		
		
		return mv;
	}
	
	@RequestMapping(value="/cursos", method=RequestMethod.POST)
	public String salvar(@ModelAttribute Curso curso) {	

		
		cursoService.salvar(curso);		
		
		return "redirect:/cursos";
	}
	
	@RequestMapping(value="/cursos/{id}", method=RequestMethod.POST)
	public String remover(@PathVariable Integer id) {
			
		Curso curso = cursoService.findById(id.longValue());
		
		cursoService.excluir(curso);
				
		return "redirect:/cursos";
	}

}
