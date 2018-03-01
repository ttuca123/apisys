package com.apisys.teste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CursoController {
	
	@RequestMapping("/cursos")
	public String listar() {
	
		return "cursos";
	}

}
