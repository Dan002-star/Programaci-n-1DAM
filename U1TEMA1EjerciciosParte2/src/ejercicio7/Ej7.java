package ejercicio7;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Una empresa que gestiona un parque acuático te solicita una aplicación que
		// les ayude a calcular el
		// importe que hay que cobrar en la taquilla por la compra de una serie de
		// entradas (cuyo número será introducido por el usuario).
		// Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de adultos,
		// que cuestan 20€. En el caso de que el importe total
		// sea igual o superior a 100€, se aplicará automáticamente un bono descuento
		// del 5%.

		System.out.println("Introduzca la cantidad de entradas infantiles: ");
		Integer cant1 = sc.nextInt();

		System.out.println("Introduzca la cantidad de entradas adultas: ");
		Integer cant2 = sc.nextInt();

		Double infant = 15.50;
		Double adult = 20.00;

		Double importe = cant1 * infant + cant2 * adult;

		if (importe >=100) {
			System.out.println("El importe junto al descuento será: " + (importe / 00.5) + " €");
		} else {
			System.out.println("El importe será: " + importe + " €");
		}
	
		sc.close();
	}
}
