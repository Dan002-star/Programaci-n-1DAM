package ejercicio3;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		Integer num1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		Integer num2 = sc.nextInt();
		
		Integer x = num2 - (num1 % num2);
		
		if (num1 % num2 == 0) {
			System.out.println("Ya es un número múltiplo del segundo número.");
			
		} else {
			
			System.out.println("le falta " + x + " para ser múltiplo del segundo número: " + (num1 + x));

		}

		sc.close();
	}

}
