package TemperaturaCalculo;

public class temperaturaCalculo {
	public static void main(String[] args) {
		
		double c,d,f,re,ra;
		c= 2.34;
		 f = c * 1.8 + 32;
	        d = c + 273.15;
	        ra = c * 1.8 + 32 + 459.67;
	        re = c * 0.8;
	        
	        System.out.println("A temperatura em Fahrenheit é: " + f);
	        System.out.println("A temperatura em Kelvin é: " + d);
	        System.out.println("A temperatura em Reaumur é: " + ra);
	        System.out.println("A temperatura em Rankine é: " + re);
		
	}

}
