package ejerciciosCaracteres;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		int opcion=0;
		Scanner leer=new Scanner(System.in);
		
		do {
			System.out.println("=================================================================");
			System.out.println("1.- Descomponer una frase o palabra en caracteres");
			System.out.println("2.- Descomponer una frase en palabras");
			System.out.println("3.- Pasar un numero de cadena a entero capturando excepcion");
			System.out.println("4.- Comprobar DNI correcto");
			System.out.println("5.- Comprobar que una contraseña sea segura");
			System.out.println("6.- Saber si una frase es palindroma");
			System.out.println("7.- Salir");
			System.out.println("=================================================================");
			opcion=leer.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("1.- Descomponer una frase o palabra en caracteres");
				Ejercicio1 ejer1=new Ejercicio1();
				break;
			case 2:
				System.out.println("2.- Descomponer una frase en palabras");
				Ejercicio2 ejer2=new Ejercicio2();
				break;
			case 3:
				System.out.println("3.- Pasar un numero de cadena a entero capturando excepcion");
				Ejercicio3 ejer3=new Ejercicio3();
				break;
			case 4:
				System.out.println("4.- Comprobar DNI correcto");
				Ejercicio4 ejer4=new Ejercicio4();
				break;
			case 5:
				System.out.println("5.- Comprobar que una contraseña sea segura");
				Ejercicio5 ejer5=new Ejercicio5();
				break;
			case 6:
				System.out.println("6.- Saber si una frase es palindroma");
				Ejercicio6 ejer6=new Ejercicio6();
				break;
			case 7:
				System.out.println("Saliendo");
				break;

			default:
				System.out.println("Opcion no valida");
				break;
			}
			
		} while (opcion!=7);
		
		
		
	}

}
