package ejercicio11;
import java.util.Scanner;
public class Ej11 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int cant = 166;
	System.out.println("Introduce una cantidad de pesetas: ");	
	
	int ptas = sc.nextInt();
	int eur = ptas / cant;
	
	 
	
	System.out.println(ptas + " pesetas equivale a " + eur + " €");
	
	sc.close();	
	}
	
	

}
