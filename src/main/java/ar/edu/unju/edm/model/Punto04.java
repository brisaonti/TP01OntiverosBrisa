package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

public class Punto04{

	private int numero1;
	
	
	public Punto04() {
		// TODO Auto-generated constructor stub
	}
	
	public  Punto04(int numero1) {
		
		this.numero1=numero1;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	public String obtenerMes() {
		
		if(this.numero1>0 && this.numero1<=12) {
			return "si es un mes del Año";
		}
		else {
			return "no pertenece a un mes del Año";
		}
	}
	
}
