package ejercicio6;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una distancia (milímetros): ");
		Integer mm = sc.nextInt();

		System.out.println("Introduce una distancia (centímetros): ");
		Integer cm = sc.nextInt();

		System.out.println("Introduce una distancia (metros): ");
		Integer m = sc.nextInt();

		Integer conv1 = mm % 100;
		Integer conv2 = m * 100;
		Integer suma = cm + conv1 + conv2;

		System.out.println("La longitud total es : " + suma + " cm");

		sc.close();
	}
}
