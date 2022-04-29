package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

public class Punto12 {
       private int num1;
    public Punto12() {
   		// TODO Auto-generated constructor stub
   	}
	public Punto12(int num1) {
		super();
		this.num1 = num1;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	//PUNTO 12
	public String calculoTiempo() {
		double tiempo = Math.sqrt((2*num1)/9.81);
		return Double.toString(tiempo);
	}
    
}
