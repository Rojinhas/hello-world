package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping("/")

public class HelloWorldController {

	@GetMapping ("/hello-world")
	public String helloworld() {
		return "Hello World!!!";
	}

	@GetMapping("/bsms")
	public ArrayList<String> getBSMs() {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Persistência");
		myList.add("Mentalidade de crescimento");
		myList.add("Atenção aos detalhes");
		myList.add("Comunicação");
		myList.add("Proatividade");
		myList.add("Orientação ao futuro");
		return myList;
	}

	@GetMapping("/objetivos")
	public ArrayList<String> geObjetivos() {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Melhorar atenção aos detalhes");
		myList.add("Praticar os códigos");
		myList.add("Reforçar aprendizagem sobre SQL");
		myList.add("Me manter em dia em relação ao conteúdo");
		return myList;
	}
}