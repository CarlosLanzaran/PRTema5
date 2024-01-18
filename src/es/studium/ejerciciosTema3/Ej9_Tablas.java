package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ej9_Tablas {

	public static void main(String[] args) {


		final int FILAS = 3;
		final int COLUMNAS = 4;


		char tabla[][] = new char [FILAS][COLUMNAS];

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < FILAS; i++) {

			for (int j = 0; j < COLUMNAS; j++) {

				System.out.println("Tabla ["+i+"]["+j+"]");
				tabla[i] [j] = teclado.nextLine().charAt(0);
			}
		}
		teclado.close();
		
		for (int i = 0; i < FILAS; i++) {

			for (int j = 0; j < COLUMNAS; j++) {

				System.out.print(tabla [i] [j] + " ");
			}
			System.out.println();
		}
	}
}
