package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		String frase = "";
		int posicion = 0;
		int longitud = 0;
		
		System.out.println("Dame una frase:");
		frase = teclado.nextLine();
		
		System.out.println("Dame una posición:");
		posicion = teclado.nextInt();
		
		
		System.out.println("Dame una longitud:");
		longitud = teclado.nextInt();
		
		teclado.close();
		
		subcadena(frase, posicion, longitud);
		
	}

	private static void subcadena(String frase, int posicion, int longitud) {
		
		for (int i = posicion; i <posicion + longitud; i++) {
			
			System.out.print(frase.charAt(i));
		}
				
	}



}
