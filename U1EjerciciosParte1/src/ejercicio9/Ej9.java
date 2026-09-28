package ejercicio9;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Dame una edad: ");
			int x =sc.nextInt();
		System.err.println("La edad es " + x );
	Boolean b = x >=18;
	System.err.println("Mayor de edad: " + b);
	
	sc.close();
}
	
	
	
	
	 
}
