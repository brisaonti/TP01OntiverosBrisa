package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

public class puntowhile{
    private int num1;
    public puntowhile() {
   		// TODO Auto-generated constructor stub
   	}
	public puntowhile(int num1) {
		super();
		this.num1 = num1;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public String contarFor() {
		
		String Sequence ="";
		
		for (int i = 320; i >= 160; --i) {
			
			Sequence += Integer.toString(i) + " ";
			i-=19;
		}
		return Sequence;
	}
	public String contarWhile() {
		
		String Sequence ="";
		int i = 320;
		while ( i >= 160) {
			
			Sequence += Integer.toString(i) + " ";
			i-=20;
		}
		return Sequence;
	}
	public String contarDoWhile()
	{
		String Sequence ="";
		int i = 320;
		do{
			
			Sequence += Integer.toString(i) + " ";
			i-=20;
		}while ( i >= 160);
		return Sequence;
	}
}