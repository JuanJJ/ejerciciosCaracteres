package ejerciciosCaracteres;

import java.util.Scanner;

public class Ejercicio2 {
	public Ejercicio2() {
		super();
		
		String cadena="";
		int espacio=0,conta=0;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Inserta una frase");
		cadena=leer.nextLine();
		
		for (int i = 0; i < cadena.length(); i++) {
			espacio=cadena.indexOf(' ', i);
			if (espacio<0) {
				espacio=cadena.length();
			}
			System.out.println(cadena.substring(i, espacio));
			if (espacio>0) {
				i=espacio;
			}

		}
		
		
		
		
		
		
	}
}
