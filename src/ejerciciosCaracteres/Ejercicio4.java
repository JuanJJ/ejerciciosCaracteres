package ejerciciosCaracteres;

import java.util.Scanner;

public class Ejercicio4 {
	public Ejercicio4() {
		super();
		
		String letradni="TRWAGMYFPDXBNJZSQVHLCKE";
		String dni="";
		boolean dnicorrecto=false;
		Scanner leer=new Scanner(System.in);
		do {
			System.out.println("Introduce un DNI para comprobar que sea correcto");
			dni=leer.nextLine();
		
			dnicorrecto=compruebadni(dni);
			
			compruebaletra(dni, letradni);
			System.out.println();
			
			
		} while (dnicorrecto!=true);
		
		
		
		
		
		
		
	}

	private void compruebaletra(String dni, String letradni) {
		// TODO Apéndice de método generado automáticamente
		int resto=0;
		int numdni=Integer.parseInt(dni.substring(0, 8));
		resto=numdni%23;
		char caracterdni=letradni.charAt(resto);
		boolean letracorrecta=caracterdni==Character.toUpperCase(dni.charAt(8));
		if (letracorrecta) {
			System.out.println("El dni "+dni+" tiene la letra correcta "+caracterdni);
		} else {
			System.out.println("Al dni "+dni+" le corresponde la letra "+caracterdni);
		}
		
	}

	//comprueba si el dni tiene el formato correcto
	private boolean compruebadni(String dni) {
		// TODO Apéndice de método generado automáticamente
		boolean dnivalido=true;
		
		boolean tamaño=dni.length()==9;
		
		try {
			int numdni=Integer.parseInt(dni.substring(0, 8));
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("El DNI introducido es incorrecto");
			dnivalido=false;
			return dnivalido;
		}
		int numletra=dni.charAt(8);
		boolean letra=(numletra>=65&&numletra<=90)||(numletra>=97&&numletra<=122);
		
		dnivalido=tamaño&&letra;
		if (dnivalido==false) {
			System.out.println("El DNI introducido es incorrecto");
		}
		
		return dnivalido;
	}
}
