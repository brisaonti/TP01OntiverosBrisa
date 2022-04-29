package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Factorial {
	//atributos
	private Integer num1;
	
	//constructores
	public Factorial() {
		// TODO Auto-generated constructor stub
	}
	public Factorial(Integer num1) {
		super();
		this.num1 = num1;
	}
	
	//getter y setter
	public Integer getNum1() {
		return num1;
	}
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	
	//otros metodos
	/*
	public int resolverFactorial(){
		int num=1;
		
		for( int i = 1; i == num1; i++) {
			num*= i;
		} 
		return num;
	}*/
   public int resolverFactorial() {
		
		
		if (this.num1>=0 && this.num1<=10) {
			int resultadofactorial=1;
			while(this.num1 !=0) {
				resultadofactorial= resultadofactorial * this.num1;
				this.num1 --;
			}
			return resultadofactorial;
		}
		else {
			return 0;
		}
			
	}
	
}
