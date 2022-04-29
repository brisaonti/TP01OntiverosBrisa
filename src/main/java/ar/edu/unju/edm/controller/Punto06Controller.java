package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto06;


@Controller

public class Punto06Controller {
	@Autowired
	Punto06 nuevoAlumno ;
	@GetMapping("/calculoAlumno")//METODOS dentro del controler atraves de un get mapping, muchos metodos
	public ModelAndView getBisiestoPage (@RequestParam (name = "num1")int num1){
	   String resultadoAlumno= "";
	   ModelAndView anahi=new ModelAndView("resultadoAlumno") ;
	   nuevoAlumno.setNumero1(num1);
	   resultadoAlumno= nuevoAlumno.Calificacion();
	   anahi.addObject("resultadoAlumno", resultadoAlumno);
	   anahi.addObject("numero", num1);
	   return anahi;
}
}