package es.studium.ejemplosTema3;

import java.util.Scanner;

public class Ej7_Tablas {

	public static void main(String[] args) {

		final int MAX = 10;

		int tabla[] = new int [MAX];

		Scanner teclado = new Scanner(System.in);

		int suma = 0;

		int minimo, maximo;

		for (int i = 0; i < MAX; i++) {

			System.out.println("Indicar el valor del número " + i );

			tabla[i] = teclado.nextInt();
		}

		teclado.close();

		for (int i = 0; i < MAX; i++) {

			suma = suma + tabla[i];
		}

		System.out.println("La media vale " + ((float)suma/(float)MAX));

		maximo = tabla[0];

		minimo = tabla[0];

		for (int i = 0; i < MAX; i++) {

			if(tabla[i] > maximo) {

				maximo = tabla[i];

			}
			if(tabla[i] < minimo) {

				minimo = tabla[i];

			}
		}
		
		System.out.println("El mayor es " + maximo);
		System.out.println("El menor es " + minimo);
		
	}

}
