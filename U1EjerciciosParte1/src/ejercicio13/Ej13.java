package ejercicio13;

import java.util.Scanner;
public class Ej13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("¿Has terminado tus deberes? ");
Boolean deberes = sc.nextBoolean();	

	System.out.println("¿Está lloviendo?");
Boolean lluvia = sc.nextBoolean();
	
	System.out.println("¿Tienes que ir a la biblioteca?");
Boolean biblioteca = sc.nextBoolean();
 

System.out.println("Deberes?-->" + lluvia);
System.out.println("Deberes?-->" + deberes);
System.out.println("Deberes?-->" + biblioteca);

Boolean resultado =(!lluvia && deberes) || biblioteca;
System.out.println(resultado);
	sc.close();
	}

	
}
