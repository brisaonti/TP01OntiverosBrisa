package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto04;


@Controller

public class Punto04Controller {
	@Autowired
	Punto04 nuevoMes ;
	@GetMapping("/calculoMes")//METODOS dentro del controler atraves de un get mapping, muchos metodos
	public ModelAndView getBisiestoPage (@RequestParam (name = "num1")int num1){
	   String resultadoM = "";
	   ModelAndView anahi=new ModelAndView("resultadoYear") ;
	   nuevoMes.setNumero1(num1);
	   resultadoM= nuevoMes.obtenerMes();
	   anahi.addObject("resultadoM", resultadoM);
	   anahi.addObject("numero", num1);
	   return anahi;
}
}