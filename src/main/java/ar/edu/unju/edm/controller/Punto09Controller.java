package ar.edu.unju.edm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.puntowhile;
@Controller

public class Punto09Controller {
	@Autowired
	puntowhile punto08;
	
	@GetMapping("/calculoFuuu")//METODOS dentro del controler atraves de un get mapping, muchos metodos
	public ModelAndView getcalculoFor(@RequestParam (name = "num1") String numero){
	   punto08.setNum1(Integer.valueOf(numero));
	   String resultadoFf = punto08.contarFor();
	   ModelAndView modelView = new ModelAndView("resultadofor") ;
	   modelView.addObject("resultadoFf", resultadoFf);
	   modelView.addObject("numero", numero);
	   return modelView;
}
}
