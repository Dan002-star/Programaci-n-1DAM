package ejercicio3;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
	
	
	Scanner reader=new Scanner(System.in);
	
	int numero;
	System.err.println("Introduce el año actual: ");
	
	numero = reader.nextInt();

	int numero2;
	System.err.println("Introduce tu año de nacimiento: ");
	
	numero2= reader.nextInt();

	
	 System.err.println("Actualmente tienes " + (numero - numero2) + " año.");

	
	reader.close();
	
	}
	
	

}
