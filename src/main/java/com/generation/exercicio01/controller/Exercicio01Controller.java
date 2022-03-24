package com.generation.exercicio01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello-world")

public class Exercicio01Controller {

	
	@GetMapping	
	public String helloworld() {
		return " Hello World!! " ;

}
		@GetMapping("/bsm")	
	public String bsmgeneration() {
		return " Introdução às Habilidades Comportamentais e Mentalidades, \n Metalidade de Crescimento, \n Persistência, \n Responsabilidade Pessoal, \n Orientação ao Futuro, \n Comunicação, \n Orientação ao Detalhe, \n Proatividade, \n Trabalho em equipe. " ;
}

		@GetMapping("/bsm/objetivo")	
		public String objetivosdasmena() {
			return " Os objetivos dessa semana são: Persistência e muita orientação ao detalhe ";
}
}