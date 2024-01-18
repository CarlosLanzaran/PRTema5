package es.studium.ejemplosTema3;

import java.util.Scanner;

public class Buscar {

	public static void main(String[] args) {

		final int TAM = 3;
		int[] tabla = new int[TAM];
		int i;
		boolean encontrado = false;
		int elemento;

		Scanner teclado = new Scanner(System.in);

		// Leer los números enteros y almacenarlos en la tabla
		for (i = 0; i < TAM; i++) {
			System.out.print("Dame un número entero: ");
			tabla[i] = teclado.nextInt();
		}

		// Leer el número a buscar
		System.out.print("Dame el número a buscar: ");
		elemento = teclado.nextInt();

		// Buscar el elemento en la tabla
		i = 0;
		while (!encontrado && i < TAM) {
			if (tabla[i] == elemento) {
				encontrado = true;
			} else {
				i++;
			}
		}

		// Mostrar el resultado
		if (encontrado) {
			System.out.println("El elemento se encontró en la posición " + i);
		} else {
			System.out.println("El elemento NO se ha encontrado");
		}

		teclado.close();

	}
}


