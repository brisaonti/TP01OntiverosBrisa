package ar.edu.unju.edm.model;
import org.springframework.stereotype.Component;
@Component

public class Punto06{
	
	private int numero1;
	
	public Punto06() {
		// TODO Auto-generated constructor stub
	}
	
	public Punto06(int numero1) {
		
		this.numero1=numero1;
		
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	
	public String Calificacion() {
		
		if (this.numero1==6) {
			
			return "Alumno regulariza";
		}
		else if (this.numero1>=7 && this.numero1<=10) {
			
			return "El alumno promociona";
			
		}
		else if (this.numero1<6 && this.numero1>=1) {
			
			return "el alumno desaprueba";
		}
		
		else {
			return "Valor ingresado no permitido";
		}
			
			
		}	

	

}
