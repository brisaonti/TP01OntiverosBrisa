package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto03;


@Controller

public class Punto03Controller {
	@Autowired
	Punto03 nuevoPar ;
	@GetMapping("/calculoPar")//METODOS dentro del controler atraves de un get mapping, muchos metodos
	public ModelAndView getBisiestoPage (@RequestParam (name = "num1")int num1){
	   String resultadoP = "";
	   ModelAndView anahi=new ModelAndView("resultadoPar") ;
	   nuevoPar.setNumero1(num1);
	   resultadoP= nuevoPar.obtenerPar();
	   anahi.addObject("resultadoP", resultadoP);
	   anahi.addObject("numero", num1);
	   return anahi;
}
}
