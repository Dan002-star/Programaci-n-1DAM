package ejercicio4;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double nota1;
		System.err.println("Introduce la primera nota: ");

		nota1 = reader.nextDouble();

		double nota2;
		System.err.println("Introduce la segunda nota: ");

		nota2 = reader.nextDouble();

		double media =(nota1 + nota2) / 2.0;
		System.err.println("Tienes una media de: " + media);

		reader.close();

	}

}