package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto08;
@Controller

public class Punto08Controller {
	@Autowired
	Punto08 punto08;
	
	@GetMapping("/calculoMultiplos")//METODOS dentro del controler atraves de un get mapping, muchos metodos
	public ModelAndView getcalculoMultiplos(@RequestParam (name = "num1") String numero){
	   punto08.setNum1(Integer.valueOf(numero));
	   String resultadoM = punto08.generarMultiplos();
	   ModelAndView modelView = new ModelAndView("resultadoMultiplo") ;
	   modelView.addObject("resultadoM", resultadoM);
	   modelView.addObject("numero", numero);
	   return modelView;
}
}
