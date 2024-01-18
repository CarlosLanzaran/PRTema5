package es.studium.ejemplosTema3;

import java.util.Scanner;

public class OrdenarInsercion {

	public static void main(String[] args) {

		final int TAM = 10;
		int[] tabla = new int[TAM];
		int i, j, aux;

		Scanner teclado = new Scanner(System.in);

		// Leer los números enteros y almacenarlos en la tabla
		for (i = 0; i < TAM; i++) {
			System.out.print("Dame un número entero: ");
			tabla[i] = teclado.nextInt();
		}

		// Ordenar la tabla utilizando el algoritmo de ordenación por inserción
		for (i = 0; i < TAM; i++) {
			j = i;
			aux = tabla[i];
			while (j > 0 && aux < tabla[j - 1]) {
				tabla[j] = tabla[j - 1];
				j--;
			}
			tabla[j] = aux;
		}

		// Mostrar la tabla ordenada
		System.out.println("La tabla ordenada queda así:");
		for (i = 0; i < TAM; i++) {
			System.out.print(tabla[i] + " ");
		}

		teclado.close();
	}

}
