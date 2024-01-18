package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class SubcadenaEjemplo {

	public static String obtenerSubcadena(String cadena, int posicion, int longitud) {	

		// Calcular el índice de inicio y final de la subcadena
		int inicio = posicion;
		int fin = Math.min(posicion + longitud, cadena.length());

		// Obtener la subcadena
		String subcadena = cadena.substring(inicio, fin);
		return subcadena;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa una cadena: ");
		String cadena = scanner.nextLine();

		System.out.print("Ingresa la posición inicial: ");
		int posicion = scanner.nextInt();

		System.out.print("Ingresa la longitud de la subcadena: ");
		int longitud = scanner.nextInt();

		String subcadena = obtenerSubcadena(cadena, posicion, longitud);
		System.out.println("La subcadena es: " + subcadena);

		scanner.close();
	}
}
