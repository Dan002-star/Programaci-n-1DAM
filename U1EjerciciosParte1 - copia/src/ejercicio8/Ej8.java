package ejercicio8;

import java.util.Scanner;

public class Ej8 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
			String nombre;
		nombre = sc.next();
		System.out.println("Introduce tu edad: ");
			String edad;
		edad = sc.next();
		

		
		
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!.");
		
		sc.close();
		
		}

	}