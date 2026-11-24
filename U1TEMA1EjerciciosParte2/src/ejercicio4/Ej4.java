package ejercicio4;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un valor a: ");
		Integer a = sc.nextInt();
		
		System.out.println("Introduce un valor b: ");
		Integer b = sc.nextInt();
		
		System.out.println("Introduce un valor c: ");
		Integer c = sc.nextInt();
		
		System.out.println("Ahora introduce un valor x: ");
		Integer x = sc.nextInt();
		
		Integer y = a * (x*x) + b * x  + c; 
		
		
		System.out.println("El resultado de y será: " + y);
		sc.close();
	}
}
