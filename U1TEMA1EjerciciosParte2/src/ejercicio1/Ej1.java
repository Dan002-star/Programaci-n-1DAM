package ejercicio1;
import java.util.Scanner;
public class Ej1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce un número: ");
	Double x = sc.nextDouble();
	
	
	Double suelo = Math.floor(x);
	Double techo = Math.ceil(x);
	
	Double solution = ( x + 0.5 > techo ? techo: suelo );
	
	Integer z = solution.intValue();
	
	System.out.println("Redondeado al entero más proximo es: " + z);

	
	sc.close();
	}
	
	
	
}
