package ejerciciosCaracteres;

import java.util.Scanner;

public class Ejercicio6 {
	public Ejercicio6() {
		super();
		
		String frase="";
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce una frase para saber si es palindroma");
		frase=leer.nextLine();
		
		comprobarpalindromo(frase);
		
		
	}

	private void comprobarpalindromo(String frase) {
		// TODO Apéndice de método generado automáticamente
		//quitar espacios de la frase
		String sinespacios="",palindroma="";
		char caracter=' ';
		boolean espalindroma=false;
		
		for (int i = 0; i < frase.length(); i++) {
			caracter=frase.charAt(i);
			if (caracter!=' ') {
				sinespacios+=caracter;
			}
		}
		System.out.println(sinespacios);
		
		//dar vuelta a la frase
		for (int i = 0; i < sinespacios.length(); i++) {
			caracter=sinespacios.charAt(i);
			palindroma=caracter+palindroma;
		}
		System.out.println(palindroma);
		
		espalindroma=sinespacios.equals(palindroma);
		if (espalindroma) {
			System.out.println("La frase es palindroma");
		} else {
			System.out.println("La frase no es palindroma");
		}
		
	}

}
