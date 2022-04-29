package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Bisiesto;


@Controller

public class Punto02Controller {
	@Autowired
	Bisiesto nuevoBisiesto ;
	
	//@GetMapping("/calculoBisiesto")//METODOS dentro del controler atraves de un get mapping, muchos metodos
	//public String getFactorialPage (@RequestParam (name = "num1")int num1, Model model){
	  // String resultadoB = "";
	   //nuevoBisiesto.setAnio(num1);
	   //resultadoB = nuevoBisiesto.calcularBisiesto();
	   //model.addAttribute("resultadoB", resultadoB);
	   //model.addAttribute("numero", num1);
	   //return "resultadoBisiesto";
//}
	@GetMapping("/calculoBisiesto")//METODOS dentro del controler atraves de un get mapping, muchos metodos
	public ModelAndView getBisiestoPage (@RequestParam (name = "num1")int num1){
	   String resultadoB = "";
	   ModelAndView anahi=new ModelAndView("resultadoBisiesto") ;
	   nuevoBisiesto.setAnio(num1);
	   resultadoB = nuevoBisiesto.calcularBisiesto();
	   anahi.addObject("resultadoB", resultadoB);
	   anahi.addObject("numero", num1);
	   return anahi;
}
}
