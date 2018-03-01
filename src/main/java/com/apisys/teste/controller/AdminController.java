package com.apisys.teste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	
	@RequestMapping("/")
	public String listarPainelAdmin() {
	
		return "painel";
	}
}
