package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class ParteDerechaCadena {

	public static String obtenerParteDerecha(String cadena, int longitudDesdeFinal) {

		int longitudCadena = cadena.length();

		// Calcular el índice de inicio para la parte derecha de la cadena
		int inicio = longitudCadena - longitudDesdeFinal;

		// Obtener la parte derecha de la cadena
		String parteDerecha = cadena.substring(inicio);
		return parteDerecha;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa una cadena: ");
		String cadena = scanner.nextLine();

		System.out.print("Ingresa la longitud desde el final: ");
		int longitudDesdeFinal = scanner.nextInt();

		String parteDerecha = obtenerParteDerecha(cadena, longitudDesdeFinal);
		System.out.println("La parte derecha de la cadena es: " + parteDerecha);

		scanner.close();
	}
}
