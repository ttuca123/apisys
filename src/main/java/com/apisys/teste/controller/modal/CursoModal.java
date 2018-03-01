package com.apisys.teste.controller.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.apisys.teste.domain.Curso;
import com.apisys.teste.service.CursoService;

/**
 * 
 * @author Artur
 * 
 * @since 2018
 * @version 1.0
 */

@Controller
public class CursoModal {
	

	@Autowired
	CursoService cursoService;

	@GetMapping(value = "/edit-curso/{id}")
	public String editarCursoModal(@PathVariable("id") Integer id, Model model) {

		Curso curso = cursoService.findById(id.longValue());

		model.addAttribute("curso", curso);		
		
		return "modal/edit-curso :: edit-curso";
	}

	@GetMapping(value = "/add-curso")
	public String adicionarCursoModal(ModelMap model) {

		model.addAttribute("curso", new Curso());
		
		return "modal/add-curso :: add-curso";
	}

	@GetMapping(value = "/remove-curso/{id}")
	public String removerCursoModal(@PathVariable("id") Integer id, ModelMap model) {

		Curso curso = cursoService.findById(id.longValue());

		model.addAttribute("curso", curso);

		return "modal/remove-curso :: remove-curso";
	}
}
