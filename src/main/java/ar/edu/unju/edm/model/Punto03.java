package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;
@Component
public class Punto03{

	private int numero1;
	
	
	public Punto03() {
		// TODO Auto-generated constructor stub
	}
	
	public  Punto03(int numero1) {
		
		this.numero1=numero1;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	public String obtenerPar() {
		
		if(this.numero1 %2 == 0) {
			return "Es un un Numero Par";
		}
		else {
			return "Es un Numero Impar";
		}
	}
	
}
