package ejercicio6;

import java.util.Scanner;

public class Ej6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Introduce el primer número: ");
		
		int num1 = sc.nextInt();
		
		System.err.println("Introduce el segundo número: ");
	
		int num2 = sc.nextInt();
		
		int respuesta1 = num1 + num2;
		int respuesta2 = num1 - num2;
		int respuesta3 = num1 * num2;
		
		System.out.println(num1 + "+" + num2 + "=");
		System.out.println(respuesta1);
		
		System.out.println(num1 + "-" + num2 + "=");
		System.out.println(respuesta2);
		
		System.out.println(num1 + "*" + num2 + "=");
		System.out.println(respuesta3);
		sc.close();
		
	}
	
	
	

}
