package br.com.generation.spring_lista01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping
	@RequestMapping("/skillsmindsets")
	public String skillsAndMindsets() {
		return "Habilidades e mentalidades que usei para realizar essa atividade: Persistência, proatividade e mentalidade de crescimento.";
	}
	
	@GetMapping
	@RequestMapping("/todo")
	public String toDo() {
		return "Objetivos de aprendizagem para essa semana: MVC, Git, Git work flow, JPA, Spring.";
	}
	
}
