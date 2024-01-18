package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		String cadena = "";
		
		System.out.println("Dame una frase");
		cadena = teclado.nextLine();
		
		teclado.close();
		
		System.out.println("Longitud con espacios: " + contarcon(cadena));
		System.out.println("Longitud sin espacios: " + contarsin(cadena));
	}

	private static int contarcon(String cadena) {
		return cadena.length();
	}

	private static int contarsin(String cadena) {
		
		int contador = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i)!= ' ') {
				contador++;
			}
		}
		return contador;
	}

}
