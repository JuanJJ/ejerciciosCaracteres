package ejerciciosCaracteres;

import java.util.Scanner;

public class Ejercicio1 {
	public Ejercicio1() {
		super();
		
		String cadena="";
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce una palabra o frase");
		cadena=leer.nextLine();
		
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		
		
		
		
	}

}
