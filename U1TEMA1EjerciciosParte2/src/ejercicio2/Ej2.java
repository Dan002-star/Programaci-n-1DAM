package ejercicio2;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Introduce un número: ");

		Integer num = sc.nextInt();
		Integer y = 7;
		Integer x = 7 - (num % 7);
		
		if (num % y == 0) {
			System.out.println("Ya es un número múltiplo de 7");
			
		} else {
			
			System.out.println("le falta " + x + " para ser múltiplo de 7: " + (num + x));
		}

		sc.close();
	}

}
