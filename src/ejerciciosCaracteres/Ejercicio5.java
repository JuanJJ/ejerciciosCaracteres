package ejerciciosCaracteres;

import java.util.Scanner;

public class Ejercicio5 {
	public Ejercicio5() {
		super();
		
		String contrase�a="";
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Inserta una contrase�a para saber si es segura(Solo caracteres imprimibles y sin espacios)");
		contrase�a=leer.nextLine();
		
		compruebacontrase�a(contrase�a);
		
		
	}
	//Metodo para comprobar la seguridad de la contrase�a
	private void compruebacontrase�a(String contrase�a) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		int acumayusculas=0, acuminusculas=0, acunumeros=0, acuespecial=0, charnopermitido=0;
		int caracter=0;
		boolean tama�omin=contrase�a.length()>=8;
		
		for (int i = 0; i < contrase�a.length(); i++) {
			caracter=contrase�a.charAt(i);
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
		boolean essegura=tama�omin&&(acumayusculas>=1)&&(acuminusculas>=1)&&(acunumeros>=1)&&(acuespecial>=1);
		
		if (charnopermitido>0) {
			System.out.println("Lo siento la contrase�a contiene caracteres no permitidos");
		} else if (essegura) {
			System.out.println("La contrase�a cumple los requisitos minimos de seguridad");
		} else {
			System.out.println("Lo siento la contrase�a no cumple los requisitos minimos de seguridad");
		}
		
		
		
	}

}
