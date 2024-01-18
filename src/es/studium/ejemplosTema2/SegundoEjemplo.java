package es.studium.ejemplosTema2;

import java.util.Scanner;

public class SegundoEjemplo {

	public static void main(String[] args) {

		String nombre = null;
		
		String apellido = null;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu nombre:");
		
		nombre = teclado.nextLine();
				
		System.out.println("Dime tu apellido:");
				
		apellido = teclado.nextLine();
		
		System.out.println("Hola " + nombre + " " + apellido);
		
		teclado.close();
		
	}

}
