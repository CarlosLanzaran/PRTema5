package es.studium.ejemplosTema3;

import java.util.Scanner;

public class Ej8_Tablas {

	public static void main(String[] args) {
		
		final int MAX = 10;

		int tabla[] = new int [MAX];

		Scanner teclado = new Scanner(System.in);

		int maximo, posicionMaximo;

		for (int i = 0; i < MAX; i++) {

			System.out.println("Indicar el valor del número " + i );

			tabla[i] = teclado.nextInt();
		}

		teclado.close();
		
		maximo = tabla[0];
		
		posicionMaximo = 0;

		for (int i = 0; i < MAX; i++) {

			if(tabla[i] > maximo) {

				maximo = tabla[i];
				
				posicionMaximo = i;
			}
		}
		
		System.out.println("El mácimo vale " + maximo);
		
		for(int i = 0; i < MAX; i++) {
			if(tabla[i] == maximo) {
				System.out.println("Está en " + i);
			}
		}
	}
}
