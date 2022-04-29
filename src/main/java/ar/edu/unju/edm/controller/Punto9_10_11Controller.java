package ar.edu.unju.edm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto9_10_11;
@Controller

public class Punto9_10_11Controller{
	@Autowired
	Punto9_10_11 variable;
	//CONTROLLER PUNTO 9
	@GetMapping("/calculoF")
	public ModelAndView getcalculoFor(@RequestParam (name = "num1") String numero){
	   variable.setNum1(Integer.valueOf(numero));
	   String resultadoF = variable.contarFor();
	   ModelAndView modelView = new ModelAndView("resultadofor") ;
	   modelView.addObject("resultadoF", resultadoF);
	   modelView.addObject("numero", numero);
	   return modelView;
	}
	//CONTROLLER PUNTO 10
   @GetMapping("/calculoW")
   public ModelAndView getcalculoWhile(@RequestParam (name = "num1") String numero){
		   variable.setNum1(Integer.valueOf(numero));
		   String resultadoW = variable.contarWhile();
		   ModelAndView modelView = new ModelAndView("resultadoWhile") ;
		   modelView.addObject("resultadoW", resultadoW);
		   modelView.addObject("numero", numero);
		   return modelView;
     }
   //CONTROLLER PUNTO 10
   @GetMapping("/calculoD")
   public ModelAndView getcalculoDoWhile(@RequestParam (name = "num1") String numero){
		   variable.setNum1(Integer.valueOf(numero));
		   String resultadoD = variable.contarDoWhile();
		   ModelAndView modelView = new ModelAndView("resultadoDoWhile") ;
		   modelView.addObject("resultadoD", resultadoD);
		   modelView.addObject("numero", numero);
		   return modelView;
     }
}