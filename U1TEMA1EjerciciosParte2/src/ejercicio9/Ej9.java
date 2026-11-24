package ejercicio9;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Introduce un número de un problema: ");
		int numProblema = sc.nextInt();

		int volumen = numProblema / 100;

		System.out.println("Se encuentra en el volumen " + volumen);

		sc.close();
	}

}
