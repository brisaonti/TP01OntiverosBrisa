package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto12;
@Controller

public class Punto12Controller {
	@Autowired
	Punto12 tiempo;
	
	@GetMapping("/calculoTiempo")
	public ModelAndView getcalculoTiempo(@RequestParam (name = "num1") String numero){
	   tiempo.setNum1(Integer.valueOf(numero));
	   String resultadoT = tiempo.calculoTiempo();
	   ModelAndView modelView = new ModelAndView("resultadoTiempo") ;
	   modelView.addObject("resultadoT", resultadoT);
	   modelView.addObject("numero", numero);
	   return modelView;
}
}
