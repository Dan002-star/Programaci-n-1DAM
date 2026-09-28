package ejercicio15;

import java.util.Scanner;

public class Ej15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double IVA = 21.0;
	
	System.out.println("Introduce un precio: ");
	double precio = sc.nextDouble();
	
	double resultado = precio * (IVA/100);
	double final1 = precio + resultado; 
	
	final1=Math.round(final1 * 100.0) / 100.0;
	
	System.out.println("El valor introducido con IVA aplicado será: " + final1 + " €");
	sc.close();
}
	
	
	
}
