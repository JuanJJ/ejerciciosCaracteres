package ejerciciosCaracteres;

import java.util.Scanner;

public class Ejercicio3 {
	public Ejercicio3 () {
		super();
		
		String cadena="";
		int numero=0;
		boolean error=false;
		Scanner leer=new Scanner(System.in);
		
		do {
			System.out.println("introduce un numero entero");
			cadena=leer.nextLine();
			error=false;
			try {
				numero=Integer.parseInt(cadena);
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Introduzca un numero correcto");
				error=true;
			}
			
		
		
		} while (error!=false);
		
		System.out.println("El numero es: "+numero);
		
		
		
		
		
		
		
		
		
	}
	
}
