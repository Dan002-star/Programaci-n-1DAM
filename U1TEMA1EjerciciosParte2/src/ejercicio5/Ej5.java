package ejercicio5;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una cantidad de segundos: ");
		
		int totalseg = sc.nextInt();
		int horas = totalseg / 3600;
		int min = (totalseg % 3600) / 60;
		int seg = (totalseg % 3600) % 60;

		System.out
				.println("Tras una conversión, será: " + horas + " horas, " + min + " minutos y " + seg + " segundos.");

		
		sc.close();
	}

}
