package ejercicio8;

import java.util.Scanner;

public class Ej8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce una longitud (metros): ");
	Double m = sc.nextDouble();
	
	Double cm = m *100; 
	
	double resultado = (double) Math.round(cm); 
			
		System.out.println("La longitud es " + resultado + " cm");
	
	sc.close();
}
}
