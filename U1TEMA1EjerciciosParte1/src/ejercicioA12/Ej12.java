package ejercicioA12;

import java.util.Scanner;

public class Ej12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mank = 2.35;
		double perk = 1.95;
		System.out.println("Introduce la cantidad de manzanas: ");
		double man = sc.nextInt();

		System.out.println("Introduce la cantidad de peras: ");
		double per = sc.nextInt();

		double resultado = (man * mank) + (per * perk) * 365;

		System.out.println("En un año obtendras " + resultado + " € en fruta.");
		sc.close();
	}

}