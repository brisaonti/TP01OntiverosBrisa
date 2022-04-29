package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Factorial;

@Controller
public class Punto01Controller {
	 
	@Autowired
	Factorial nuevoFactorial;
	
	@GetMapping("/calculoFactorial")//METODOS dentro del controler atraves de un get mapping, muchos metodos
	public String getFactorialPage (@RequestParam (name = "num1")int num1, Model model){
	   int resultadoF = 0;
	   nuevoFactorial.setNum1(num1);
	   resultadoF = nuevoFactorial.resolverFactorial();
	   model.addAttribute("resultadoF", resultadoF);
	   model.addAttribute("numero", num1);
	   return "resultadoFactorial";
}
}