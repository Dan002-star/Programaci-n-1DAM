package ejercicio2;

	import java.util.Scanner;

public class Ej2 {


		public static void main(String[] args) {
			
			int edad;
			Scanner sc = new Scanner(System.in);
				
			System.err.println("Introduce tu edad: ");
			
			 edad = sc.nextInt();
			
			 System.err.println("Tu edad será " + (edad + 1) + " el año próximo.");
		}


}
