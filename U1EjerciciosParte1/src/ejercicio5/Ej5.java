package ejercicio5;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
		
	double radio;
	
	double longitud;
	
	double area;
		
		System.err.println("Introduce el radio: ");
		
   radio = reader.nextDouble();
   
   longitud = 2*Math.PI*radio;
   
   area = Math.PI * (radio*radio);
   
  
		System.err.println("El área de la circunferencia es: " + area + (" y su longitud es: " + longitud));
		
		
		
		
			   reader.close();
	}

}
