package ejercicio14;

import java.util.Scanner;
public class Ej14 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce las notas del 1º trimestre: ");
double nota1 = sc.nextDouble();	
	
System.out.println("Introduce las notas del 2º trimestre: ");
double nota2 = sc.nextDouble();	

System.out.println("Introduce las notas del 3º trimestre: ");
double nota3 = sc.nextDouble();	
	
int entero = (int)(nota1 + nota2 + nota3) / 3;

System.out.println("La media del curso en el boletín da: " + entero);

double decimal = (nota1 + nota2 + nota3) / 3; Math.round((decimal*100)/100);

System.out.println("La media en el expediento académico da:" + decimal);
	sc.close();
	
	}
	
	
	
}
