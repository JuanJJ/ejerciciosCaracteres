package ejerciciosCaracteres;

import java.util.Scanner;

public class Ejercicio5 {
	public Ejercicio5() {
		super();
		
		String contraseña="";
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Inserta una contraseña para saber si es segura(Solo caracteres imprimibles y sin espacios)");
		contraseña=leer.nextLine();
		
		compruebacontraseña(contraseña);
		
		
	}
	//Metodo para comprobar la seguridad de la contraseña
	private void compruebacontraseña(String contraseña) {
		// TODO Apéndice de método generado automáticamente
		int acumayusculas=0, acuminusculas=0, acunumeros=0, acuespecial=0, charnopermitido=0;
		int caracter=0;
		boolean tamañomin=contraseña.length()>=8;
		
		for (int i = 0; i < contraseña.length(); i++) {
			caracter=contraseña.charAt(i);
			boolean caracternopermitido=caracter<=32||caracter>=127;
			boolean esmayuscula=caracter>=65&&caracter<=90;
			boolean esminuscula=caracter>=97&&caracter<=122;
			boolean esnumero=caracter>=48&&caracter<=57;
			boolean esespecial=(caracter>=33&&caracter<=47)||(caracter>=58&&caracter<=64)||(caracter>=91&&caracter<=96)||(caracter>=123&&caracter<=126);
			if (caracternopermitido) {
				charnopermitido++;
				break;
			}
			if (esmayuscula) {
				acumayusculas++;
			}
			if (esminuscula) {
				acuminusculas++;
			}
			if (esnumero) {
				acunumeros++;
			}
			if (esespecial) {
				acuespecial++;
			}
		}
		boolean essegura=tamañomin&&(acumayusculas>=1)&&(acuminusculas>=1)&&(acunumeros>=1)&&(acuespecial>=1);
		
		if (charnopermitido>0) {
			System.out.println("Lo siento la contraseña contiene caracteres no permitidos");
		} else if (essegura) {
			System.out.println("La contraseña cumple los requisitos minimos de seguridad");
		} else {
			System.out.println("Lo siento la contraseña no cumple los requisitos minimos de seguridad");
		}
		
		
		
	}

}
