package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String frase = "";
		int longitud;

		System.out.println("Dame una frase:");
		frase = teclado.nextLine();


		System.out.println("Dame una longitud:");
		longitud = teclado.nextInt();

		teclado.close();

		subcadena(frase, longitud);

	}

	private static void subcadena(String frase, int longitud) {

		for (int i = (frase.length() - longitud); i < frase.length(); i++) {

			System.out.print(frase.charAt(i));
		}

		for (int i = frase.length() - 1; i >= frase.length() - longitud; i--) {

			System.out.print(frase.charAt(i));
		}

	}



}