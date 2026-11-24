package ejercicioA10;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una año: ");

		int anyo = sc.nextInt();

		int siglo = (anyo - 1) / 100 + 1;

		System.out.println("El siglo es: " + siglo);

		sc.close();
	}
}
