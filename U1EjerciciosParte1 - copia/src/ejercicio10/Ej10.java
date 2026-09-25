package ejercicio10;
import java.util.Scanner;
public class Ej10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce un número: ");
	
	int num = sc.nextInt();
	Boolean par = (num % 2 ==0);
	
		System.out.println("El número es par: " + par);

	sc.close();
	}
	
	
}
