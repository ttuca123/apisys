package com.apisys.teste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Artur
 * 
 * @since 2018
 * @version 1.0
 */

@Controller
public class AdminController {

	
	@RequestMapping("/")
	public String listarPainelAdmin() {
	
		return "painel";
	}
}
