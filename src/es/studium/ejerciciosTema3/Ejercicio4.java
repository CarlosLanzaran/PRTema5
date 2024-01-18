package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
	String cadena1 = "";
	String cadena2 = "";
	
	System.out.println("Dame la primera cadena");
	cadena1 = teclado.nextLine();
	
	System.out.println("Dame la segunda cadena");
	cadena2 = teclado.nextLine();
	
	teclado.close();
	
	String cadenaFormateada = "Nuestra amig0 %s tiene %s años";

	System.out.println(String.format(cadenaFormateada, cadena1, cadena2));
	

	}

}
