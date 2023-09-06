package com.vidaplena.vidaplena.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
	
	@GetMapping("/{nome}")
	public String testing (@PathVariable String nome) {
		return "Funcionando! Bem-vindo, " + nome;
	}
}
